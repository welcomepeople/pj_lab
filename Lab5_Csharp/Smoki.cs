using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _17150_Djordje_Jovanovic_PJ_Lab_5
{
    class Smoki	:	Traka
    {
		public Smoki()
			: base()
		{

		}

		public Smoki(int Sifra, int Sprat, int maxk, String ime)
			: base(Sifra, Sprat, maxk, ime)
		{

		}

		public override void PocniSRadom(int kol)
		{
			this.Start();
			if (kol > MaxKap)
				Console.WriteLine("Maksimalno moze da se prosledi " + MaxKap + "g kikirikija.");
			else Console.WriteLine("Prosledjeno je " + kol + "g kikirikija.");
			Console.WriteLine("Proizvesce se " + kol / 20 + " kesica smokija.\n");   //20g kikirikja za 1 kesu smokija
		}
	}
}
