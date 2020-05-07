
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class DBKatmani {
    
    private static final DBKatmani ınstance = new DBKatmani();
       private DBKatmani(){}
    public static DBKatmani getInstance(){
	return ınstance;	
	}
    
private Connection connection; //Veritabanına bir connection açıyoruz 
private final String url = "jdbc:postgresql://localhost:5432/postgres";
private final String user = "postgres";
private final String password = "heaven";
//private final String s ql = "select * from kisi";
    

public Connection dbConnection() {       //DB bağlanmak için fonksiyonumuz
   
    try {
    Class.forName("org.postgresql.Driver").newInstance();
    System.out.println("VERİ TABANINA BAĞLANILDI.\n");
    connection = DriverManager.getConnection(url, user, password);
    
    } 
    catch(Exception e ){
        System.out.println("Class bağlantısı HATALI!!");
  
    }
    return connection;
}
    
    public String NameRead(String userName){
        
             if(connection == null)
        {
            System.out.println("\n\nVeritabanına bağlı değil bağlanıyorum");
            dbConnection();
        }
        
        
        String adSoyad=" ";
         try {
        Statement stmt = connection.createStatement();
        ResultSet rs = stmt.executeQuery("Select * from kisi where username ='"+userName+"'");
               rs.next();
               adSoyad = rs.getString("adi") + " "+ rs.getString("soyadi");
        return adSoyad;
        } 
    catch (SQLException e) {
         return "Kullanıcı Adı Hatası";
         
    }}
    
  public boolean UserControl(String userName,String Passwrd)
    {
        if(connection == null)
        {
            System.out.println("Veritabanına bağlı değil bağlanıyorum");
            dbConnection();
        }
           try {
        Statement stmt = connection.createStatement();
        ResultSet rs = stmt.executeQuery("Select * from kisi where username ='"+userName+"'");
               rs.next();      
        return Passwrd.equals(rs.getString("password"));
        } 
    catch (SQLException e) {
         return false;
    }   
    }  
}