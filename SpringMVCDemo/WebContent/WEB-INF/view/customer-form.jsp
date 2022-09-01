<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  



<!DOCTYPE html>
<html lang="en" dir="ltr">
  <head>
    <meta charset="utf-8">
    <title>Student form</title>
    
    <style>
    	.error {color:red}
    </style>
  </head>
  <body>
  
  
    <form:form action="processForm" modelAttribute="customer">  
    
    	First Name: <form:input path="firstName"/>
    	
    	<br><br>
    	
    	Last Name (*): <form:input path="lastName"/>
    	<form:errors path="lastName" cssClass="error"/>
    	
    	<br><br>
    	
    	<input type="submit" text="Submit"/>
    
    	
    </form:form>
    
    
    
  </body>
</html>