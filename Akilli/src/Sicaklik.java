

import java.util.Random;

public class Sicaklik {
    
    int sicaklik;
    
       public int RandomSicaklik() {
        Random rand = new Random();
        sicaklik = rand.nextInt(100);
        return sicaklik;   
    } 
       
    public int getSicaklik()
    {
        return sicaklik; 
    }
    
    public void setSicaklik(int sicaklik)
    {
    this.sicaklik = sicaklik;
    }  
}
