<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<link rel="shortcut icon" href="/favicon.ico"/>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="icon" href="img/favicon.ico" type="image/x-icon">
<jsp:useBean id="avatar" class="model.Avatar" scope="request"></jsp:useBean>
<jsp:useBean id="timeline" class="model.Timeline" scope="request"></jsp:useBean>
<title>Time line</title>
</head>
<body>
<div class="img">
  		<img src="img/testimage.gif" alt="Test" width="1900" height="1060">
  		<% if (timeline.isPeriod1()) { %>
		<img src="img/1.jpg" alt="Test" width="318" height="466">
		<% } if (timeline.isPeriod2()) { %>
		<img src="img/2.jpg" alt="Test" width="318" height="466">
		<% } if (timeline.isPeriod3()) { %>
		<img src="img/3.jpg" alt="Test" width="318" height="466">
		<% } if (timeline.isPeriod4()) { %>
		<img src="img/4.jpg" alt="Test" width="318" height="466">
		<% } if (timeline.isPeriod5()) { %>
		<img src="img/5.jpg" alt="Test" width="318" height="466">
		<% } if (timeline.isPeriod6()) { %>
		<img src="img/6.jpg" alt="Test" width="318" height="466">
		<% } %>
</div>
</body>
</html>