package member.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import member.model.service.MemberService;
import member.model.vo.Member;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login.me")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/**
		 * <request와 response>
		 * 
		 * request : 서버에 요청하는 모든 정보들에 대해 보관
		 * response : 서비스를 요청한 클라이언트와 ip / url 에 대해 보관
		 * 
		 * --> 쌍으로 서버를 왔다 갔다 하면서 클라이언트에 정확한 정보 제공
		 * 
		 * 
		 * <post와 get방식의 차이>
		 * request와 response는 둘 다 head와 body로 나뉨
		 * post : body에 기록되서 전달(url에 보이지 않음)
		 * get  : head에 기록되서 전달(url에 보임) (form태그에서 userId=?&&userPwd=?.. 이런거)
		 * 
		 * 
		 * <객체를 담아둘 수 있는 객체 4가지(scope(공유 범위)가 좁은 순위)>
		 * 1. page: 자기 자신 페이지에서만 쓸 수 있다.(해당 jsp파일 안에서만 사용 가능)
		 * 2. request: 전달 받은 대상의 jsp만 꺼내 쓸 수 있다. (서비스 요청 및 응답 시에만 사용 가능)
		 * 3. session: 웹 브라우저 유지 및 해당 시간 동안 쓸 수 있다. (jsp에서만 가능)
		 * 4. application: 톰캣이 유지되는 한 모든 곳에서 쓸 수 있다.(jsp, servlet, java 모두에서 쓸 수 있다.)
		 * 
		 * -1,4번은 잘 쓰지 않음
		 * 
		 */
		String userId = request.getParameter("userId");
		String userPwd = request.getParameter("userPwd");
		//사용자가 입력한 아이디와 PW값을 뒷단으로 보내보자.
		
		Member member = new Member(userId, userPwd);
		
		System.out.println(member);
		
		Member loginMember = new MemberService().loginMember(member);
		
		System.out.println("LoginMember가 Servlet까지 도착했니?"+loginMember);
		if(loginMember != null) {
			//로그인이 생공했을 경우
			HttpSession session = request.getSession(); //세션 객체 받아보자
			//(기본 30분 유지, 독립적인 공간, 모든 페이지에서 session의 공간 이용 가능)
			
			/**
			 * 우리가 원하는 시간 만큼 session객체 유지
			 */
			session.setMaxInactiveInterval(10000); //초(s)단위로
			session.setAttribute("loginUser", loginMember); //Attribute라는 바구니 담자(Key와 Value를 이용)
			
			response.sendRedirect("index.jsp"); 
			//페이지 전환해주는 것 (index 페이지로 돌아가라)
			//Default는 Web(Context root) 그렇기 때문에 index.jsp만 적어준다
			
		}else {
			//로그인이 실패했을 경우
			request.setAttribute("msg", "로그인 실패");	//속성에 메세지 객체를 담아준다.
			
			RequestDispatcher view = request.getRequestDispatcher("views/common/errorPage.jsp"); //페이지를 정했다
			
			//이제 포워딩을 하면 됨
			view.forward(request, response);
			//requestDispatcher안에 제공하는 forward함수, response는 404에러같은 정보를 담고 있고, request는 사용자 입력값에 대한 결과물을 담는 공간
			//view = 페이지에 뿌려줄 정보, request = 그 안에 들어가는 메세지
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
