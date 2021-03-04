package ada.practicas;

public class Servicio  extends Elemento implements  Item{
    private Double valorHora;
    private String profesional;

    public Servicio(String nombre, String descripcion, Integer cantidad, Double valorHora, String profesional) {
        super(nombre, descripcion, cantidad);
        this.valorHora = valorHora;
        this.profesional= profesional;
    }

    public Double getValorHora() {
        return valorHora;
    }

    public void setValorHora(Double valorHora) {
        this.valorHora = valorHora;
    }

    public String getProfesional() {
       return profesional;
    }

    public void setProfesional(String profesional) {
        this.profesional = profesional;
    }


    @Override
    public Double calcularTotal() {
        Double totalServicio= valorHora*cantidad;
        return  totalServicio;    }

    @Override
    public void mostrarDetalles() {
        System.out.println(nombre+ descripcion + this.calcularTotal());

    }
}


