
/**
 * Write a description of class Tarea here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tarea
{
    // instance variables - replace the example below with your own
    private String tarea;
    private boolean completada;
    

    /**
     * Constructor for objects of class Tarea
     */
    public Tarea(String nombre)
    {
        completada = false;
        tarea = nombre;
    }
    public void completarTarea(){
        completada = true;
    }
    public String getNombre(){
        return tarea;
    }
    public String verEstadoTarea(){
        String manolo = completada + "";
        if (completada == true){
            manolo = "Hecha";
        }
        else{
            manolo = "Pendiente";
        }
        return manolo;
    }
}
