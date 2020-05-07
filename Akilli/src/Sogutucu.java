



public class Sogutucu  {
    
    private static final Sogutucu ınstance = new Sogutucu();
    
    private Sogutucu(){}
    public static Sogutucu getInstance(){
	return ınstance;	
	}
    
        String klima ="KAPALI";

    public String getSogutucu()
    {
        return klima; 
    }
    
    public void setSogutucu(String cevap)
    {
    this.klima = klima;
    }
        
    public String KlimaDurum(String cevap)
    {
        if("AÇIK".equals(klima)){
          if("Y".equals(cevap.toUpperCase())){              
          klima = "KAPALI";
          return klima;
          }
        }
        else if(("KAPALI".equals(klima))) {
         if("Y".equals(cevap)){              
          klima = "AÇIK";
          return klima;
          }
        }
        return "KLİMA DURUMU HATASI!!";
    }

}