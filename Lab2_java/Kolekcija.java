//import java.util.ArrayList;
import java.io.*;

public class Kolekcija <T extends Traka>{
		
	protected T[] tr;
	private int maxTr;	//max traka
	private int trenTr; //trenutno traka
		
	public <T>Kolekcija()
	{
		maxTr = 0;
		trenTr = 0;			//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		
	}
	
	public <T>Kolekcija(int x)
	{
		maxTr = x;
		trenTr= 0;
	}
	
	public void dodaj (T traka)
	{
		try
		{
		if(trenTr<maxTr)
			tr[trenTr++]=traka;
		else
			throw new Exception ("Ne moze dodati vise traka!");
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}
	
	public <T> void pocniSRadom(int i, int kol)
	{
		tr[i].pocniSRadom(kol);
	}
	
	public <T> void staniSRadom()
	{
		for(int i=0; i<trenTr; i++)
			tr[i].staniSRadom();
	}
	
	public <T> void staniSRadom(int i)	{
		tr[i-1].staniSRadom();
	}
	
	public <T> void citajIzTxt(String imeDat, BufferedReader bdat)
	{
			for(int i=0; i<trenTr; i++)
				tr[i].citajIzTxt(imeDat, bdat);
	}
}
