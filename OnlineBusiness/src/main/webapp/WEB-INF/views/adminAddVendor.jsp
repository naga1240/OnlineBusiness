<%-- 
    Document   : admin
    Created on : Oct 2, 2014, 4:35:33 PM
    Author     : akBheemaiah
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Register Vendor</h1>
        <form:form commandName="vendor" action="addVendor">
            name : <form:input path="name" /> <br/>
            details : <form:input path="details" /> <br/>
            
            username : <form:input path="username" /><br/>
            password : <form:input path="password" /><br/>
            <input type="submit" value="Submit"/>
        </form:form>
    </body>
</html>
