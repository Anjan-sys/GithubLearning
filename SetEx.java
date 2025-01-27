import java.util.*;
//import java.util.HashSet;
//import java.util.Set;
class SetEx
{
	public static void HashSetFun()
	{
		Set<String> set = new HashSet<>();
		set.add("Anjan");
		System.out.println("Set is:" + set);
	}
	public static void SortedSetFun()
	{
		SortedSet<Integer> set1 = new TreeSet<>();
		set1.add(10);
		set1.add(20);
		set1.add(30);
		set1.add(40);
		System.out.println("Set is:" + set1);
	}
	public static void TreeSetFun()
	{
		TreeSet<Integer> set2 = new TreeSet<>();
		set2.add(10);
		set2.add(20);
		set2.add(30);
		set2.add(40);
		System.out.println("Set is:" + set2);
	}
	public static void LinkedHashSetFun()
	{
		LinkedHashSet<Integer> set3 = new LinkedHashSet<>();
		set3.add(10);
		set3.add(20);
		set3.add(30);
		set3.add(40);
		System.out.println("Set is:" + set3);
	}
	public static void main(String args[])
	{
		HashSetFun();
		SortedSetFun();
		TreeSetFun();
		LinkedHashSetFun();
	}	
}