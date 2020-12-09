using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _17150_Djordje_Jovanovic_Lab_4
{
    class Fabrika
    {
		private int maxTraka;
		private int trenTraka;
		private Traka[] tr;

		public int MaxTraka
		{
			get { return maxTraka; }
			set { maxTraka = value; }
		}
		public int TrenTraka
		{
			get { return trenTraka; }
			set { trenTraka = value; }
		}
		public Traka this[int i]
		{
			get { return tr[i]; }
			set { tr[i] = value; }
		}

		public Fabrika(int k)
		{
			TrenTraka = 0;
			MaxTraka = k;
			tr = new Traka[k];
		}

		public void Dodaj(Traka t)
		{
			if (TrenTraka < MaxTraka)
			{
				this[TrenTraka] = t;
				TrenTraka++;
			}
			else
			{
				Console.WriteLine("Ne moze dodati vise traka!");
			}
		}

		public void Pokreni(int i, int kol)
		{
			this[i].PocniSRadom(kol);
		}

		public void Kraj()
		{
			for (int i = 0; i < TrenTraka; i++)
				this[i].StaniSRadom();
		}

		public void Kraj(int i)
		{
			this[i - 1].StaniSRadom();
		}

	}
}
