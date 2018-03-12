<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>

<html>
<head>
    <title>Student confirmation</title>
</head>
<body>

The student is confirmed: ${student.firstName} ${student.lastName}

<br><br>

<!student.getCountry()>
Country: ${student.country}

<br><br>

Favourite language: ${student.favouriteLanguage}

<br><br>

Operating Systems
<ul>
    <c:forEach var="temp" items="${student.favouriteOS}">
        <li>${temp}</li>
    </c:forEach>

</ul>

</body>
</html>
