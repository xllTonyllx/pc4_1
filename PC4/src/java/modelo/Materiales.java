package modelo;


public class Materiales {
    private int codMaterial, codCategoria, cantidad;
    private String nombreMaterial;

    public Materiales(int codMaterial, int codCategoria, String nombreMaterial, int cantidad) {
        this.codMaterial = codMaterial;
        this.codCategoria = codCategoria;
        this.nombreMaterial = nombreMaterial;
        this.cantidad = cantidad;
    }
    
    public int getCodMaterial() {
        return codMaterial;
    }

    public void setCodMaterial(int codMaterial) {
        this.codMaterial = codMaterial;
    }

    public int getCodCategoria() {
        return codCategoria;
    }

    public void setCodCategoria(int codCategoria) {
        this.codCategoria = codCategoria;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getNombreMaterial() {
        return nombreMaterial;
    }

    public void setNombreMaterial(String nombreMaterial) {
        this.nombreMaterial = nombreMaterial;
    }
    
    
}
