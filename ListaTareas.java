
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
        
    }
    public void mostrarTareas(){
        int x = 1;
        for (Tarea tarea : listaDeTareas){
            System.out.println(x + "-" + tarea.getNombre());
            x++;
        }
    }
    public void ponerHecha(int cual){
        
    }
}
