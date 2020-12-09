
public class Lizalice extends Traka {

	// jedna lizalica "zahteva" 15g secera
	
	Lizalice()	{
		super();
	}
	
	Lizalice(int Sifra, int Sprat, int maxk, String ime)	{
		super(Sifra, Sprat, maxk, ime);
	}
	
	@Override
	public void pocniSRadom(int kol) {
		// TODO Auto-generated method stub
		this.start();
		System.out.println("Napravljeno je " + kol/15 + " lizalica.");
		if(kol>maxKap)
			System.out.println("Molim Vas zovite " + imeS +".");
		System.out.println("\n");
	}
	
}
