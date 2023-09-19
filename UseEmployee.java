package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UseEmployee {

	public static void main(String[] args) {
		Employee e1 = new Employee("kamal", 24, 25000,"developer",4,"male");
		Employee e2 = new Employee("raja", 26, 35000,"developer",5,"male");
		Employee e3 = new Employee("raju", 30, 55000,"developer",6,"male");
		Employee e4 = new Employee("kala", 43, 65000,"developer",7,"female");
		Employee e5 = new Employee("selvi", 30, 15000,"developer",3,"female");
		Employee e6 = new Employee("kumar", 29, 75000,"developer",10,"male");
		Employee e7 = new Employee("chandru", 54, 85000,"developer",11,"male");
		Employee e8 = new Employee("lakshimi", 34, 95000,"developer",12,"female");
		Employee e9 = new Employee("sneha", 30, 125000,"developer",15,"feale");
		ArrayList<Employee> emp = new ArrayList<>();
		emp.add(e1);
		emp.add(e2);
		emp.add(e3);
		emp.add(e4);
		emp.add(e5);
		emp.add(e6);
		emp.add(e7);
		emp.add(e8);
		emp.add(e9);
		//List<Employee> a= emp.stream().filter(x -> x.getGender().equals("male")).collect(Collectors.toList());
		List<Employee> high = emp.stream().filter(k -> k.getExperience()>5).collect(Collectors.toList());
		
		high.forEach(s -> System.out.println(s));
	//	List<String> salary = emp.stream().filter(l -> l.getSalary()>30000 && l.getSalary()< 50000).map(v -> v.getName()).collect(Collectors.toList());
		//a.forEach(n -> System.out.println(n));
		
		//salary.forEach(s -> System.out.println(s));
		

	}

}
