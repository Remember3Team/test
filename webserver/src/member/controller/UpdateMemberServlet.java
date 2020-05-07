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
 * Servlet implementation class UpdateMemberServlet
 */
@WebServlet("/update.me") 
public class UpdateMemberServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateMemberServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//사용자로부터 입력받은 값을 가지고 쿼리문을 구성해보자
		//사용자가 입력한 한글이 깨지지 않게
		request.setCharacterEncoding("UTF-8");
		//비번은 수정 페이지에 뜨지도 않게 처리했으므로 생략됨
		
		String userId = request.getParameter("userId");
		String userName = request.getParameter("userName");
		String phone = request.getParameter("phone");
		String email = request.getParameter("email");
		String address = request.getParameter("address");
		
		String[] irr = request.getParameterValues("interest");
		String interest="";
		
		//한 컬럼 값에 취미들을 넣기 위해서 ,를 기준으로 String[] 를 하나의 String으로 만들어 준다.
		//전환(String에서 제공하는 join메소드)
		if(irr!=null) {
			interest = String.join(",", irr); //매개변수로 넘어온 녀석들을 ,를 이용해 이어준다.
		}
		Member m = new Member(userId, userName, phone, email, address, interest);
		int result = new MemberService().updateMember(m);
		/////////////////////////////////////////////////////////////////////////
		System.out.println("SERVLET = result>"+result);

		RequestDispatcher view = null;
		if(result>0) {
			//현재 로그인 한 사람의 session도 수정하자
			HttpSession session = request.getSession();
			session.setAttribute("loginUser", m);
			
			System.out.println("회원정보 수정 Sevlet에서 update한 결과 : "+result);
			view = request.getRequestDispatcher("views/common/successPage.jsp");
			request.setAttribute("msg", "성공적으로 회원정보를 수정했습니다.");
		}
		else {
			view = request.getRequestDispatcher("views/common/errorPage.jsp");
			request.setAttribute("msg", "성공적으로 회원정보를 수정했습니다.");
			
		}
		view.forward(request,response);
		//수정확인이 끝나면 momberView.jsp를 가서 회원 탈퇴 진행 하자
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
