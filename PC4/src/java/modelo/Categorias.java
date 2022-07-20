package modelo;

public class Categorias {

    private int codCategoria;
    private String nombreCategoria, descripcinCategoria;

    public Categorias(int codCategoria, String nombreCategoria, String descripcionCategoria) {

        this.codCategoria = codCategoria;
        this.nombreCategoria= nombreCategoria;
        this.descripcinCategoria = descripcionCategoria;
        
    }

    public int getCodCategoria() {
        return codCategoria;
    }

    public void setCodCategoria(int codCategoria) {
        this.codCategoria = codCategoria;
    }

    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }

    public String getDescripcinCategoria() {
        return descripcinCategoria;
    }

    public void setDescripcinCategoria(String descripcinCategoria) {
        this.descripcinCategoria = descripcinCategoria;
    }

}
