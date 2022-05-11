package proje2;

public class MerkeziIslemBirimi {
	Eyleyici eyleyici = new Eyleyici();

	public int AcmaIstegiGonder(int sicaklik)
    {
        return eyleyici.SogutucuAc(sicaklik);
    }
     
    public void KapamaIstegiGonder()
    {
        eyleyici.SogutucuyuKapat();
    }
   
}



