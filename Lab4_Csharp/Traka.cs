using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _17150_Djordje_Jovanovic_Lab_4
{
	abstract class Traka
	{
		protected int sifra;
		protected int sprat;
		protected bool aktivna;
		protected int maxKap;   //neka bude u gramima
		protected String imeS;

		public int Sifra
		{
			get { return sifra; }
			set { this.sifra = value; }
		}
		public int Sprat
		{
			get { return sprat; }
			set { this.sprat = value; }
		}
		public bool Aktivna
		{
			get { return aktivna; }
			set { this.aktivna = value; }
		}
		public int MaxKap
		{
			get { return maxKap; }
			set { this.maxKap = value; }
		}
		public string ImeS
		{
			get { return imeS; }
			set { this.imeS = value; }
		}


		public Traka()
		{
			Sifra = 0;
			Sprat = 0;
			Aktivna = false;
			MaxKap = 0;
			ImeS = "/";
		}

		public Traka(int ssifra, int ssprat, int mmaxKap, String ime)
		{
			Sifra = ssifra;
			Sprat = ssprat;
			Aktivna = false;
			MaxKap = mmaxKap;
			ImeS = ime;
		}

		public void Start()
		{
			Aktivna = true;
			Console.WriteLine("Traka " + Sifra + " pocinje sa radom!\n");
		}

		public abstract void PocniSRadom(int kol);

		public void StaniSRadom()
		{
			Aktivna = false;
			Console.WriteLine("Traka " + Sifra + " je stala sa radom!");
		}
	}
}
