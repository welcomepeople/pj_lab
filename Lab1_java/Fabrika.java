public class Fabrika {
	
	private int maxTraka;
	private int trenTraka;
	private Traka[] tr;
	
	Fabrika(int k) {
		trenTraka = 0;
		maxTraka = k;
		tr = new Traka[k];
	}
	
	public void dodaj(Traka t)	{
		if(trenTraka<maxTraka) {
				tr[trenTraka]=t;
				trenTraka++;
			}
		else	{
				System.out.println("Ne moze dodati vise traka!");	
			}
	}
	
	public void pokreni(int i, int kol) {
		tr[i].pocniSRadom(kol);
	}
	
	public void kraj()	{
		for(int i=0; i<trenTraka; i++)
			tr[i].staniSRadom();
	}
	
	public void kraj(int i)	{
		tr[i-1].staniSRadom();
	}
}