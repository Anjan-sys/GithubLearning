import java.util.*;
public class Camelcase
{
	public static String tocamelcase(String s)
	{
		String[] words = s.trim().split("\\s+");
		StringBuilder camelcase = new StringBuilder();
		for(int index=0;index<words.length;index++)
		{
		 System.out.println(words[index]);
		}	
		for(int index=0;index<words.length;index++)
		{
		String word = words[index];
		if(index==0)
		{
			camelcase.append(word.substring(0,1).toUpperCase()).append(word.substring(1).toLowerCase());
		}				
		else
		{
			camelcase.append(word.substring(0,1).toUpperCase()).append(word.substring(1).toLowerCase());
		}
	}
		return camelcase.toString();
	}	
	public static void main(String args[])
	{

		String s = " Hello this is anjankumar ";
		String Camelcasestring = tocamelcase(s);
		System.out.println(Camelcasestring);
		
		//System.out.println(s.replace(" t,","T"));*/
	}
}
