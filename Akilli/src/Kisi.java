

public class Kisi{
      
    public Kisi(){
    }
    String username;
    String password;
    
    public String getPassword()
    {
        return password; 
    }
    
    public void setPassword(String password)
    {
    this.password = password;
    }
    
 
    public boolean PasswordControl(){
        
        DBKatmani dbk = DBKatmani.getInstance();
        return dbk.UserControl(username,password);
    }
        
    public String getUsername()
    {
    return password; 
    }
    
    public void setUsername(String username)
    {
        this.username = username;
    }
    
      public String AdSoyadSet(String kadsoyad)
    {
        DBKatmani dbk = DBKatmani.getInstance();
        dbk.NameRead(kadsoyad);
        return dbk.NameRead(kadsoyad);
    }
}
   