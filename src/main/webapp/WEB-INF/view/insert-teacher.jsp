<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style >
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

 article{
            background-color: rgba(255, 255, 255, 0.557);
            width: 300px;
            height: 250px;
            border-bottom: 5px solid aqua;
            padding: 0px 10px;
            display: flex;
            flex-direction: column;
            justify-content: space-evenly;
            border-bottom-left-radius: 10px;
            border-bottom-right-radius: 10px;

        }
        
         form{
            display: flex;
            flex-direction: column;
            gap: 5px;
        }
        
         form input{
            padding: 5px 10px;
            font-size: 20px;
            border: none;

            border-radius: 5px;
            outline: none;
        }
        
         form button{
            padding: 5px 10px;
            border-radius: 5px;
            font-size: 20px;
            background-color: blue;
            border: none;
            color: white;
            cursor: pointer;
        }
        
          form button:hover{
            background-color: rgb(35, 35, 150);
        }
        


</style>
</head>
<body>
<section>
<article>
<c:form action="saveTeacher" modelAttribute="teacher">
<c:label path="teacherId" ></c:label>
<c:input path="teacherId" placeholder="Enter TeacherId.."/><br>

<c:label path="teacherName" ></c:label>
<c:input path="teacherName" placeholder="Enter TeacherName.."/><br>

<c:label path="teacherSubject" ></c:label>
<c:input path="teacherSubject" placeholder="Enter TeacherSubject.."/><br>

<c:button type="submit">save</c:button>
</c:form>
</article>
</section>
</body>
</html>