<%@ page 
	language="java" 
	contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Exemplo</title>


<style type="text/css">

body{
background-color: black;
color: rgb(0,255,0);
text-align: center; 
}
h1{

margin: 40px 0px 0px 0px;

}


</style>

</head>


<body>

	<h1>IP:</h1>
	<p><%= request.getRemoteAddr() %></p>
	 
	<br>
	
	<h1>resutado da soma </h1>
	
	<form >
	
	<input type="text" value="<%= request.getAttribute("total")  %>">
	<input type="button" value="retornar" onclick="history.back()">
	
	
	</form>
	
	
	
	
	
</body>
</html>