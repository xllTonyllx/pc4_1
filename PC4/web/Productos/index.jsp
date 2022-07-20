

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Categorias</h1>       
        <table border="1" width="80%">
            <thead>
                <tr>
                    <th>codCategoria</th>
                    <th>nombreCategoria</th>
                    <th>Descripcion</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="categoria" items ="${lista}">
                    <tr>

                        <<td><c:out value="${categoria.codCategoria}"/></td>
                        <<td><c:out value="${categoria.nombreCategoria}"/></td>
                        <<td><c:out value="${categoria.descripcinCategoria}"/></td>

                    </tr>


                </c:forEach>
            </tbody>
        </table>

    </body>
</html>
