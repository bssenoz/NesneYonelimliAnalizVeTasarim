package proje2;

import java.util.Random;

public class Eyleyici {
	private int yenisicaklik;
	public boolean sogutucuDurumu = false;

    public int SogutucuAc(int deger)
    {
    	if(deger==0) {
    		System.out.println("\nSicaklik dusurmeye gerek yok.");
    		return 0;
    	}
    	if(sogutucuDurumu == false) {
    		System.out.println("\nSogutucu aciliyor...");
    		try {
    			Thread.sleep(1000);
    		} catch (InterruptedException e) {
    			e.printStackTrace();
    		}
    		System.out.println("Sogutucu acildi.");
    	}
		sogutucuDurumu = true;
		Random rastgele = new Random();
		yenisicaklik = rastgele.nextInt(deger);
		System.out.println("\nSicaklik " + deger+"°C'den " +yenisicaklik+ " °C'ye dusuruldu.");
		deger = yenisicaklik;
        return yenisicaklik;
    }

	public void SogutucuyuKapat() {
		if (sogutucuDurumu == false) {
			System.out.println("\nSogutucu zaten kapali!");
		} else {
			System.out.println("\nSogutucu kapatiliyor...");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Sogutucu kapandi.");
			sogutucuDurumu = false;	
		}

	}
}
