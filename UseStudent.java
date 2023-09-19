package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class UseStudent {

	public static void main(String[] args) {
		Student s1 = new Student("kamal", 422,490,"b+ve","male");
		Student s2 = new Student("raja", 44,450,"ab+ve","male");
		Student s3 = new Student("rani", 55,390,"B+ve","female");
		Student s4 = new Student("selvi", 66,290,"ab+ve","female");
		Student s5 = new Student("kalai", 52,190,"O+ve","male");
		Student s6 = new Student("chandru", 22,420,"Ab+ve","male");
		ArrayList<Student> stu = new ArrayList<>();
		stu.add(s1);
		stu.add(s2);
		stu.add(s3);
		stu.add(s4);
		stu.add(s5);
		stu.add(s6);
		List<Student> a = stu.stream().filter(x -> x.getBloodgroup().equalsIgnoreCase("ab+ve")&& x.getGender().equalsIgnoreCase("male")).collect(Collectors.toList());
		//a.forEach(y -> System.out.println(y));
		Map<Integer,Student> b = stu.stream().filter(l -> l.getGender().equalsIgnoreCase("male") && l.getMarks()>450).collect(Collectors.toMap(x -> x.getId(), y -> y));
		b.forEach((x,y)-> System.out.println(x+" "+y));
		
		
		Long d = stu.stream().filter(c -> c.getName().startsWith("r")).count();
		System.out.println(d);

	}

}
