package streams;
import java.util.*;

import java.util.stream.Collectors;

public class Task_1 {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<>();
		names.add("raja");
		names.add("kamal");
		names.add("chanru");
		names.add("bala");
		names.add("gaja");
		//names.stream().filter(x -> x.startsWith("r")).forEach(x -> System.out.println(x));
		List<String> a = names.stream().filter(y -> y.endsWith("a")).collect(Collectors.toList());
		a.forEach(k -> System.out.println(k));
		System.out.println(a);
	}

}
