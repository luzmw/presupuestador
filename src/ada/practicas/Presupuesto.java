package ada.practicas;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Presupuesto implements Item{
    private List<Item> items= new ArrayList<>();
    private Double totalPresupuesto;
    private Scanner scanner = new Scanner(System.in);

    public Presupuesto(List<Item> items) {
        this.items = new ArrayList<>();
    }

    public Presupuesto() {
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


    @Override
    public Double calcularTotal() {
        Double total=0.00;
        for (Item i : items) {
            total += i.calcularTotal();
        }
        return total;
    }

    @Override
    public void mostrarDetalles() {
        List<Item>items = new ArrayList<>();
        for (Item item : items) {
            System.out.println("Detalle:" + item);
        }

    }

    @Override
    public void modificarItem() {
        List<Item>items= new ArrayList<>();
        System.out.println("ingrese servicio o preducto  y el código");
        int codigoElemento = scanner.nextInt();
        Item unitem = items.get(codigoElemento);
        if (unitem.getClass().getSimpleName().equalsIgnoreCase("Producto")) {
            Producto p = (Producto) unitem;
            //modificaciones al producto
            items.set(codigoElemento, p);
        } else {
            Servicio s = (Servicio) unitem;
            //modificaciones al servicio
            items.set(codigoElemento, s);
        }

    }

    public void agregarElemento() {

        Presupuesto presupuesto= new Presupuesto();
        Producto unp = new Producto();
        System.out.println("Ingrese  nombre del porudcto/servicio");
        String nombre = scanner.nextLine();
        unp.setNombre(nombre);

        System.out.println("Ingrese descripcion del porudcto/servicio");
        String descripcion = scanner.nextLine();
        unp.setDescripcion(descripcion);

        System.out.println("Ingrese el código del producto/servicio");
        int codigoElemento = Integer.parseInt(scanner.nextLine());
        unp.setCodigoElemento(codigoElemento);

        System.out.println("Ingrese cantidad  del porudcto/servicio");
        Integer cantidad = Integer.parseInt(scanner.nextLine());
        unp.setCantidad(cantidad);


        //precio de lista
        Double precioUnitario=300.00;
        unp.setPrecioUnitario(precioUnitario);

        //agregar a la lista de items

        items.add(unp);

        System.out.println("se agrego ");

        System.out.println("desea agregar mas elementos al presupuesto? si =1 no = 0");
        int oopcion = Integer.parseInt(scanner.nextLine());

        //TODO validar opciones
        if (oopcion == 1) {
            System.out.println("Ingrese el nombre del producto/servicio");

        } else {
            //salir
        }
    }

    public void eliminarElemento() {
        //lista de codigos?
        System.out.println("Ingrese el código del producto7servicio que desee eliminar");
        int codigoElemento = scanner.nextInt();
        items.remove(codigoElemento);

    }

    public void modificarElemento() {
    }
}
