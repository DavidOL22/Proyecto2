package proyectocolas;

/**
 *
 * @author Fiuke
 */
public class cola {
    
    String nombre;
    
    public cola(){
        
    }

    public cola(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String mostrarNombre(){
        String Salida;
        
        Salida= "Se agrego " + this.getNombre();
        
        return Salida;
    
    }
}
