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
        /*for (Item item:productosYServicios){
             totalPresupuesto+= .get(item);};
            * */
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
        Producto unp= new Producto();
        System.out.println("Ingrese  nombre del porudcto/servicio");
        String nombre = scanner.nextLine();
        unp.setNombre(nombre);

        System.out.println("Ingrese descripcion del porudcto/servicio");
        String descripcion= scanner.nextLine();
        unp.setDescripcion(descripcion);

        System.out.println("Ingrese cantidad  del porudcto/servicio");
        Integer  cantidad = scanner.nextInt();
        unp.setCantidad(cantidad);


        //agregar a la lista de items
        items.add(unp);

        //System.out.println("Ingrese el nombre del porudcto/servicio");
        //System.out.println("Ingrese el nombre del porudcto/servicio");



        /*
         Scanner sc = new Scanner(System.in);

        Producto unProducto = new Producto("Cuaderno", "A4 Rallado", 150.00);

        System.out.println("Producto Cuaderno A4 Rallado");
        System.out.println("Ingrese la cantidad deseada: ");
        int cantidad = sc.nextInt();
        int cantidad = scanner.nextInt();

        unProducto.setCantidad(cantidad);
        agregarItem(unProducto);
        agregarItem(new Servicio("Plomero", "Arregla los caños",500.0,4,"Silvio"));
        scanner.nextLine();

        Producto unProducto1 = new Producto("Termo 1.5 Lt", "Stanley Acer. Inox. Verde", 1000.00);

        System.out.println("Producto Termo 1.5 Lt Stanley Acer. Inox. Verde");
        System.out.println("Ingrese la cantidad deseada: ");
        cantidad = scanner.nextInt();

        unProducto1.setCantidad(cantidad);
        agregarItem(unProducto1);
        scanner.nextLine();

        agregarItem(new Servicio("Clase particular", "Informática I y II",500.0,4,"Pablo"));

        System.out.println("Servicio Clase Particular de Informática I y II");
        System.out.println("Se han cargado 4 hs del Servicio, clase de Informática");
    }

    public void mostrarPresupuesto() {

        List<Item> items = getItems();

        System.out.println();
        System.out.println("### Presupuesto perteneciente al usuario: "+usuario.getNombre()+" ###");
        System.out.println();

        if (isSum){
            totalPresupuesto = 0.0;
        }

        for (int i = 0; i<items.size(); i++){
            items.get(i).mostrarDetalles();
            this.totalPresupuesto += items.get(i).calcularTotal();
        }
        System.out.println("*********>>>> TOTAL del presupuesto: $ "+totalPresupuesto);
        isSum = true;
    }

    public void mostrarPresupuesto(Usuario usuario, Presupuesto presupuesto) {
    private void eliminarElemento() {

        List<Item> items = getItems();

        System.out.println("Presupuesto perteneciente al usuario: "+usuario.getNombre());
        for (int i = 0; i<items.size(); i++){
        System.out.println(" *** LISTA DE ITEMS PRESUPUESTADOS ***");

        for (int i = 0; i< items.size(); i++){
            System.out.println("Item nro.:  "+ i);
            items.get(i).mostrarDetalles();
        }
        System.out.println("Total del presupuesto: $ "+totalPresupuesto);

    }
        }
        System.out.println("Ingrese el nro. de item que quiere eliminar: ");
        int indice = scanner.nextInt();
        scanner.nextLine();

    public Presupuesto getPresupuesto() {
        return presupuesto;
    }
        Item unItem = items.get(indice);

    private void eliminarElemento() {
        if(unItem instanceof Producto){
            Producto producto = (Producto) unItem;
            eliminarItem(producto);
            System.out.println("El producto ha sido eliminado.");

        }else{
            Servicio servicio = (Servicio) unItem;
            eliminarItem(servicio);
            System.out.println("El servicio ha sido eliminado.");
        }
    }

    private void modificarElemento() {

        List<Item> items = getItems();

        int indice = 0;
        System.out.println(" *** LISTA DE ITEMS PRESUPUESTADOS ***");

        for (int i = 0; i< items.size(); i++){
            System.out.println("Item nro.:  "+ i);
            items.get(i).mostrarDetalles();
        }

        System.out.println("Ingrese el nro. de item que quiere modificar: ");
        int indice = scanner.nextInt();
        scanner.nextLine();

        Item unItem = items.get(indice);

        if(unItem instanceof Producto){
            Producto coso = (Producto) unItem;
            //hacer cosas de productos
            coso.calcularTotal();
            reemplazarItem(indice, coso);
        }else{
            Servicio coso = (Servicio) unItem;
            //hacer cosas de servicios...
            reemplazarItem(indice, coso);
        }
            Producto producto = (Producto) unItem;

            System.out.println("Ingrese la nueva cantidad: ");
            int cantidad = scanner.nextInt();

            scanner.nextLine();
            producto.setCantidad(cantidad);

            producto.calcularTotal();

            reemplazarItem(indice, producto);

            System.out.println("El producto ha sido reemplazado con éxito.");

        if(unItem.getClass().getSimpleName().equals("Producto")){
            //tengo un producto
        }else{
            //tengo un servicio
            Servicio servicio = (Servicio) unItem;

            System.out.println("Ingrese la nueva cantidad: ");
            int cantidad = scanner.nextInt();

            scanner.nextLine();
            servicio.setCantidad(cantidad);

            servicio.calcularTotal();

            reemplazarItem(indice, servicio);

            System.out.println("El servicio ha sido reemplazado con éxito.");
        }
    }


    public List<Item> getItems() {
        return items;
    }


    public void agregarItem(Item item) {
        items.add(item);

    }

    public void eliminarItem(Item item) {
        items.remove(item);

    }


    public void reemplazarItem(int indice, Item item) {
        items.set(indice, item);
    }

    @Override
    public String toString() {
        return "Presupuesto{" +
                "items=" + items +
                ", usuario=" + usuario +
                ", totalPresupuesto=" + totalPresupuesto +
                '}';
    public Double getTotalPresupuesto(){
        return totalPresupuesto;
    }
         */
    }

    public void eliminarElemento() {
        System.out.println("Ingrese el código del elemento que desea eliminar");
        int codigo = scanner.nextInt();
        items.remove(codigo);
    }

    /* public void modificarElemento() {
        System.out.println("Ingrese el codigo del elemento que desea modificar");
        int codigo= scanner.nextInt();
        Item unitem = items.get(codigo);

            if (unitem instanceof )(
                    System.out.println("Ingrese código de nuevo elemento");
                    Item nuevoItem = scanner.nextInt();
                    items.set(nuevoItem);
                    )

        }

    }

     */
}
