using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _17150_Djordje_Jovanovic_Lab_4
{
    class Program
    {
        static void Main(string[] args)
        {
			Fabrika Test = new Fabrika(5);

			Traka t1 = new Lizalice(1, 2, 10000, "Tina");
			Traka t2 = new Cokolady(2, 2, 7000, "Milorad");
			Traka t3 = new Smoki(3, 1, 15000, "Nadja");

			Test.Dodaj(t1);
			Test.Dodaj(t2);
			Test.Dodaj(t3);

			Test.Pokreni(0, 17000);
			Test.Pokreni(1, 3500);
			Test.Pokreni(2, 5600);

			Test.Kraj();

		}
	}
}
