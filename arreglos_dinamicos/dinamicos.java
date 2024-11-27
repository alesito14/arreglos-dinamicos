import java.util.ArrayList;
import java.util.List;

public class dinamicos{


    public static void main(String[] args){
         /*array de tipo string
        List<String> animales = new ArrayList<>();
 
        //agregar elementos del array
          animales.add("leon");
          animales.add("tigre");
          animales.add("perro");
          animales.add("gato");

          System.out.print("primer array tiene: " + animales);

         animales.add("elefante");

         System.out.println("segundo array: " + animales);*/

         List<String> lenguajes = new ArrayList<>();
         
         lenguajes.add("java");
         lenguajes.add("python");
         lenguajes.add("c");

         System.out.println("arreglo 1: " + lenguajes);

         //remover elemento 
         lenguajes.remove(2);
         System.out.println("lista sin el 2: " + lenguajes);


       }

}