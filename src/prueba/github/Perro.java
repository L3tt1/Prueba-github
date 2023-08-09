
package prueba.github;


public class Perro extends Animal{
    
    private String hablar;
  
    
    public Perro(String nombre, int edad, String hablar) {
        super(nombre, edad);
        this.hablar = hablar;
    }

    public String getHablar() {
        return hablar;
    }
    
 
    
}
