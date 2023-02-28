<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
section{
background-image: linear-gradient(blue, aqua);
height: 100vh;
display: flex;
justify-content: center;
align-items: center;
}


h1{
display: flex;
justify-content:center;
position: relative;
bottom: 35px;
font-size: 30px;
text-decoration: underline;

}
</style>

</head>
<body>
<section>
<article>
<h1>Teachers-Data</h1>
<table border="2px">
<tr>
<th>teacherid</th>
<th>batchtime</th>
<th>teachername</th>
<th>teachersubject</th>
</tr>
<c:forEach var="teacher" items="${teacherData}">
<tr>
<td>${teacher.getTeacherId()}</td>
<td>${teacher.getBatchTime()}</td>
<td>${teacher.getTeacherName()}</td>
<td>${teacher.getTeacherSubject()}</td>
</tr>

</c:forEach>
</table>

</article>
</section>
</body>
</html>