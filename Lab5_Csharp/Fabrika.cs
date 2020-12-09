using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Linq.Expressions;
using System.Text;
using System.Threading.Tasks;

namespace _17150_Djordje_Jovanovic_PJ_Lab_5
{
    class Fabrika
    {
		private Kolekcija<Traka> k;


		public Fabrika(int n)
		{
			k = new Kolekcija<Traka>(n);
		}

		public void Dodaj(Traka t)
		{
			k.Dodaj(t);
		}

		public void Pokreni(int i, int kol)
		{
			k.Pokreni(i, kol);
		}

		public void Kraj()
		{
			k.Kraj();
		}

		public void Kraj(int i)
		{
			k.Kraj(i);
		}

		public void Ucitaj(string s)
		{
			try
			{
				using (BinaryReader br = new BinaryReader(new FileStream(s, FileMode.Open)))
					k.Ucitaj(br);
			}
			catch(IOException e)
			{
				Console.WriteLine(e.Message);
			}
		}
		public void Pokreni(string s)
		{
			try
			{
				using (BinaryReader br = new BinaryReader(new FileStream(s, FileMode.Open)))
					k.Pokreni(br);
			}
			catch(IOException e)
			{
				Console.WriteLine(e.Message);
			}
		}
	}
}
