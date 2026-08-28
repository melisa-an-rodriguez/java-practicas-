
package pruebarepo;


public class Alumnas {
    
    protected String Nombre;
    protected String Apellido;
    protected int edad;

    public Alumnas(String Nombre, String Apellido, int edad) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.edad = edad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
    public void mostrarNombre (){
        System.out.println(" su nombre es  " + Nombre);
    }
    
    public void mostrarApellido (){
        System.out.println(" su apellido es  " + Apellido);
    }
    
    public void mostrarEdad (){
        System.out.println(" la edad es  " + edad );
                  
    }
}
