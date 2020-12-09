import java.io.*;
public class Fabrika {
	
	private Kolekcija<Traka> KOL;
	
	Fabrika(int k) {
		KOL = new Kolekcija<Traka>(k);
		KOL.tr=new Traka[k];
	}
	
	public void dodaj(Traka t)	{
			KOL.dodaj(t);
	}
	
	public void pokreni(int i, int kol) {
		KOL.tr[i-1].pocniSRadom(kol);
	}
	
	public void kraj()	{
		KOL.staniSRadom();
	}
	
	public void kraj(int i)	{
		KOL.tr[i-1].staniSRadom();
	}
	
	public void ucitajIzTxt(String imeDat)
	{
		try
		{
			FileReader dat = new FileReader(imeDat);
			BufferedReader bdat = new BufferedReader(dat);
			KOL.citajIzTxt(imeDat, bdat);
			bdat.close();
		}
		catch(IOException e)
		{
			System.out.println("Greska: " + e.toString());
		}
	}
}