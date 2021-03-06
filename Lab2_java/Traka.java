public abstract class Traka {
	
	protected int sifra;
	protected int sprat;
	protected boolean aktivna;
	protected int maxKap;	//neka bude u gramima
	protected String imeS;
	
	Traka()	{
		sifra = 0;
		sprat = 0;
		aktivna = false;
		maxKap = 0;
		imeS = "/";
	}
	
	Traka(int Sifra, int Sprat, int MaxKap, String ime)	{
		sifra = Sifra;
		sprat = Sprat;
		aktivna = false;
		maxKap = MaxKap;
		imeS = ime;
	}
	
	final public void start()	{
		aktivna = true;
		System.out.println("Traka " + sifra + " pocinje sa radom!\n");		
	}
	
	public abstract void pocniSRadom(int kol);
	
	public void staniSRadom()	{
		aktivna = false;
		System.out.println("Traka " + sifra + " je stala sa radom!");
	}
	
}
