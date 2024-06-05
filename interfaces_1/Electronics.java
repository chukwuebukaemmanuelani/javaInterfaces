package interface_1;

public interface Electronics {
boolean onOrOff = false;

   boolean on(); 
   boolean off();

   default void electronics(){
      if (onOrOff){
         System.out.println("Default");
      }
   } 
}
