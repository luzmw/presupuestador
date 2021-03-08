package ada.practicas;

public class Producto extends Elemento implements Item{
   private Double precioUnitario;


   public Producto(String nombre, String descripcion, Integer cantidad, int codigoElemento, Double precioUnitario) {
      super(nombre, descripcion, cantidad, codigoElemento);
      this.precioUnitario = precioUnitario;
   }

   public Producto() {
   }

   public Double getPrecioUnitario() {
      return precioUnitario;
   }

   public void setPrecioUnitario(Double precioUnitario) {
      this.precioUnitario = precioUnitario;
   }

   @Override
   public Double calcularTotal() {
      Double totalProducto = precioUnitario*cantidad;
      return totalProducto;
   }

   @Override
   public void mostrarDetalles() {
      System.out.println(nombre+descripcion+precioUnitario+this.calcularTotal());

   }

   @Override
   public void modificarItem() {

   }
}
