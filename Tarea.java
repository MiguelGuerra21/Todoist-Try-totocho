
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
    private int prioridad;

    /**
     * Constructor for objects of class Tarea
     */
    public Tarea(String nombre)
    {
        completada = false;
        tarea = nombre;
        prioridad = 0;
    }
    public void completarTarea(){
        completada = true;
    }
    public String getNombre(){
        return tarea;
    }
    public int getPrioridad(){
        return prioridad;
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
    public String toString(){
        String amiamiamiamiamiam = "";
        if(completada){
            amiamiamiamiamiam += "Completada";
        }
        amiamiamiamiamiam += tarea;
        return amiamiamiamiamiam;
    }
    /**
     * Ahora las tareas pueden tener prioridad: 0 prioridad baja, 5 prioridad alta.
     * La prioridad se define por medio de un metodo después de haber sido creadas (por defecto las tareas tienen prioridad 0).
     * Conseguir ser capaz de establecer prioridades y de que se muestren en los listados de tareas.
     */
    public void establecerPrioridad(int prioridad){
        if (prioridad > 0 && prioridad <= 5){
            this.prioridad = prioridad;
        }
    }
}
