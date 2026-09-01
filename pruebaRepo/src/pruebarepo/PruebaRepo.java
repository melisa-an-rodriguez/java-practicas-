/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebarepo;

/**
 *
 * @author usuario
 */
public class PruebaRepo {

    public static void main(String[] args) {
        Alumnas alumna = new Alumnas ("Valentina", "Toso", 33);
        Alumnas alumna2 = new Alumnas ("Melisa", "Rodriguez", 18);
        Alumnas alumna3 = new Alumnas ("Aimé", "Olivares", 29);
        
        System.out.println(" estos datos son de la alumna 1");
        alumna.mostrarNombre();
        alumna.mostrarApellido();
        alumna.mostrarEdad();
        
        
        System.out.println(" estos datos son de la alumna 2");
        
        
        alumna2.mostrarNombre();
        alumna2.mostrarApellido();
        alumna2.mostrarEdad();
        
    }
    
}
