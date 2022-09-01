<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  



<!DOCTYPE html>
<html lang="en" dir="ltr">
  <head>
    <meta charset="utf-8">
    <title>Student form</title>
  </head>
  <body>
    <form:form action="processForm" modelAttribute="student">  
    	First name: <form:input path="firstName"/>
    	<br><br>
    	Last name: <form:input path="lastName"/>
    	<br><br>
    	
    	
    	<form:select path="country">
    		 <form:options items="${student.countryOptions }"/>
    		<!--
    			<form:option value="Greece" label="Greece"/>
    			<form:option value="France" label="France"/>
    			<form:option value="Germany" label="Germany"/> 
    		-->
    		
    		
    	</form:select>
    	
    	<br><br>
    	
    	Java <form:radiobutton path="favoriteLanguage" value="1"/>
    	Javascript <form:radiobutton path="favoriteLanguage" value="2"/>
    	Typescript <form:radiobutton path="favoriteLanguage" value="3"/>
    	C <form:radiobutton path="favoriteLanguage" value="4C"/>
    	
    	<br><br>
    	
    	Operating Systems:
    	
    	Linux <form:checkbox path="operatingSystems" value="1"/>
    	Linux <form:checkbox path="operatingSystems" value="2"/>
    	Linux <form:checkbox path="operatingSystems" value="3"/>
    	
    	
    	<br><br>
    
    	<input type="submit" value="Submit"/>
    </form:form>
    
    
    
  </body>
</html>