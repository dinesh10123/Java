package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmpMain {

	public static void main(String[] args) {
		
		List<EmpDemo> li = new ArrayList<EmpDemo>();
		
		li.add(new EmpDemo(102,"Dinesh",60000,"IT","CDAC"));
		li.add(new EmpDemo(106,"Ram",50000,"Cyber","TCS"));
		li.add(new EmpDemo(109,"Sham",55000,"Data","Wipro"));
		li.add(new EmpDemo(105,"Ajay",45000,"Web","Amazon"));
		li.add(new EmpDemo(104,"Vijay",75000,"IT","CDAC"));
		li.add(new EmpDemo(107,"Sagar",40000,"Cyber","Google"));
		li.add(new EmpDemo(108,"Abhay",35000,"IT","CDAC"));
		
		System.out.println("Sort by name");
		Collections.sort(li, new Comparator<EmpDemo>() {
			public int compare(EmpDemo s1, EmpDemo s2) {
				return s1.getName().compareTo(s2.getName());
			}
		});
		li.forEach(System.out::println);
		
		System.out.println("DES order by ID");
		li.stream()
		  .filter(s -> s.getId() != 0)
		  .sorted((s1, s2) -> Integer.compare(s2.getId(), s1.getId()))
		  .forEach(System.out::println);
		
		System.out.println("Salary >=50000");
		li.stream()
		  .filter(s -> s.getSalary() >= 50000)
		  .forEach(System.out::println);
		
		System.out.println("Top 3 highest paid employees");
		li.stream()
		  .filter(s -> s.getSalary() != 0)
		  .sorted((s1, s2) -> Double.compare(s2.getSalary(), s1.getSalary()))
		  .limit(3)
		  .forEach(System.out::println);
		
		System.out.println("Average of Each Dept");
		Map<String, Double> avgByDept = li.stream()
				.collect(Collectors.groupingBy
						(EmpDemo::getDeptname,
						Collectors.averagingDouble(EmpDemo::getSalary)));
		avgByDept.forEach((deptname, avg) -> System.out.println(deptname + " Average is " + String.format("%.2f", avg)));
		

	}

}
