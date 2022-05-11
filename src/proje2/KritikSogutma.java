package proje2;

import java.util.Random;

public class KritikSogutma {
	private int ilkSicaklik;
	private int sonSicaklik;
	ISubject publisher;

	public KritikSogutma(int ilkSicaklik, int sonSicaklik, ISubject publisher) {
		this.ilkSicaklik = ilkSicaklik;
		this.sonSicaklik = sonSicaklik;
		this.publisher = publisher;
	}

	public int getilkSicaklik() {
		return ilkSicaklik;
	}

	public int getSonSicaklik() {
		return sonSicaklik;
	}

	public void setSonSicaklik(int sonSicaklik) {
		this.sonSicaklik = sonSicaklik;
		do {
			Random rastgele = new Random();
			sonSicaklik = rastgele.nextInt(ilkSicaklik);

		} while (sonSicaklik > 40);
		publisher.notify("Sicaklik kritik sicakligin ustunde!!!");
		publisher.notify("Kritik sogutma devreye giriyor...");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		publisher.notify("Sicaklik: " + this.ilkSicaklik + "°C'den " + sonSicaklik + "°C'ye dusuruldu.");
		ilkSicaklik = sonSicaklik;
	}
}
