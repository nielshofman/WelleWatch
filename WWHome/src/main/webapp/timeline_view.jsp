<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<link rel="shortcut icon" href="/favicon.ico"/>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="icon" href="img/favicon.ico" type="image/x-icon">
<jsp:useBean id="timeline" class="model.Timeline" scope="request"></jsp:useBean>
<title>Time line</title>
<style>
body {
	background: url("img/testimage.gif") no-repeat;
	background-color: black;
	background-size: 1920px 1080px;
}
div.one {
    position: fixed;
    bottom: 50;
    right: 1590;
}
div.two {
    position: fixed;
    bottom: 25;
    right: 1272;
}
div.three {
    position: fixed;
    bottom: 30;
    right: 954;
}
div.four {
    position: fixed;
    bottom: 25;
    right: 636;
}
div.five {
    position: fixed;
    bottom: 30;
    right: 318;
}
div.six {
    position: fixed;
    bottom: 50;
    right: 10;
}
</style>
</head>
<body>
  	<% if (timeline.isPeriod1()) { %>
  		<div class="one">
			
		<img src="img/Caveman_3.png" alt="Test" width="240" height="480"></div>
	<% } if (timeline.isPeriod2()) { %>
		<div class="two">
			<img src="img/hunter.png" alt="Test" width="240" height="480">
		</div>
	<% } if (timeline.isPeriod3()) { %>
		<div class="three">
			<img src="img/farmer!.png" alt="Test" width="240" height="480">
		</div>
	<% } if (timeline.isPeriod4()) { %>
		<div class="four">
			<img src="img/city_final.png" alt="Test" width="240" height="480">
		</div>
	<% } if (timeline.isPeriod5()) { %>
		<div class="five">
			<img src="img/industrie_final.png" alt="Test" width="240" height="480">
		</div>
	<% } if (timeline.isPeriod6()) { %>
		<div class="six">
			<img src="img/man_2.png" alt="Test" width="240" height="480">
		</div>
	<% } %>
</body>
</html>