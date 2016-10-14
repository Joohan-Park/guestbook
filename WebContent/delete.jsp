<%@page import="com.bit2016.guestbook.dao.GuestBookDao"%>
<%
	request.setCharacterEncoding("UTF-8");

	String no = request.getParameter("no");
	Long no2 = Long.parseLong(no);
	String password = request.getParameter("password");
	
	GuestBookDao dao = new GuestBookDao();
	dao.delete(no2, password);

	response.sendRedirect("/guestbook");
%>