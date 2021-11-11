<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
        <title>Show All Users</title>
    </head>
<body>
    <table border=1>
        <thead>
            <tr>
                <th>User Id</th>
                <th>Nome</th>
                <th>Matr?cula</th>
                <th>Data_nascimento</th>
                <th>Setor</th>
                <th colspan=2>Action</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${users}" var="user">
                <tr>
                    <td><c:out value="${user.id_gestor}" /></td>
                    <td><c:out value="${user.nme_gestor}" /></td>
                    <td><fmt:formatNumber value="${user.mat_gestor}" /></td>
                    <td><fmt:formatDate pattern="dd/MM/yyyy" value="${user.data_nascimento}" /></td>
                    <td><c:out value="${user.setor_gestor}" /></td>
                    <td><a href="UserController?action=edit&id_gestor=<c:out value="${user.id_gestor}"/>">Update</a></td>
                    <td><a href="UserController?action=delete&id_gestor=<c:out value="${user.id_gestor}"/>">Delete</a></td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
    <p><a href="UserController?action=insert">Add User</a></p>
</body>
</html>