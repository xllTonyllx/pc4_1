/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DaFi
 */
public class MAterialesDao1 {
    Connection conexion;
    
    public MAterialesDao1(){
        Conexion con = new Conexion();
        conexion = con.getConexion();
    }
    public List<Materiales> listarMateriales(){
        PreparedStatement ps;
        ResultSet rs;
        
        List <Materiales> lista = new ArrayList<>();
        
        try{
            ps = conexion.prepareStatement("SELECT codMaterial,codCategoria,nombreMaterial,cantidad FROM Materiales WHERE codCategoria="+"'2"+"'");
            rs = ps.executeQuery();
            
            while(rs.next()){
                int codMaterial = rs.getInt("codMaterial");
                int codCategoria = rs.getInt("codCategoria");
                String nombreMaterial = rs.getString("nombreMaterial");
                int cantidad = rs.getInt("cantidad");
                
                Materiales material = new Materiales(codMaterial,codCategoria,nombreMaterial,cantidad);
                lista.add(material);
            }
            
            return lista;
            
        }catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
    
    public Materiales mostrarMateriales(int _codMaterial){
        PreparedStatement ps;
        ResultSet rs;
        
        Materiales material = null;
        
        try{
            ps = conexion.prepareStatement("SELECT codMaterial,codCategoria,nombreMaterial,cantidad FROM Materiales WHERE codMaterial=?");
            ps.setInt(1, _codMaterial);
            rs = ps.executeQuery();
            
            while(rs.next()){
                int codMaterial = rs.getInt("codMaterial");
                int codCategoria = rs.getInt("codCategoria");
                String nombre = rs.getString("nombreMaterial");
                int cantidad = rs.getInt("cantidad");
                
                material = new Materiales(codMaterial,codCategoria,nombre,cantidad);
            }
            return material;
            
        }catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
    public boolean actualizarMateriales(Materiales material){
        PreparedStatement ps;
        
        try{
            ps = conexion.prepareStatement("UPDATE nombreMaterial=?, cantidad=? VALUES (?,?)");
             ps.setInt(1,material.getCodMaterial());
             ps.setInt(2,material.getCodCategoria());
             ps.setString(3,material.getNombreMaterial());
             ps.setInt(4,material.getCantidad());
            ps.execute();
        
            return true;
            
        }catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
    public boolean insertar(Materiales material){
        PreparedStatement ps;

        try{
             ps =conexion.prepareStatement("INSERT INTO Materiales ( codMaterial,codCategoria,nombreMaterial,cantidad) VALUES (?,?,?,?)");
             ps.setInt(1,material.getCodMaterial());
             ps.setInt(2,material.getCodCategoria());
             ps.setString(3,material.getNombreMaterial());
             ps.setInt(4,material.getCantidad());
             ps.execute();
             return true;

        } catch(SQLException e){
        System.out.println(e.toString());
            return false;
        
        }
    }
}
