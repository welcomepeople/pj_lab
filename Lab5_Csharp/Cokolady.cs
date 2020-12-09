using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _17150_Djordje_Jovanovic_PJ_Lab_5
{
    class Cokolady : Traka
    {
		//potrebna je 1s da obradi 1g kakaa
		public Cokolady()
			: base()
		{

		}

		public Cokolady(int Sifra, int Sprat, int maxk, String ime)
			: base(Sifra, Sprat, maxk, ime)
		{

		}

		public override void PocniSRadom(int kol)
		{
			this.Start();
			Console.WriteLine("Potrebno je " + kol / 60 + " minuta da se obradi " + kol + "g kakaa.");
			Console.WriteLine("Proizvesce se " + kol / 45 + " cokolada.\n\n"); //za cokolady treba 45g kakaaaa
		}

	}
}
