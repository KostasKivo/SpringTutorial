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
    	
    	Free passes: <form:input path="freePasses"/>
    	<form:errors path="freePasses" cssClass="error"/>
    	
    	<br><br>
    	
    	Postal code: <form:input path="postalCode"/>
    	<form:errors path="postalCode" cssClass="error"/>
    	
    	<br><br>
    	
    	Course code: <form:input path="courseCode"/>
    	<form:errors path="courseCode" cssClass="error"/>
    	
    	<br><br>
    	
    	<input type="submit" text="Submit"/>
    
    	
    </form:form>
    
    
    
  </body>
</html>