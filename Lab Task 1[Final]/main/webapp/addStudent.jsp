<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: fhmha
  Date: 7/19/2022
  Time: 10:22 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="jsp.Student" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Add Student</title>
    <%
    Student s =  new Student(request.getParameter("id"),request.getParameter("name"),request.getParameter("cgpa"));
    students.add(s);
    %>

    <h3>Student list</h3>

    <c:forEach var="student" items="${students}">
        out.println(student.getId());
        out.println(student.getName());
        out.println(student.getCgpa());
        out.println();
    </c:forEach>

    <br><h3>Students with cgpa more than 3.9</h3>
    <c:forEach var="student" items="${students}">
        <c:if test="${student.getCgpa() >= 3.9}">
            out.println(student.getId());
            out.println(student.getName());
            out.println(student.getCgpa());
            out.println();
        </c:if>
    </c:forEach>
</head>
<body>

</body>
</html>
