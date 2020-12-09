
public class Smoki extends Traka {

	Smoki()	{
		super();
	}
	
	Smoki(int Sifra, int Sprat, int maxk, String ime)	{
		super(Sifra, Sprat, maxk, ime);
	}
	
	@Override
	public void pocniSRadom(int kol) {
		// TODO Auto-generated method stub
		this.start();
		if(kol>maxKap)
			System.out.println("Maksimalno moze da se prosledi " + maxKap + "g kikirikija.");
		else System.out.println("Prosledjeno je " + kol + "g kikirikija.");
		System.out.println("Proizvesce se "+ kol/20 +" kesica smokija.\n\n");	//20g kikirikja za 1 kesu smokija
	}

}
