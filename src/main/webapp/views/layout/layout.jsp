<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE html>
<html>
<head>
	<title><tiles:insertAttribute name="title" ignore="true" /></title>  
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> 
	<meta content="" name="keywords">
	<meta content="" name="description">  
	<link rel="shortcut icon" href="${pageContext.request.contextPath}/resources/images/YuvaSenaIcon.jpg">
	<link href="${pageContext.request.contextPath}/resources/css/style.css" rel="stylesheet" type="text/css">
	<script  src="${pageContext.request.contextPath}/resources/js/constants.js" type="text/javascript"></script>
	<script  src="${pageContext.request.contextPath}/resources/js/application.js" type="text/javascript"></script> 
</head>
<body class="" bgcolor="lightblue">
	<center>
	<div>
		<tiles:insertAttribute name="header" />  
	</div>
	
	<div>
		<tiles:insertAttribute name="body" />
	</div>
	
	<div style="float: center;clear: both; ">
		<tiles:insertAttribute name="footer" />
	</div>
	</center>
</body>

</html>
