<%-- 
    Document   : admin
    Created on : Oct 2, 2014, 1:37:45 PM
    Author     : Naga
--%>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form:form commandName="vendor" action="addVendor">
            Username : <form:input path="username" /><br/>
            Password : <form:input path="password" /><br/>
            Name : <form:input path="name"/> <br/>
           
            <input type="submit" value="Submit"/>
            
        </form:form>
    </body>
</html>
