
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
		try {
		
			this.start();
			if(kol>maxKap)
				throw new MaximumCapacityExceeded("Kapacitet trake je premasen, molim Vas pozovite " + imeS + "\n");
			else 
			{
				System.out.println("Prosledjeno je " + kol + "g kikirikija.");
				System.out.println("Proizvesce se "+ kol/20 +" kesica smokija.\n\n");	//20g kikirikja za 1 kesu smokija
			}
		}
		catch (MaximumCapacityExceeded e)
		{
			System.out.println(e);
		}
	}

}
