<%-- 
    Document   : inserirGestor
    Created on : 4 de nov. de 2021, 21:38:43
    Author     : Hendrik
--%>

<%@page import="java.sql.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="br.com.DAO.GestorDao"%>
<%@page import="br.com.DTO.GestorDTO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <% 
            try {
                    
                    GestorDTO objGestorDTO = new GestorDTO();
                    GestorDao objGestorDao = new GestorDao();
                    
                    objGestorDTO.setNome_gestor(request.getParameter("nome"));
                    String paramNumMax = request.getParameter("matricula");
                    int numberMax = Integer.parseInt(paramNumMax.trim());
                    objGestorDTO.setMat_gestor(numberMax);
                    objGestorDTO.setDate_nasc_gestor(Date.valueOf("data"));
                    objGestorDTO.setSetor_gestor(request.getParameter("setor"));

                    
                    
                    
                    objGestorDao.CadastrarGestor(objGestorDTO);



                                     
                } catch (Exception e) {
                    throw new RuntimeException("Erro 6: " + e);
                }



        %>
        
        
    </body>
</html>
