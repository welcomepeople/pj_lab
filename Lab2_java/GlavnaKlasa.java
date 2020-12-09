
public class GlavnaKlasa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fabrika Test = new Fabrika(3);
		
		Traka t1 = new Lizalice(1, 2, 10000, "Petar");
		Traka t2 = new Cokolady(2, 2, 7000, "Milorad");
		Traka t3 = new Smoki(3, 1, 15000, "Nadja");
		
		Test.dodaj(t1);
		Test.dodaj(t2);
		Test.dodaj(t3);
		
		Test.pokreni(0, 17000);
		Test.pokreni(1, 3500);
		Test.pokreni(2, 5600);
		
		Test.kraj();
	}

}
