/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.54
 * Generated at: 2020-05-06 04:29:02 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views.member;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import member.model.vo.Member;
import member.model.vo.Member;

public final class memberView_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/views/member/../common/menubar.jsp", Long.valueOf(1588725556765L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("member.model.vo.Member");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');

	Member mem = (Member)request.getAttribute("member");
	String userId = mem.getUserId();
	String userPwd = mem.getUserPwd();
	String userName = mem.getUserName();
	String phone = mem.getPhone() != null ? mem.getPhone():"";
	String email = mem.getEmail() != null ? mem.getEmail():"";
	String address = mem.getAddress() != null ? mem.getAddress():"";
	
	String[] checkedInterest = new String[6];
	
	if(mem.getInterest()!=null){
		String[] interests = mem.getInterest().split(",");
		
		for(int i = 0;i<interests.length;i++){
			switch(interests[i]){
				case "운동":checkedInterest[0]="checked"; break;
				case "등산":checkedInterest[1]="checked"; break;
				case "낚시":checkedInterest[2]="checked"; break;
				case "게임":checkedInterest[3]="checked"; break;
				case "기타":checkedInterest[4]="checked"; break;
			}
		}
	}
	

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<style>\r\n");
      out.write("   .outer{\r\n");
      out.write("      width:600px;\r\n");
      out.write("      height:500px;\r\n");
      out.write("      background:black;\r\n");
      out.write("      color:white;\r\n");
      out.write("      margin-left:auto;\r\n");
      out.write("      margin-right:auto;\r\n");
      out.write("      margin-top:50px;\r\n");
      out.write("   }\r\n");
      out.write("   \r\n");
      out.write("   .outer label, .outer td{\r\n");
      out.write("      color:white;\r\n");
      out.write("   }\r\n");
      out.write("   \r\n");
      out.write("   input{\r\n");
      out.write("      margin-top:2px;\r\n");
      out.write("   }\r\n");
      out.write("   \r\n");
      out.write("   #idCheck, #goMain, #updateBtn, #deleteBtn {\r\n");
      out.write("      background:orangered;\r\n");
      out.write("      border-radius:5px;\r\n");
      out.write("      width:80px;\r\n");
      out.write("      height:25px;\r\n");
      out.write("      text-align:center;\r\n");
      out.write("   }\r\n");
      out.write("   \r\n");
      out.write("   #idCheck:hover, #updateBtn:hover, #goMain:hover, #deleteBtn:hover {\r\n");
      out.write("      cursor:pointer;\r\n");
      out.write("   }\r\n");
      out.write("   td {\r\n");
      out.write("      text-align:right;\r\n");
      out.write("   }\r\n");
      out.write("   #updateBtn, #deleteBtn {\r\n");
      out.write("      background:yellowgreen;\r\n");
      out.write("   }\r\n");
      out.write("   #updateBtn, #goMain, #deleteBtn {\r\n");
      out.write("      display:inline-block;\r\n");
      out.write("   }\r\n");
      out.write("</style>\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("   ");
      out.write('\r');
      out.write('\n');

	Member loginUser = (Member)session.getAttribute("loginUser");
//import작업은 지시자 태그에 따로 해줘야 한다.
//getAttribute의 반환형은 object이므로 다운캐스팅이 필요

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("\t<script  src=\"http://code.jquery.com/jquery-latest.min.js\"></script>\r\n");
      out.write("\t<script>\r\n");
      out.write("\t/* \t$(function(){\r\n");
      out.write("\t\t\talert(\"alert TEst\");\r\n");
      out.write("\t\t}); */\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tfunction validate(){\r\n");
      out.write("\t\t\t//로그인 시 아이디를 입력하지 않았다면(띄어쓰기만 입력해도 인정 X ->trim())\r\n");
      out.write("\t\t\tif($(\"#userId\").val().trim().length==0){\r\n");
      out.write("\t\t\t\talert(\"아이디를 입력하세요\");\r\n");
      out.write("\t\t\t\t$(\"#userId\").focus();\r\n");
      out.write("\t\t\t\treturn false;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t//비밀번호를 입력하지 않았을 때\r\n");
      out.write("\t\t\tif($(\"#userPwd\").val().trim().length==0){\r\n");
      out.write("\t\t\t\talert(\"비밀번호를 입력하세요\");\r\n");
      out.write("\t\t\t\t$(\"#userPwd\").focus();\r\n");
      out.write("\r\n");
      out.write("\t\t\t\treturn false;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\treturn true;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t</script>\r\n");
      out.write("\t<style>\r\n");
      out.write("\t\tbody{\r\n");
      out.write("\t\t\tbackground:url('");
      out.print(request.getContextPath());
      out.write("/image/flower1.PNG') no-repeat;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t#LoginBtn input, #memberJoinBtn, #logoutBtn, #myPage{\r\n");
      out.write("\t\t\tdisplay:inline-block;\r\n");
      out.write("\t\t\tvertical-align:middle;\r\n");
      out.write("\t\t\ttext-align:center;\r\n");
      out.write("\t\t\tbackground:orangered;\r\n");
      out.write("\t\t\tcolor:white;\r\n");
      out.write("\t\t\theight:25px;\r\n");
      out.write("\t\t\twidth:100px;\r\n");
      out.write("\t\t\tborder-radius:5px;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t#memberJoinBtn{\r\n");
      out.write("\t\t\tbackground:yellowgreen;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t#loginBtn:hover, #changeInfo:hover, #logoutBtn:hover,\r\n");
      out.write("\t\t#memberJoinBtn:hover, #myPage:hover{\r\n");
      out.write("\t\t\tcursor:pointer;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t.LoginArea > form, #userInfo{\r\n");
      out.write("\t\t\tfloat:right;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t#logout, #mypage{\r\n");
      out.write("\t\t\tbackground:orangered;\r\n");
      out.write("\t\t\tcolor:white;\r\n");
      out.write("\t\t\ttext-decoration:none;\r\n");
      out.write("\t\t\tborder-radius:5px;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t#myPage {\r\n");
      out.write("      background:yellowgreen;\r\n");
      out.write("   }\r\n");
      out.write("   \r\n");
      out.write("   .wrap {\r\n");
      out.write("      background:black;\r\n");
      out.write("      width:100%;\r\n");
      out.write("      height:50px;\r\n");
      out.write("   }\r\n");
      out.write("   .menu {\r\n");
      out.write("      background:black;\r\n");
      out.write("      color:white;\r\n");
      out.write("      text-align:center;\r\n");
      out.write("      vertical-align:middle;\r\n");
      out.write("      width:150px;\r\n");
      out.write("      height:50px;\r\n");
      out.write("      display:table-cell;\r\n");
      out.write("   }\r\n");
      out.write("   .nav {\r\n");
      out.write("      width:600px;\r\n");
      out.write("      margin-left:auto;\r\n");
      out.write("      margin-right:auto;\r\n");
      out.write("   }\r\n");
      out.write("   .menu:hover {\r\n");
      out.write("      background:darkgray;\r\n");
      out.write("      color:orangered;\r\n");
      out.write("      font-weight:bold;\r\n");
      out.write("      cursor:pointer;\r\n");
      out.write("   }\r\n");
      out.write("\t</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<h1 align=\"center\">Welcome JSP world!</h1>\r\n");
      out.write("\t<div class=\"LoginArea\">\r\n");
      out.write("\t<!-- 2. 로그인이 되었는지 확인하는 자바코드 -->\r\n");
      out.write("\t");

	if(loginUser==null){
		
	
      out.write("\r\n");
      out.write("\t<!--1.  로그인 관련 폼 만들기 -->\r\n");
      out.write("\t\t<form method=\"get\" action=\"");
      out.print(request.getContextPath());
      out.write("/login.me\" onsubmit=\"return validate();\">\r\n");
      out.write("\t\t<!-- form 태그의 onsubmit 속성 return validate가 true인지 false인지 에 따라 submit을 할지말지 결정하는 요소 -->\r\n");
      out.write("\t\t\t<table>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td><label>ID: </label><td>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"text\" name=\"userId\" id=\"userId\"></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td><label>PW: </label><td>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"password\" name=\"userPwd\" id=\"userPwd\"></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td colspan=\"2\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"checkbox\" name=\"saveId\" id=\"saveId\">&nbsp;\r\n");
      out.write("\t\t\t\t\t\t<label for=\"saveId\">아이디 저장</label>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t\t<div class=\"btns\" align=\"center\">\r\n");
      out.write("\t\t\t\t<div id=\"memberJoinBtn\" onclick=\"memberJoin();\">회원가입</div>\r\n");
      out.write("\t\t\t\t<div id=\"LoginBtn\"><input type=\"submit\" value=\"로그인\"></div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t");
}else{ 
      out.write("\r\n");
      out.write("\t\t\t<div id = \"userInfo\">\r\n");
      out.write("\t\t\t\t<label>");
      out.print(loginUser.getUserName() );
      out.write("님 환영합니다.</label>\r\n");
      out.write("\t\t\t\t<div class=\"btns\" align=\"right\">\r\n");
      out.write("\t\t\t\t\t<div id=\"myPage\" onclick=\"location.href='/webs/myPage.me?userId=");
      out.print(loginUser.getUserId());
      out.write("'\">정보수정</div>\r\n");
      out.write("\t\t\t\t\t<!-- loginUser의 id값을 넘기겠다. -->\r\n");
      out.write("\t\t\t\t\t<div id=\"logoutBtn\" onclick=\"logout();\">로그아웃</div>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t");
} 
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<br clear=\"both\"> <!-- menubar 영역 표시 밑에 어떤 데이터를 불러와도 구분 가능하도록 (겹침없이) -->\r\n");
      out.write("\t<script>\r\n");
      out.write("\t\tfunction logout(){\r\n");
      out.write("\t\t\tlocation.href=\"");
      out.print(request.getContextPath());
      out.write("/logout.me\";\r\n");
      out.write("\t\t\t//페이지를 넘기는 방법 중 location의 href속성을 사용하면 좋다\r\n");
      out.write("\t\t\t//location.href는 해당 경로로 이동하기 위한 속성\r\n");
      out.write("\t\t\t//form태그가 아닌 단순히 넘어가길 원하는 Servlet으로 넘어가기 위함\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tfunction memberJoin(){\r\n");
      out.write("\t\t\tlocation.href=\"");
      out.print(request.getContextPath());
      out.write("/views/member/memberjoinForm.jsp\";\r\n");
      out.write("\t\t}\r\n");
      out.write("\t</script>\r\n");
      out.write("\t\r\n");
      out.write("\t<br clear=\"both\">\r\n");
      out.write("\t<br>\r\n");
      out.write("\t\r\n");
      out.write("\t<div class=\"wrap\">\r\n");
      out.write("\t\t<div class=\"nav\">\r\n");
      out.write("\t\t\t<div class=\"menu\" onclick=\"goHome();\">HOME</div>\r\n");
      out.write("\t\t\t<div class=\"menu\" onclick=\"goNotice();\">공지사항</div>\r\n");
      out.write("\t\t\t<div class=\"menu\" onclick=\"goBoard();\">게시판</div>\r\n");
      out.write("\t\t\t<div class=\"menu\" onclick=\"goThumbnail();\">사진게시판</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<script>\r\n");
      out.write("\t\tfunction goHome(){\r\n");
      out.write("\t\t\tlocation.href=\"");
      out.print(request.getContextPath());
      out.write("/index.jsp\";\r\n");
      out.write("\t\t}\r\n");
      out.write("\t</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("   \r\n");
      out.write("   <div class=\"outer\">\r\n");
      out.write("      <br>\r\n");
      out.write("      \r\n");
      out.write("      <h2 align=\"center\">회원 정보 수정</h2>\r\n");
      out.write("      \r\n");
      out.write("      <!-- memberJoinForm에 있는 table를 복사할 것! -->\r\n");
      out.write("      <!-- 각각의 input에 value값 추가 -->\r\n");
      out.write("      <form id=\"updateForm\" action=\"");
      out.print( request.getContextPath() );
      out.write("/update.me\" method=\"post\">\r\n");
      out.write("         <table>\r\n");
      out.write("            <tr>\r\n");
      out.write("               <td width=\"200px\">* 아이디</td>\r\n");
      out.write("               <td><input type=\"text\" maxlength=\"13\" name=\"userId\" value=\"");
      out.print( userId );
      out.write("\" readonly></td>\r\n");
      out.write("               <!-- readOnly하면 수정을 하지 못한다. -->\r\n");
      out.write("               <!-- <td width=\"200px\"><div id=\"idCheck\">중복확인</div></td> -->\r\n");
      out.write("            </tr>\r\n");
      out.write("            <!-- <tr>\r\n");
      out.write("               <td>* 비밀번호</td>\r\n");
      out.write("               <td><input type=\"password\" maxlength=\"13\" name=\"userPwd\" required></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("               <td>* 비밀번호 확인</td>\r\n");
      out.write("               <td><input type=\"password\" maxlength=\"13\" name=\"userPwd2\" required></td>\r\n");
      out.write("               <td><label id=\"pwdResult\"></label></td>\r\n");
      out.write("            </tr> -->\r\n");
      out.write("            <tr>\r\n");
      out.write("               <td>* 이름</td>\r\n");
      out.write("               <td><input type=\"text\" maxlength=\"5\" name=\"userName\" required value=\"");
      out.print( userName );
      out.write("\"></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("               <td>연락처</td>\r\n");
      out.write("               <td>\r\n");
      out.write("                  <input type=\"tel\" maxlength=\"11\" name=\"phone\" placeholder=\"(-없이)01012345678\" value=\"");
      out.print( phone );
      out.write("\">\r\n");
      out.write("               </td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("               <td>이메일</td>\r\n");
      out.write("               <td><input type=\"email\" name=\"email\" value=\"");
      out.print( email );
      out.write("\"></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("               <td>주소</td>\r\n");
      out.write("               <td><input type=\"text\" name=\"address\" value=\"");
      out.print( address );
      out.write("\"></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("               <td>관심분야</td>\r\n");
      out.write("               <td>\r\n");
      out.write("                  <input type=\"checkbox\" id=\"sports\" name=\"interest\" value=\"운동\" ");
      out.print( checkedInterest[0] );
      out.write(">\r\n");
      out.write("                  <label for=\"sports\">운동</label>\r\n");
      out.write("                  <input type=\"checkbox\" id=\"climbing\" name=\"interest\" value=\"등산\" ");
      out.print( checkedInterest[1] );
      out.write(">\r\n");
      out.write("                  <label for=\"climbing\">등산</label>\r\n");
      out.write("                  <input type=\"checkbox\" id=\"fishing\" name=\"interest\" value=\"낚시\" ");
      out.print( checkedInterest[2] );
      out.write(">\r\n");
      out.write("                  <label for=\"fishing\">낚시</label> <br>\r\n");
      out.write("                  <input type=\"checkbox\" id=\"cooking\" name=\"interest\" value=\"요리\" ");
      out.print( checkedInterest[3] );
      out.write(">\r\n");
      out.write("                  <label for=\"cooking\">요리</label>\r\n");
      out.write("                  <input type=\"checkbox\" id=\"game\" name=\"interest\" value=\"게임\" ");
      out.print( checkedInterest[4] );
      out.write(">\r\n");
      out.write("                  <label for=\"game\">게임</label>\r\n");
      out.write("                  <input type=\"checkbox\" id=\"etc\" name=\"interest\" value=\"기타\" ");
      out.print( checkedInterest[5] );
      out.write(">\r\n");
      out.write("                  <label for=\"etc\">기타</label>\r\n");
      out.write("               </td>\r\n");
      out.write("            </tr>\r\n");
      out.write("         </table>\r\n");
      out.write("         <br>\r\n");
      out.write("         \r\n");
      out.write("         <div class=\"btns\" align=\"center\">\r\n");
      out.write("            <div id=\"goMain\" onclick=\"goMain();\">메인으로</div>\r\n");
      out.write("            <div id=\"updateBtn\" onclick=\"updateMember();\">수정하기</div>\r\n");
      out.write("            <div id=\"deleteBtn\" onclick=\"deleteMember();\">탈퇴하기</div>\r\n");
      out.write("         </div>\r\n");
      out.write("      </form>\r\n");
      out.write("      \r\n");
      out.write("      <!-- 잘 조회 되는지 확인!! -->\r\n");
      out.write("      <!-- 잘 조회 된다면 이제 부터 수정하기 작업하기!!! -->\r\n");
      out.write("      \r\n");
      out.write("      <script>\r\n");
      out.write("      \tfunction goMain(){\r\n");
      out.write("      \t\tlocation.href=\"index.jsp\";\r\n");
      out.write("      \t}\r\n");
      out.write("      \t//회원정보 수정하기\r\n");
      out.write("      \tfunction updateMember(){\r\n");
      out.write("      \t\t$(\"#updateForm\").submit();\r\n");
      out.write("      \t\t//UpdateMemberServlet 만들기\r\n");
      out.write("      \t\t\r\n");
      out.write("      \t}\r\n");
      out.write("      \tfunction deleteMember(){\r\n");
      out.write("      \t\t$(\"#updateForm\").attr(\"action\",\"");
      out.print(request.getContextPath());
      out.write("/delete.me\");\r\n");
      out.write("      \t\t//하나의 폼태그로 두가지 이동을 할 수 있도록\r\n");
      out.write("      \t\t//현재 update.me로 지정되어있는걸 deleteMember를 클릭하면 delete.me로 바뀌도록\r\n");
      out.write("      \t\t//기존의 form 태그 경로는 회원정보 수정을 위한 urlmapping주소이므로 회원탈퇴는 경로를 수정해주자(attr이용)\r\n");
      out.write("      \t\t\r\n");
      out.write("      \t\t$(\"#updateForm\").submit();\r\n");
      out.write("      \t\t\r\n");
      out.write("      \t\t//delteMemberServlet만들기\r\n");
      out.write("      \t}\r\n");
      out.write("      \t\r\n");
      out.write("      </script>\r\n");
      out.write("   </div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
