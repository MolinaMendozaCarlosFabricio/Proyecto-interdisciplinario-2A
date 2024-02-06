public class Producto {
    private String nombreProducto, descripcionProducto, departamentoProducto;
    private int idProducto, existenciasProducto, cantProductoVendido;
    private float precioProducto;

    public Producto (){}

    public void setNombreProducto (String nombre){
        this.nombreProducto=nombre;
    }
    public void setDescripcionProducto (String descripcion){
        this.descripcionProducto=descripcion;
    }
    public void setDepartamentoProducto (String departamento){
        this.departamentoProducto=departamento;
    }
    public void setIdProducto (int id){
        this.idProducto=id;
    }
    public void setExistenciasProducto (int existencias){
        this.existenciasProducto=existencias;
    }
    public void setCantProductoVendido (int cantidad){
        this.cantProductoVendido=cantidad;
    }
    public void setPrecioProducto (float precio){
        this.precioProducto=precio;
    }

    public String getNombreProducto (){
        return nombreProducto;
    }
    public String getDescripcionProducto (){
        return descripcionProducto;
    }
    public String getDepartamentoProducto (){
        return departamentoProducto;
    }
    public int getIdProducto (){
        return idProducto;
    }
    public int getExistenciasProducto (){
        return existenciasProducto;
    }
    public int getCantProductoVendido (){
        return cantProductoVendido;
    }
    public float getPrecioProducto (){
        return precioProducto;
    }
}