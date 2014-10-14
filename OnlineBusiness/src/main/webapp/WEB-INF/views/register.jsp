<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link type="text/css" rel="stylesheet" href="css/mystyle.css">
        <title>Register Page</title>
      
    </head>
    <body> <center>
        <h1> Registration Page</h1>
        

<form:form commandName="customer" action="registerNew">
            Name : <form:input path="name"/> <br/>
            Address : <form:input path="address" /> <br/>
            Contact : <form:input path="contact" /><br/>
            Email : <form:input path="email" /><br/>
            Username : <form:input path="username" /><br/>
            Password : <form:input path="password" /><br/>
            <input type="submit" value="Submit"/>
       
        </form:form>
             </center>
    </body>
    
</html>