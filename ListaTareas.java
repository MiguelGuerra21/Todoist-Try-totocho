
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
        listaDeTareas.remove(index);
    }
    public void mostrarTareas(){
        int x = 1;
        for (Tarea tarea : listaDeTareas){
            System.out.println(x + "-" + tarea.getNombre() + " - " + tarea.verEstadoTarea());
            x++;
        }
    }
    public void ponerHecha(int cual){
        int index = cual + 1;
        if(index <= listaDeTareas.size() && index > 0){
            listaDeTareas.get(index - 1).completarTarea();
        }
    } 
    public void mostrarTareasCoincidentes(String texto){
        int x = 0;
        int coincidencias = 0;
        for (Tarea tarea : listaDeTareas){
            x = x + 1;
            if(tarea.getNombre().contains(texto)){
                System.out.println(x + "-" + tarea.getNombre()+ " - " + tarea.verEstadoTarea());
                coincidencias = coincidencias + 1;
            }
        }
        if(coincidencias == 0){
            System.out.println("Error");
        }
    }
    
}
