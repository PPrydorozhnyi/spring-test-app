<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>

<html>

<head>
    <title>Student Registration</title>
</head>

<body>

<form:form action="processForm" modelAttribute="student">

    <!first call getter>
    First name: <form:input path="firstName"/>

    <br>

    Last name: <form:input path="lastName"/>

    <br>

    <!call setters>
    <input type="submit" value="Sign up">

</form:form>

</body>

</html>
