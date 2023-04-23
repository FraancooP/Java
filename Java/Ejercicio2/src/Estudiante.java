public class Estudiante {
private String nombre;
private int edad;
public float promedio;
private String materia;
public int calificaciones [];//Creamos un arreglo de atributo.

//Seteamos Getters y setters
//------------------------------------------------------------------------------
public Estudiante() {//Creamos el constructor del arreglo calificaciones
    this.calificaciones = new int[3];//Rango del arreglo
}
public void setNombre(String nomb){
    this.nombre = nomb;
}
public String getNombre(){
    return nombre;
}
public void setEdad(int eda){
    this.edad = eda;
}
public int getEdad(){
return edad;
}
public void setMateria(String mat){
this.materia = mat;
}
public String getMateria(){
return materia;
}
//------------------------------------------------------------------------------}
//Metodos.....
public void calcularPromedio(){
    float suma = 0.0f;
    for (int i = 0; i < 3; i++) {
        suma = suma + calificaciones[i];
    }
    promedio = suma/3;
}
public void agregarCalificacion(int calis[]){
    for(int i = 0; i < 3; i++) {
        calificaciones[i]=calis[i];
    }
    calcularPromedio();
}
public float obtenerPromedio(){
    return  promedio;
}
public void imprimirCalificaciones(){
    for (int i = 0; i < 3; i++) {
        System.out.println("Calificacion numero " + (i+1) + " = " + calificaciones[i]);
    }
}
public void imprimirAlumno(){
    System.out.println("Estudiante: "+ nombre);
    System.out.println("Edad: "+ edad);
    System.out.println("Materia cursada: "+ materia);
    System.out.println("Promedio general: "+ promedio);
}
}
