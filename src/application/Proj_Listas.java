package application;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Proj_Listas {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Marco");
		list.add(2 , "Marco");
		
		System.out.println(list.size());
		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println("_______________________");
		list.removeIf(x -> x.charAt(0) == 'M');
		for (String x : list) {
			System.out.println(x);
		}
		System.out.println("_______________________");
		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		System.out.println("Index of Marco: " + list.indexOf("Marco"));
		
		System.out.println("_______________________");
		
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		for (String x : result) {
			System.out.println(x);
		}
		System.out.println("_______________________");
		
		String name = list.stream().filter(x -> x.charAt(0)== 'J').findFirst().orElse(null);
		System.out.println(name);
	}

}
