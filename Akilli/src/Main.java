
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean isFinished = false;
        
        Subject subject = new Subject();
        SicaklikObserver SicaklikObserver = new SicaklikObserver(subject);
        
        Kisi k = new Kisi();
        
        Sicaklik sicaklik = new Sicaklik();
        
        Sogutucu sogutucu = Sogutucu.getInstance();  

        while (!isFinished) {
            System.out.println("\n\n\n------KULLANICI GİRİŞİ------\n");
            System.out.print("Kullanıcı adınızı giriniz= ");
            Scanner a = new Scanner(System.in);
            String kad = a.next();

            System.out.print("Şifrenizi giriniz = ");
            Scanner c = new Scanner(System.in);
            String ksifre = c.next();

            k.setUsername(kad);
            k.setPassword(ksifre);
            String adSoyad = "";
            adSoyad = k.AdSoyadSet(kad);
            int b = sicaklik.RandomSicaklik();

            /////////////////////////////////////////////////////
            if (k.PasswordControl()) { 
                while (true) {
                    System.out.println("");
                    subject.setState(b);
                    System.out.println("Sayın: " + adSoyad + "  Klimanın durumu: " + sogutucu.klima);
                    System.out.print("Oturumunuzu kapatmak istiyor musunuz?(E)=  ");
                    Scanner o = new Scanner(System.in);
                    String cikis = o.next();
                    if ("e".equals(cikis.toLowerCase())) {
                        isFinished = true;
                        break;
                    }
                    System.out.print("Klimanın durumunu değiştirebilirsiniz(Y/N)=  ");
                    Scanner s = new Scanner(System.in);
                    String durum = s.next();
                    b = sicaklik.RandomSicaklik();
                    sogutucu.KlimaDurum(durum);
                    
                }
            } else {
                System.out.println("\nKULLANICI GİRİŞİ BAŞARISIZ\n");
            }
        }
    }
}
