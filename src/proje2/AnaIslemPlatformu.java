package proje2;

import java.util.Scanner;

public class AnaIslemPlatformu {
	public static void main(String[] args) throws InterruptedException {
		Scanner scan = new Scanner(System.in);
		IVeriTabani giris = new VeriTabani();

		String kullaniciAdi, sifre;

		System.out.println("**Kullanici Adinizi Giriniz**");
		kullaniciAdi = scan.nextLine();
		if (giris.userName(kullaniciAdi)) {
			System.out.println("**Sifrenizi Giriniz**");
			sifre = scan.nextLine();
			if (giris.login(kullaniciAdi, sifre)) {
				AgArayuzu agarayuz = new AgArayuzu();
			}

		}

	}
}
