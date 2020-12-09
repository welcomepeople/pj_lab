
public class Cokolady extends Traka {
	//potrebna je 1s da obradi 1g kakaa
	Cokolady()	{
		super();
	}
	
	Cokolady(int Sifra, int Sprat, int maxk, String ime)	{
		super(Sifra, Sprat, maxk, ime);
	}

	@Override
	public void pocniSRadom(int kol) {
		// TODO Auto-generated method stub
		try	
		{
		
			this.start();
			if(kol>maxKap)	
				throw new MaximumCapacityExceeded("Kapacitet trake je premasen, molim Vas pozovite "+imeS+"\n");
			else
				System.out.println("Potrebno je " + kol/60 + " minuta da se obradi " + kol + "g kakaa.");
				System.out.println("Proizvesce se "+ kol/45 + " cokolada.\n\n");	//za cokolady treba 45g kakaaaa
		}
		catch (MaximumCapacityExceeded e) {
			System.out.println(e);
		}
	}
}
