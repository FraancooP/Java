public class TiendaLibros {
    private final Libro[] libros;
    private int cantidad;
    
    public TiendaLibros(){
    libros = new Libro[3];
    cantidad = 0;
    }
    public void AgregarLibro(Libro libro){
        if (cantidad == libros.length) {
            System.out.println("No se pueden agregar mas libros, no hay espacio.\n");
            return;
        }
        libros[cantidad] = libro;
        cantidad++;
    }
    public void VenderLibro(String titulo, int cantidad){
        boolean encontrado = false;
        for (int i = 0; i < this.cantidad; i++) {
            if (libros[i].getTitulo().equals(titulo)) {
                System.out.println("Libro encontrado!!");
                encontrado = true;
                if(libros[i].getStock() >= cantidad){
                    libros[i].setStock(libros[i].getStock() - cantidad);
                    double precioTotal = cantidad * libros[i].getPrecio();
                    System.out.println("Venta realizada con existo, monto total = " + precioTotal);
                }else{
                    System.out.println("STOCK INSUFICIENTE");
                }
            }
            if(!encontrado){
                System.out.println("Libro no encontrado.\n");
            }
        }
    }
    public void MostrarInventario(){
        System.out.println("Todo el inventario:");
        for (int i = 0; i < cantidad; i++) {
            System.out.println(libros[i].toString());
        }
    }


    
}
