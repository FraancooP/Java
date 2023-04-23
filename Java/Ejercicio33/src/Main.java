//En una tienda de libros, se desea implementar un programa que permita almacenar información sobre los libros disponibles y las ventas realizadas. 
//Para ello, se pide crear una clase Libro con los siguientes atributos: titulo (String), autor (String), precio (double) y stock (int). Además, 
//la clase debe tener los siguientes métodos:
//getTitulo(), setTitulo(String): para obtener y modificar el título del libro.
//getAutor(), setAutor(String): para obtener y modificar el autor del libro.
//getPrecio(), setPrecio(double): para obtener y modificar el precio del libro.
//getStock(), setStock(int): para obtener y modificar el stock del libro.
//toString(): para obtener una representación en texto del libro.
//Luego, se pide crear una clase TiendaLibros con una lista de objetos Libro. La clase debe tener los siguientes métodos:
//agregarLibro(Libro libro): para agregar un libro a la lista de libros.
//venderLibro(String titulo, int cantidad): para vender una cantidad de libros con un determinado título. Si la cantidad a vender
//Supera el stock disponible, se debe lanzar una excepción StockInsuficienteException con el mensaje "Stock insuficiente". Además,
//Si no se encuentra ningún libro con el título dado, se debe lanzar una excepción LibroNoEncontradoException con el mensaje "Libro no encontrado". 
//Si se realiza la venta correctamente, se debe actualizar el stock del libro.
//mostrarInventario(): para mostrar la lista de libros disponibles, junto con su título, autor, precio y stock.
//Por último, se pide crear una clase Main que permita interactuar con la tienda de libros. En el programa, se deben presentar las siguientes opciones al usuario:
//Agregar libro: se debe solicitar el título, autor, precio y stock del libro y agregarlo a la lista de libros.
//Vender libro: se debe solicitar el título y la cantidad de libros a vender. Si se realiza la venta correctamente, se debe mostrar el precio total de la venta.
//Mostrar inventario: se debe mostrar la lista de libros disponibles en la tienda.
//Salir: se debe terminar el programa.
//El programa debe permitir al usuario seleccionar una opción y realizar la acción correspondiente hasta que decida salir del programa.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        TiendaLibros tienda = new TiendaLibros();
        Scanner scanner = new Scanner(System.in);
        boolean salida = true;
        int caso = 0;
        do {
            System.out.println("Bienvenido, a continuacion elija una opcion.\n");
            System.out.println("1: AGREGAR UN LIBRO.\n");
            System.out.println("2: VENDER UN LIBRO.\n");
            System.out.println("3: MOSTRAR INVENTARIO.\n");
            System.out.println("4: SALIR.\n");
            caso = Integer.parseInt(scanner.nextLine());
            switch(caso){
                case 1:
                    Libro libro = new Libro();
                    System.out.println("Ingrese el Titulo del libro.\n");
                    libro.setTitulo(scanner.nextLine());
                    System.out.println("Ingrese el autor del libro.\n");
                    libro.setAutor(scanner.nextLine());
                    System.out.println("Ingrese el stock del libro.\n");
                    libro.setStock(Integer.parseInt(scanner.nextLine()));
                    System.out.println("Ingrese el precio del libro.\n");
                    libro.setPrecio(Double.parseDouble(scanner.nextLine()));
                    System.out.println("Libro Agregado correctamente.\n");
                    tienda.AgregarLibro(libro);
                    break;
                case 2:
                    System.out.println("Ingrese el libro que desea vender.\n");
                    var vender = scanner.nextLine();
                    System.out.println("Ingrese la cantidad que desea vender.\n");
                    var canti = Integer.parseInt(scanner.nextLine());
                    tienda.VenderLibro(vender, canti);
                    break;
                case 3:
                    tienda.MostrarInventario();
                    break;
                case 4:
                    salida = false;
                    break;
            }
        } while (salida);
        System.out.println("Saliendo del sistema.\n");
    } 
}
