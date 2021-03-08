package ada.practicas;

import java.util.Scanner;

public class Usuario {
    private String nombreUsuario;
    private  Presupuesto presupuesto;
    private Scanner scanner = new Scanner(System.in);

    public Usuario(String nombreUsuario, Presupuesto presupuesto) {
        this.nombreUsuario = nombreUsuario;
        this.presupuesto = presupuesto;
    }

    public Usuario() {
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public Presupuesto getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(Presupuesto presupuesto) {
        this.presupuesto = presupuesto;
    }

    void crearPresupuesto(){
        Presupuesto presupuesto = new Presupuesto();
        int opcion=0;
        do {
            System.out.println("Para Agregar elementos 2 . modificar 3, eliminar 4, mostrar detalle 5,  calcular total 6");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 2:
                    presupuesto.agregarElemento();
                    break;
                case 3:
                    presupuesto.eliminarElemento();
                    break;
                case 4:
                    presupuesto.modificarElemento();
                    break;
                case 5:
                    presupuesto.mostrarDetalles();
                    break;
                case 6:
                    presupuesto.calcularTotal();
                    break;
            }
        }while (opcion!=0);
    }
}
