public class Fabrika {
	
	private int maxTraka;
	private int trenTraka;
	private Kolekcija<Traka> KOL;
	
	Fabrika(int k) {
		trenTraka = 0;
		maxTraka = k;
		KOL = new Kolekcija<Traka>(k);
		KOL.tr=new Traka[k];
	}
	
	public void dodaj(Traka t)	{
		if(trenTraka < maxTraka)
			KOL.dodaj(t);
		else
			System.out.println("Nemoguce je dodati vise traka!");
	}
	
	public void pokreni(int i, int kol) {
		KOL.tr[i].pocniSRadom(kol);
	}
	
	public void kraj()	{
		for(int i=0; i<trenTraka; i++)
			KOL.tr[i].staniSRadom();
	}
	
	public void kraj(int i)	{
		KOL.tr[i-1].staniSRadom();
	}
}