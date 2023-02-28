<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
*{
box-sizing: 0;
padding: 0;
margin: 0;
}
body{
background-image: linear-gradient( rgba(0, 0, 0, 0.21), black);
background-repeat: no-repeat;
height: 100vh;

}
.header{
display: flex;

            

flex-direction: column;
text-align: center;
position: relative;
top: 20px;


}
h1{
text-decoration: underline;
text-shadow:0px 5px 10px  rgba(0, 0, 0, 0.486);
font-size: 60px;

}

a{
position: relative;
top: 50px;
text-decoration: none;
color: white;
font-size: 20px;


}
a:hover {
	color: red;
	text-shadow: 0px 0px 10px red;
	
}


</style>
</head>
<body>
<div class="header">
<h1>Welcome To Spring MVC</h1>

<a href="insertTeacher">insert-Teachers-Data</a>
<a href="displayTeacher">Display-Teachers-Data</a>
</div>

</body>
</html>