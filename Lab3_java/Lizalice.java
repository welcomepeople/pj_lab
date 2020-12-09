
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
		try {
		
			this.start();
			if(kol>maxKap)
				throw new MaximumCapacityExceeded("Kapacitet trake je premasen, molim Vas pozovite "+imeS+"\n");
			else
				System.out.println("Napravljeno je " + kol/15 + " lizalica.\n");
		}
		catch(MaximumCapacityExceeded e)
		{
			System.out.println(e);
		}
	}
	
}
