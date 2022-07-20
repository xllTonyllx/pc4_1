package modelo;

import config.Conexion;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CategoriasDAO {

    Connection conexion;

    public CategoriasDAO() {

        Conexion con = new Conexion();
        conexion = con.getConexion();

    }

    public List<Categorias> listarCategorias() {

        PreparedStatement ps;
        ResultSet rs;

        List<Categorias> lista = new ArrayList<>();

        try {

            ps = conexion.prepareStatement("SELECT codCategoria, nombreCategoria, descripcionCategoria FROM categorias");

            rs = ps.executeQuery();

            while (rs.next()) {

                int codCategoria = rs.getInt("codCategoria");
                String nombreCategoria = rs.getString("nombreCategoria");
                String descripcionCategoria = rs.getString("descripcionCategoria");

                Categorias categoria = new Categorias(codCategoria, nombreCategoria, descripcionCategoria);

                lista.add(categoria);
            }

            return lista;

        } catch (SQLException e) {
            System.out.println(e.toString());
            return null;
        }
        
        
    }
    
    
    public Categorias mostrarCategorias( int _codCategoria){
        PreparedStatement ps;
        ResultSet rs;
        
        try{
            ps = conexion.prepareStatement("SELECT codCategoria,nombreCategoria,descripcionCategoria FROM sategorias WHERE codCategoria=?");
            ps.setInt(1, _codCategoria);
            rs = ps.executeQuery();
            
            Categorias categoria = null;
            
            while(rs.next()){
                int codCategoria = rs.getInt("codCategoria");
                String nombreCategoria = rs.getString("nombreCategoria");
                String descripcion = rs.getString("descripcion");
                
                categoria = new Categorias(codCategoria, nombreCategoria, descripcion);
            }
            return categoria;
            
        }catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        }
        
        
        
    }
    
    
}
