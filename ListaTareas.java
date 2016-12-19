
/**
 * Write a description of class ListaTareas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class ListaTareas
{
                                 //Atributos
    private ArrayList<Tarea> listaDeTareas;
    /**
     * Constructor for objects of class ListaTareas
     */
    public ListaTareas()
    {
        listaDeTareas = new ArrayList<Tarea>();
    }
    
    public void verTareas(){
        System.out.println(listaDeTareas);
    }
    
    public void addTarea(String nombre){
        Tarea nuevaTarea = new Tarea(nombre);
        listaDeTareas.add(nuevaTarea);
    }
    
    public int verNumeroTareas(){
        return listaDeTareas.size();
    }
    
    public void eliminarTarea(int posicion){
        int index = posicion - 1;
        if(posicion >= 0 && posicion < listaDeTareas.size()){
            listaDeTareas.remove(index);
        }
    }
    public void mostrarTareas(){
        int x = 1;
        for (Tarea tarea : listaDeTareas){
            System.out.println(x + "-" + tarea.getNombre() + " - " + tarea.verEstadoTarea() + " - Prioridad" + tarea.getPrioridad() + "-Fecha:" + tarea.getFecha());
            x++;
        }
    }
    public void ponerHecha(int cual){
        int index = cual - 1;
        if(index <= listaDeTareas.size() && index > 0){
            listaDeTareas.get(index).completarTarea();
        }
    } 
    public void mostrarTareasCoincidentes(String texto){
        int posicion = 0;
        while (posicion < listaDeTareas.size()){
            Tarea tareaActual = listaDeTareas.get(posicion);
            if (tareaActual.getNombre().contains(texto)){
                System.out.println((posicion + 1) + ". " + tareaActual.toString() + " > " + tareaActual.verEstadoTarea());
            }
            posicion++;
        }
    }
    public void establecerPrioridadTarea(int cual,int nuevaPrioridad){
        int cual2 = cual - 1;
        if(cual2 >= 0 && cual2 < listaDeTareas.size()){
            if(nuevaPrioridad > 0 && nuevaPrioridad <5){
                  listaDeTareas.get(cual2).establecerPrioridad(nuevaPrioridad);
                }
            }
    }
    public void establecerFecha(int cual, int nuevoDia, int nuevoMes, int nuevoAño){
        if(cual >= 0 && cual < listaDeTareas.size()){
            listaDeTareas.get(cual - 1).establecerFechaVencimiento(nuevoDia , nuevoMes , nuevoAño);
        }
        else{
            System.out.println("Error de dato");
        }
    }
}
