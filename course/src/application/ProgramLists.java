package application;

import java.util.ArrayList;
import java.util.List;

public class ProgramLists {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Maria");
		list.add("Olavo");
		list.add("Amanda");
		list.add("Igor");
		System.out.println(list.size());
		for(String item : list) {
			System.out.println(item);
		}
		
		list.add(2, "Marco");
		System.out.println(list.size());
		for(String item : list) {
			System.out.println(item);
		}
		list.remove("Igor");
		list.removeIf(r -> r.charAt(0) == 'M');
		System.out.println(list.size());
		for(String item : list) {
			System.out.println(item);
		}
	}

}
