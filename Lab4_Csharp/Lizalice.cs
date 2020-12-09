using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _17150_Djordje_Jovanovic_Lab_4
{
    class Lizalice : Traka
    {
		// jedna lizalica "zahteva" 15g secera

		public Lizalice()
			: base()
		{

		}

		public Lizalice(int Sifra, int Sprat, int maxk, String ime)
			: base(Sifra, Sprat, maxk, ime)
		{
			
		}

	public override void PocniSRadom(int kol)
		{
			this.Start();
			Console.WriteLine("Napravljeno je " + kol / 15 + " lizalica.");
			if (kol > MaxKap)
				Console.WriteLine("Molim Vas zovite " + ImeS + ".\n");
		}
	}
}
