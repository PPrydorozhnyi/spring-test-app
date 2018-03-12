<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>

<html>
<head>
    <title>Customer registration form</title>
    <style>
        .error {color:red}
    </style>
</head>
<body>

<i>Asterisk(*) means required</i>

<br><br>

<form:form action="processForm" modelAttribute="customer">
    First name: <form:input path="firstName" />
    Last name(*): <form:input path="lastName"/>
    <form:errors path="lastName" cssClass="error" />

    <br><br>

    <input type="submit" value="Sign up">
</form:form>

</body>
</html>
