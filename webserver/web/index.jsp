-+<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<%@ include file="views/common/menubar.jsp" %>
<!-- 	<h1>안녕하세요</h1>
	<table>
		<tr>
			<th>이름</th>
			<th>나이</th>
			<th>주소</th>
		</tr>
		<tr>
			<td>김계연</td>
			<td>24</td>
			<td>서울시 강남구</td>
		</tr>
	</table> -->
<!-- <span>	
	제일 먼저 세팅할 것들
	1. Window - Preferences
	  1) 인코딩 관련한 것들 UTF-8로 바꿔주기
	     - General > Editors > Text Editors > Spelling
	     - General > Workspace
	     - Web > CSS, HTML, JSP
	     
	  2) Server 만들기
	     - Server > Runtime Environment > Add > 맨 마지막 경로가 톰캣으로 끝나게(bin파일 보일때까지)
	     - 경로가 달라졌을 경우 이부분에 가서 경로를 다시한번 잡아주면 된다.
	
	2AWWeb Project 생성
	  1) Navigator > 우클릭 > Dynamic Web Project > next > next 버튼 누르면 context directory 설정 
	     (모든 상대경로의 기본적인 경로, 기본은 WebContent, 통일해서 web으로 쓰기-간단하게)
	     
	     - 프로젝트 우클릭 > Properties > Web Project Setting 에서 Context root 확인 가능 
	   	 - 아래에 web.xml파일 만들기 꼭 체크
	  
	  2) 프로젝트 우클릭 > Properties> Java Build Path > Source 에가면 어느 폴더에 Build를 할지 설정 가능
	     (Default output folder 수정 - Browse버튼으로 ))
	  	 - 모든것은 web > WEB_INF에 만들 것이다. (web/WEB_INF/classes) !!기존의 build폴더는 삭제!!
	  	 - 우리는 기본 경로가 web부터 시작하기 때문에 검색이 가능하도록 web안에 모든것을 설정하는 편
	  	 - web.xml과 같은 경로에 두는 것이 규칙
	  	 
	3. Servers 탭에서 톰켓 세팅하기 (없을 때 window>showView에 Servers가 있음) 
	  1) 마우스 우클릭 > new > Server > Server name 정하고 next > 프로젝트를 add를 시켜 우측으로 이동
	     (TomCat이 구동시킬 프로젝트를 등록하는 과정이다.)
	  2) 만들어진 서버를 더블클릭하면 HTTP의 포트번호(기존 8080)와 다른 포트번호 역시 수정
	     !!포트번호 수정시 앞자리 8은 유지하도록 한다.!!
	  3) Serve modules without publishing에 체크 선택
	     (Clean>stop>publish를 반복해야 하는 번거로움을 없앰)
	  	 
	4. project 우클릭 > properties > Project Facets > Runtime에 본인이 구동시킬 Tomcat인지 확인함
	
	5. Servers 프로젝트 > Tom-config > Context.xml을 META_INF 밑으로 이동(복사)시킨다. 
	    - <Context workDir=> 에  META_INF 밑에 컴파일되면 빌드파일이 저장될 파일을 한개 만들고 경로 설정
	              보통 WEB_INF 아래 jspwork를 생성 > 해당 경로를 workDir로 설정해주는 것임
	
	!!!톰캣은 수정할 때 꺼주는 것이 오류를 줄이는 방법 중 하나이다!!
	</span> -->
	
</body>
</html>