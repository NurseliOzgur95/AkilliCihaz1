


public class SicaklikObserver extends Observer{
    
     public SicaklikObserver(Subject subject){
      this.subject = subject;
      this.subject.attach(this);
   }

   @Override
   public void update() {
      System.out.println( "Ortam sıcaklığı =  " +  subject.getState() +" derecedir."); 
   }
}