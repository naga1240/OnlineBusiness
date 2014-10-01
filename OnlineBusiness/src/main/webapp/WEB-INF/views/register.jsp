<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register Page</title>
    </head>
    <body>
        <h1>Register Yourself</h1>
        <form:form commandName="customer" action="addCustomer">
            name : <form:input path="name"/> <br/>
            address : <form:input path="address" /> <br/>
            email : <form:input path="email" /><br/>
            username : <form:input path="username" /><br/>
            password : <form:input path="password" /><br/>
            <input type="submit" value="Submit"/>
        </form:form>
    </body>
    
</html>