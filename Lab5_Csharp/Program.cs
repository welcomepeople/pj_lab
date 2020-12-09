using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _17150_Djordje_Jovanovic_PJ_Lab_5
{
    class Program
    {
        static void Main(string[] args)
        {
			UpisiUFajl();	TestPodaci();

			Fabrika Test = new Fabrika(5);

			Traka t1 = new Lizalice();
			Traka t2 = new Cokolady();
			Traka t3 = new Smoki();
			try
			{
				Test.Dodaj(t1);
				Test.Dodaj(t2);
				Test.Dodaj(t3);
			}
			catch(NemaMesta s)
			{
				Console.WriteLine(s.Message);
			}
			Test.Ucitaj("fabrika.bin");
			//Test.Pokreni(0);
			//Test.Pokreni(1);
			//Test.Pokreni(2);
			Test.Pokreni("test.bin");

			Test.Kraj();
		}

		static void UpisiUFajl()
		{
			try
			{
				using (BinaryWriter bw = new BinaryWriter(new FileStream("fabrika.bin", FileMode.Create)))
				{
					bw.Write(1); bw.Write(2); bw.Write(10000); bw.Write("Tina");
					bw.Write(2); bw.Write(2); bw.Write(7000);  bw.Write("Milorad");
					bw.Write(3); bw.Write(1); bw.Write(15000); bw.Write("Nadja");
				}
			}
			catch(IOException e)
			{
				Console.WriteLine(e.Message);
			}
		}
		static void TestPodaci()
		{
			try
			{
				using (BinaryWriter bw = new BinaryWriter(new FileStream("test.bin", FileMode.Create)))
				{
					bw.Write(17000);
					bw.Write(3500);
					bw.Write(5600);
				}
			}
			catch(IOException e)
			{
				Console.WriteLine(e.Message);
			}
		}
    }
}
