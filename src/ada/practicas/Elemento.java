package ada.practicas;

public class Elemento {
    protected String nombre;
    protected String descripcion;
    protected Integer cantidad;
    protected int codigoElemento;

    public Elemento(String nombre, String descripcion, Integer cantidad, int codigoElemento) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.codigoElemento= codigoElemento;

    }

    public Elemento() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public int getCodigoElemento() {
        return codigoElemento;
    }

    public void setCodigoElemento(int codigoElemento) {
        this.codigoElemento = codigoElemento;
    }

}
