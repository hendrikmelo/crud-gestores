<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<link type="text/css"
    href="css/ui-lightness/jquery-ui-1.8.18.custom.css" rel="stylesheet" />
<script type="text/javascript" src="http://code.jquery.com/jquery-1.7.1.js"></script>
<script type="text/javascript" src="http://www.godtur.no/godtur/js/jquery-ui-1.8.18.custom.min.js"></script>
<title>Add new user</title>
</head>
<body>
    <script>
        $(function() {
            $('input[name=dob]').datepicker();
        });
    </script>

    <form method="POST" action='UserController' name="frmAddUser">
        User ID : <input type="text" readonly="readonly" name="id_gestor"
            value="<c:out value="${user.id_gestor}" />" /> <br /> 
        First Name : <input
            type="text" name="nme_gestor"
            value="<c:out value="${user.nme_gestor}" />" /> <br /> 
        Last Name : <input
            type="text" name="mat_gestor"
            value="<fmt:parseNumber value="${user.mat_gestor}" />" /> <br /> 
        DOB : <input
            type="text" placeholder="dd/MM/yyyy" name="data_nascimento" data-date-format="dd/MM/yyyy"
            value="<fmt:formatDate pattern="dd/MM/yyyy" value="${user.data_nascimento}" />" /> <br /> 
        Email : <input type="text" name="setor_gesto"
            value="<c:out value="${user.setor_gestor}" />" /> <br /> <input
            type="submit" value="Submit" />
    </form>
</body>
</html>