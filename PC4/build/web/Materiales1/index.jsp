<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>PC4</title>
    </head>
    <body>
        <h1>Categoria</h1>
            
        <br /><br />
        <h2>Materiales</h2>
            <a href="MaterialesController1?accion=nuevo"> Nuevo Material</a>
            <table border="1" width="80%">
                <thead>
                    <tr>
                        <th>codMaterial</th>
                        <th>codCategoria</th>
                        <th>Nombre</th>
                        <th>Cantidad</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="material" items ="${lista}">
                        <tr>
                            
                            <<td><c:out value="${material.codMaterial}"/></td>
                            <<td><c:out value="${material.codCategoria}"/></td>
                            <<td><c:out value="${material.nombreMaterial}"/></td>
                            <<td><c:out value="${material.cantidad}"/></td>
                            
                            
                        </tr>
                        
                        
                    </c:forEach>
                </tbody>
            </table>
        
    </body>
</html>
