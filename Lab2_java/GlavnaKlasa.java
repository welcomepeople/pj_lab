import java.io.*;

public class GlavnaKlasa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try		//pravljenje .txt fajlova
		{
			FileWriter f = new FileWriter("fajl.txt");
			BufferedWriter b = new BufferedWriter(f);
			b.write("1"); b.newLine();		b.write("2"); b.newLine();
			b.write("10000");b.newLine(); 	b.write("Petar");b.newLine();
			
			b.write("2"); b.newLine();		b.write("2"); b.newLine();
			b.write("7000");b.newLine(); 	b.write("Milorad");b.newLine();
			
			b.write("3"); b.newLine();		b.write("1"); b.newLine();
			b.write("15000");b.newLine(); 	b.write("Nadja");b.newLine();
			
			b.close();
			
			f = new FileWriter("fajl1.txt");
			b = new BufferedWriter(f);
			
			b.write("1"); b.newLine();		b.write("7000"); b.newLine();	b.write("2"); b.newLine();
			b.write("7500"); b.newLine();	b.write("3"); b.newLine();		b.write("5600"); b.newLine();
			
			b.close();
		}
		catch(IOException e)
		{
			System.out.println("Izuzetak: " + e);
		}
		
		
		Fabrika Test = new Fabrika(3);
		
		Traka t1 = new Lizalice();	Traka t2 = new Cokolady();	Traka t3 = new Smoki();
		
		Test.dodaj(t1); Test.dodaj(t2);	Test.dodaj(t3);
		Test.ucitajIzTxt("fajl.txt");
		
//		Test.pokreni(1, 7000);	Test.pokreni(2, 7500);	Test.pokreni(3, 5600);
		try
		{
			FileReader f = new FileReader("fajl1.txt");
			BufferedReader b = new BufferedReader(f);
			String rb; String kol;
			for(int i=0; i<3; i++)
			{
				rb = b.readLine();
				kol = b.readLine();
				Test.pokreni(Integer.parseInt(rb, 10), Integer.parseInt(kol, 10));
			}
		}
		catch(IOException e)
		{
			System.out.println("Greska: " + e.toString());
		}
		
		Test.kraj();
	}

}
