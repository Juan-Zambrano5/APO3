package umariana.taller1;


import Mundo.Tarea;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author
 */
public class Taller1 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        Scanner lector = new Scanner (System.in);
        ArrayList<Tarea> misTareas=new ArrayList<>();

        boolean activo = true;                                                
        
        do {
            System.out.println("======= Menu de opciones ======");
            System.out.println("1. Agregar tarea");
            System.out.println("2. Mostrar tarea");
            System.out.println("3. Terminar programa");
            System.out.println("Seleccione una opcion");
            System.out.println("===============================");
            
            int opcion = lector.nextInt();
            
            switch(opcion) {
                
                case 1:
                    System.out.println("Ingrese el id de la tarea");
                    int id=lector.nextInt();
                    lector.nextLine();
                    System.out.println("Ingrese la descripcion de la tarea");
                    String descripcion=lector.nextLine();
                    System.out.println("Ingrese la prioridad de 1-5");
                    int prioridad=lector.nextInt();
                    //creacion del objeto y llenar la informacion
                    Tarea nuevaTarea = new Tarea (id,descripcion,prioridad);
                    //almacenar el objeto en la contenedora
                    misTareas.add(nuevaTarea);
                    System.out.println("la tarea fue guardada a satisfaccion");
                    break;
                case 2:
                    System.out.println("======Tareas registradas=====");
                    for (Tarea t: misTareas){
                        System.out.println("id: " +t.getIdTarea());
                        System.out.println("descripcion: " +t.getDescripcion());
                        System.out.println("prioridad: " +t.getPrioridad());
                        System.out.println("===============");
                    }
                    break;
                case 3:
                    activo = false;
                    System.out.println("opcion 1");
                    break;
                    
                default:
                    System.out.println("opcion no valida");
            }
        }
        while(activo);
    }
}