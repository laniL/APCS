package arrayList;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ToyStore
{
	private ArrayList<Toy> toyList;

	public ToyStore()
	{
		ArrayList<Toy> toyList = new ArrayList<Toy>();
	}

	public void loadToys( String toys, int count )
	{
		Toy a = new Toy(toys);
		a.setCount(count);
		toyList.add(a);
	}
  
  	public Toy getThatToy( String nm )
  	{
  		return null;
  	}
  
  	public String getMostFrequentToy()
  	{
  		int max = 0;
  		String maxToy = "";
  		for (int i=0; i<toyList.size(); i++) {
  			if (max < toyList.get(i).getCount()) {
  				max = toyList.get(i).getCount();
  				maxToy = toyList.get(i).getName();
  			}	
  		}
  		return maxToy;
  	}  
  
  	public void sortToysByCount()
  	{
  	}  
  	  
	public String toString()
	{
	   return "";
	}
}