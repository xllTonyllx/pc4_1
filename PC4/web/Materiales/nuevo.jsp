<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>PC4</title>
    </head>
    <body>
        <h1>Nuevo Material</h1>
        <br /><br />
        <form action="MaterialesController?accion=insertar" method="POST" autocomplete="off">
            <p>
                Codigo Material:
                <input id="CodMaterial" name="CodMaterial" type="number" />
            </p>
            <p>
                Código Categoría
                <input id="CodCategoria" name="CodCategoria" type="number" />
            </p>
                        
            
            
            <p>
                Nombre:
                <input id="nombre" name="nombre" type="text" />
            </p>
            <p>
                Cantidad:
                <input id="cantidad" name="cantidad" type="number" />
            </p>
            
            <button id="Añadir" name="añadir" type="summit">Añadir</button>
            
        </form>
    </body>
</html>
