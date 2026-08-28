
package pruebarepo;


public class Alumnas {
    
    protected String nombre;
    protected String apellido;
    protected int edad;
    

    public Alumnas(String Nombre, String Apellido, int edad) {
        this.nombre = Nombre;
        this.apellido = Apellido;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String Nombre) {
        this.nombre = Nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String Apellido) {
        this.apellido = Apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
    public void mostrarNombre (){
        System.out.println(" su nombre es  " + nombre);
    }
    
    public void mostrarApellido (){
        System.out.println(" su apellido es  " + apellido);
    }
    
    public void mostrarEdad (){
        System.out.println(" la edad es  " + edad );
                  
    }
}
