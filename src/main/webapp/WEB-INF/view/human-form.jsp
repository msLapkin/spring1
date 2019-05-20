<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>

<html>

<h2>Input human</h2>
<form:form action="humanFormResult" modelAttribute="human" method="post">
    ID: <form:input path="id" />
    <br>
    Name: <form:input path="name" />
    <br>
    Surname:  <form:input path="surname" />
    <br>
    Weight:  <form:input path="weight" />
    <input type="submit" value="Submit" />
</form:form>
</html>