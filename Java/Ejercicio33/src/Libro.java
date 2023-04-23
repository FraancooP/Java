public class Libro {
private String titulo;
private String autor;
private double precio;
private int stock;
//SETERS , GETTERS Y toString--------------------------------------------------------------
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public double getPrecio() {
        return precio;
    }
    
    public int getStock() {
        return stock;
    }
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", autor=" + autor + ", precio=" + precio + ", stock=" + stock + '}';
    }

//------------------------------------------------------------------------------
    
    
    
    
    









}
