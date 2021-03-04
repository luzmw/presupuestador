package ada.practicas;

import java.sql.SQLOutput;
import java.util.List;
import java.util.Scanner;

public class Presupuesto implements Item{
    private List<Item> items;
    private Double totalPresupuesto;
    private Scanner scanner= new Scanner(System.in);




    @Override
    public Double calcularTotal() {
            return null;
    }

    @Override
    public String toString() {
        return "Presupuesto{" +
                "productosYServicios=" + items +
                ", totalPresupuesto=" + totalPresupuesto +
                '}';
    }

    @Override
    public void mostrarDetalles() {
        items.toString();


    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public Double getTotalPresupuesto() {
        return totalPresupuesto;
    }

    public void setTotalPresupuesto(Double totalPresupuesto) {
        this.totalPresupuesto = totalPresupuesto;
    }
    public void agregarElemento(){
        boolean deseaAgregarMas = true;
        if (deseaAgregarMas) {
            Producto unp = new Producto();
            System.out.println("Ingrese  nombre del porudcto/servicio");
            String nombre = scanner.nextLine();
            unp.setNombre(nombre);

            System.out.println("Ingrese descripcion del porudcto/servicio");
            String descripcion = scanner.nextLine();
            unp.setDescripcion(descripcion);

            System.out.println("Ingrese cantidad  del porudcto/servicio");
            Integer cantidad = scanner.nextInt();
            unp.setCantidad(cantidad);

            //agregar a la lista de items
            items.add(unp);



        }else {


        }


    }

    public void eliminarElemento() {
        System.out.println("Ingrese el código del elemento que desea eliminar");
        int codigo = scanner.nextInt();
        items.remove(codigo);
    }


}
