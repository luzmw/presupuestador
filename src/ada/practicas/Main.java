package ada.practicas;

import java.util.*;

public class Main {

    public static void main(String[] args) {
       /*
	Crear un sistema que tenga una interfaz que permita al usuario indicar desde un menu lo siguiente:
	1) si quiere agregar elementos al presupuesto
	2) si quiere modificar un elemento
	3) si quiere eliminiar un elemento.
	Los elementos/items pueden ser productos o servicios.
	Cada producto tiene una cantidad, un precio unitario, un nombre y una descripcion.
	Cada servicio tiene un costo por hora y una cantidad de horas. Además del nombre del servicio, el nombre de la
	persona que lo ejecuta y una descripcion.
	Una vez que el presupuesto está listo (el usuario decide finalizar),
	mostrar el presupuesto total y el detalle de todos los ítems agregados.
	opcionales:
	Los usuarios hacen fila para pedir presupuestos y esos presupuestos al final del dia se muestran en el orden de llegada.
	 */


        List<Presupuesto> presupuestos = new LinkedList<>();
        List<Usuario> usuarios = new ArrayList<>();


        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        do {
            System.out.println("ingrese su nombre de usuario");
            Usuario u = new Usuario();
            String nombreUsuario = sc.nextLine();
            u.setNombreUsuario(nombreUsuario);
            usuarios.add(u);
            System.out.println("Bienvenido al presupuestador " + u.getNombreUsuario());
            System.out.println("Si desea crear un presupuesto ingrese 1, para salir ingrese 0");
            opcion = Integer.parseInt(sc.nextLine());
            if (opcion == 1)
                u.crearPresupuesto();
        } while (opcion != 0);
        //mostrar los presupuestos
        for (Usuario u : usuarios) {
            System.out.println(u.getNombreUsuario() + " " + u.getPresupuesto());
        }

    }
}
