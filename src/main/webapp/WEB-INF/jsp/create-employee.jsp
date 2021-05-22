<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Create</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
</head>
<body>
<h1>Create</h1>

<div class="w3-container">
    <form method="post" action="/create-employee">
        <p>
            <label>Name</label>
            <input class="w3-input w3-border w3-round" name="name" type="text">
        </p>
        <p>
            <label>Wage</label>
            <input class="w3-input w3-border w3-round" name="wage" type="number">
        </p>
        <button class="w3-btn w3-blue-grey">Submit</button>
    </form>
</div>

</body>
</html>
