package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;



public class Task_2 {

	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<>();
		nums.add(55);
		nums.add(10);
		nums.add(75);
		nums.add(33);
		nums.add(43);
		nums.add(07);
		nums.add(100);
		nums.add(90);
		nums.add(11);
		nums.add(11);
		nums.stream().filter(x -> (x > 50)).forEach(k -> System.out.println(k));
		List<Integer> a = nums.stream().filter(y -> y>50).collect(Collectors.toList());
		a.forEach(s -> System.out.println(s+" Greater than 50"));
		Set<Integer> b = nums.stream().filter(l -> l <50).collect(Collectors.toSet());
		b.forEach(g -> System.out.println(g+" Less than 50"));
		

	}

}
