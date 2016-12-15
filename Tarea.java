
/**
 * Write a description of class Tarea here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tarea
{
    // instance variables - replace the example below with your own
    private String nombre;
    private boolean completada;
    

    /**
     * Constructor for objects of class Tarea
     */
    public Tarea(String nombre)
    {
        completada = false;
    }
    public void completarTarea(){
        completada = true;
    }
}
