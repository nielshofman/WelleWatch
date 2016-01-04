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
<style>
body {
	background: url("img/testimage.gif") no-repeat;
	background-size: 1920px 1080px;
}
div.one {
    position: fixed;
    bottom: 68;
    right: 1590;
    width: 318px;
    height: 466px;
}
div.two {
    position: fixed;
    bottom: 68;
    right: 1272;
    width: 318px;
    height: 466px;
}
div.three {
    position: fixed;
    bottom: 68;
    right: 954;
    width: 318px;
    height: 466px;
}
div.four {
    position: fixed;
    bottom: 68;
    right: 636;
    width: 318px;
    height: 466px;
}
div.five {
    position: fixed;
    bottom: 68;
    right: 318;
    width: 318px;
    height: 466px;
}
div.six {
    position: fixed;
    bottom: 68;
    right: 0;
    width: 318px;
    height: 466px;
}
</style>
</head>
<body>
  	<% if (timeline.isPeriod1()) { %>
  		<div class="one">
			<img src="img/1.png" alt="Test" width="318" height="466">
		</div>
	<% } if (timeline.isPeriod2()) { %>
		<div class="two">
			<img src="img/2.png" alt="Test" width="318" height="466">
		</div>
	<% } if (timeline.isPeriod3()) { %>
		<div class="three">
			<img src="img/3.jpg" alt="Test" width="318" height="466">
		</div>
	<% } if (timeline.isPeriod4()) { %>
		<div class="four">
			<img src="img/4.jpg" alt="Test" width="318" height="466">
		</div>
	<% } if (timeline.isPeriod5()) { %>
		<div class="five">
			<img src="img/5.jpg" alt="Test" width="318" height="466">
		</div>
	<% } if (timeline.isPeriod6()) { %>
		<div class="six">
			<img src="img/6.jpg" alt="Test" width="318" height="466">
		</div>
	<% } %>
</body>
</html>