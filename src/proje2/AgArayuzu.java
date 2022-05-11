package proje2;

import java.util.Scanner;

public class AgArayuzu {
	public AgArayuzu() throws InterruptedException {
		MerkeziIslemBirimi merkezi = new MerkeziIslemBirimi();
		boolean cihazKapali = true;
		int islemsecim;
		Scanner scan = new Scanner(System.in);
		
		if (cihazKapali) {
			int secim = 0;

			do {
				System.out.println("**Cihazi acmak icin 1'e basiniz**");
				secim = scan.nextInt();

				if (secim == 1) {
					System.out.println("\nCihaz acildi");
					System.out.println("Sicaklik olculuyor... ");

					cihazKapali = false;

					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

					SicaklikAlgilayici sicaklik = new SicaklikAlgilayici();

					int deger = sicaklik.SicaklikOku();
					System.out.println("\nSicaklik: " + deger + "°C");
					
					Subscriber s1 = new Subscriber();
					Publisher p = new Publisher();
					p.attach(s1);
					
					int ac = 0, kapa = 0;

					do {
						if (deger >= 40) {
							KritikSogutma kritikSicaklik = new KritikSogutma(deger, 1, p);
							kritikSicaklik.setSonSicaklik(deger);
							deger = kritikSicaklik.getilkSicaklik();
						}
						System.out.println("\nYapmak istediginiz islemi seciniz.");
						System.out.println("1-Sicaklik dusur.");
						System.out.println("2-Sogutucuyu kapat.");
						System.out.println("3-Cikis");
						islemsecim = scan.nextInt();
						
						switch(islemsecim) {
						case 1:
							deger = merkezi.AcmaIstegiGonder(deger); ac++;
							break;
						case 2:
							merkezi.KapamaIstegiGonder(); kapa++;
							break;
						case 3:
							if (ac!=0 && kapa==0) {
								System.out.println("\nLutfen once sogutucuyu kapatin!");
							} else {
								System.out.println("Cikis yapiliyor...");
								try {
									Thread.sleep(1000);
								} catch (InterruptedException e) {
									e.printStackTrace();
								}
								System.out.println("Cihaz kapandi.");
								cihazKapali = true;
								System.exit(1);
							}
							break;
						}

					} while (islemsecim != 1 || islemsecim != 2 || islemsecim != 3);

				}
			} while (secim != 1);
		}

	}

}
