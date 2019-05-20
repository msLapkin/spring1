<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>

<html>
<head>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/main.css" />
</head>

<body>
<h1>Homework result</h1>

<%--<h1> ${human.surname}</h1>--%>
<%--<h1> ${human.name}</h1>--%>

<%--Result : ${x} + ${y}= ${result}--%>
<table>
    <tr><th>ID</th><th>Name</th><th>Surname</th></tr>
    <c:forEach var="item" items="${humans}">
        <tr><th>${item.id}</th><th>${item.surname}</th><th>${item.name}</th></tr>
    </c:forEach>
</table>
<%--, ${name}.--%>

</body>
</html>