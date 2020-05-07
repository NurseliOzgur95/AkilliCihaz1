

import java.util.ArrayList;
import java.util.List;

public class Subject {
	
   private final List<Observer> observers = new ArrayList<>();
   private int state;

   public int getState() {
      return state;
   }

   public void setState(int state) {
      this.state = state;
      notifyAllObservers();
   }
// Kullanıcıları eklemek için.
   public void attach(Observer observer){
      observers.add(observer);		
   }

   // Sıcaklık değerini görmeye yetkili kullanıcılara haber vermek  için.
   public void notifyAllObservers(){
       observers.forEach((observer) -> {
           observer.update();
       });
   } 	
}