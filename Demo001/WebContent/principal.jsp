<%@page import="p.edu.cibertec.bean.UsuarioBean"%>
<%@  page import="java.util.List" %>


<% 
List<UsuarioBean> lista=(List<UsuarioBean>)request.getAttribute("lista");

%>


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Administracion de Usuarios</title>
</head>



<body>
<h2> administracion de usuario</h2>
<table width="50%" border="1">
<!-- cabecera -->
<tr style="font-weight: bold; background-color: #999;">
	<td>nombres</td>
	<td>apellido</td>
	<td>edad</td>

</tr>
<!-- detalle -->

<%
for(int i=0; i<lista.size();i++){
	
UsuarioBean usuariobean= lista.get(i);

%>


<tr>
	<td> <%=usuariobean.getNombres()%></td>
	<td> <%=usuariobean.getApellidos()%></td>
	<td> <%=usuariobean.getEdad()%></td>

</tr>

<% 
}

%>


<tr>
	<td>nombres 1</td>
	<td>apellidos 1</td>
	<td>edad 1</td>

</tr>
<tr>
	<td>nombres 1</td>
	<td>apellidos 1</td>
	<td>edad 1</td>

</tr>

<tr>
	<td>nombres 1</td>
	<td>apellidos 1</td>
	<td>edad 1</td>

</tr>


</table>

</body>
</html>







