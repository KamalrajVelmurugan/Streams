package streams;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class UseEmployee1 {

	public static void main(String[] args) {
		Employee1 e1 = new Employee1("kamal", 24, 25000,"developer",4,"male",40);
		Employee1 e2 = new Employee1("raja", 26, 35000,"developer",5,"male",39);
		Employee1 e3 = new Employee1("raju", 30, 55000,"developer",6,"male",22);
		Employee1 e4 = new Employee1("kala", 43, 65000,"developer",7,"female",33);
		Employee1 e5 = new Employee1("selvi", 30, 15000,"developer",3,"female",44);
		Employee1 e6 = new Employee1("kumar", 29, 75000,"developer",10,"male",45);
		Employee1 e7 = new Employee1("chandru", 54, 85000,"developer",11,"male",60);
		Employee1 e8 = new Employee1("lakshimi", 34, 95000,"developer",12,"female",9);
		Employee1 e9 = new Employee1("sneha", 30, 125000,"developer",15,"feale",10);
		HashMap<Integer, Employee1> emp = new HashMap<>();
		emp.put(e1.getId(), e1);
		emp.put(e2.getId(), e2);
		emp.put(e3.getId(), e3);
		emp.put(e4.getId(), e4);
		emp.put(e5.getId(), e5);
		emp.put(e6.getId(), e6);
		emp.put(e7.getId(), e7);
		emp.put(e8.getId(), e8);
		emp.put(e9.getId(), e9);
		Map<Integer, Employee1> a = emp.values().stream().filter(x -> x.getAge()>=35).collect(Collectors.toMap(f -> f.getId(), l-> l));
		a.forEach((x,y) -> System.out.println(x+""+y));
		
	}

}
