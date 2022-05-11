package proje2;
import java.util.Random;

public class SicaklikAlgilayici implements ISicaklikAlgilayici {
    
    private int sicaklik;
    
        public SicaklikAlgilayici()
        {
            Random rastgele=new Random(); 
            sicaklik=rastgele.nextInt(60);
        }
        
        public int SicaklikOku()
        {
            return sicaklik;
        }
}