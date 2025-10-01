package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetName {
	public static void main(String[] args) {
		Set<SetDemo> s = new HashSet<SetDemo>();
		
		s.add(new SetDemo(11,"Ram", 50000, "Infosys"));
		s.add(new SetDemo(12,"Sham", 65000, "TCS"));
		s.add(new SetDemo(13,"Dinesh", 70000, "CDAC"));
		s.add(new SetDemo(18,"Abhay", 41000, "Capgemini"));
		s.add(new SetDemo(15,"Sagar", 35000, "CDAC"));
		s.add(new SetDemo(16,"Harshal", 80000, "Google"));
		s.add(new SetDemo(20,"Tejas", 90000, "Amazon"));
		
		s.forEach(System.out::println);
		
		List<SetDemo> li = new ArrayList<>(s);
		System.out.println("Name based on ascending order");
		Collections.sort(li, new Comparator<SetDemo>() {
			public int compare(SetDemo s1, SetDemo s2) {
				return s1.getName().compareTo(s2.getName());
			}
		});
		li.forEach(System.out::println);
		
		System.out.println("Name based on DEC order");
		li.stream()
		  .filter(p -> p.getName() != null)
		  .sorted((s1, s2) -> s2.getName().compareTo(s1.getName()))
		  .forEach(System.out::println);
		
		System.out.println("Name based on length");
		li.stream()
		  .filter(p -> p.getName() != null)
		  .sorted((s1, s2) -> s1.getName().length() - s2.getName().length())
		  .forEach(System.out::println);
		
		System.out.println("Salary ASC order");
		li.stream()
		  .filter(p -> p.getSalary() != 0)
		  .sorted((s1, s2) -> Double.compare(s1.getSalary(), s2.getSalary()))
		  .forEach(System.out::println);
		
		System.out.println("ASC order based on id");
		li.stream()
		  .filter(p -> p.getId() != 0)
		  .sorted((s1, s2) -> Integer.compare(s1.getId(), s2.getId()))
		  .forEach(System.out::println);
		
		System.out.println("top 3 based on salary");
		li.stream()
		  .filter(p -> p.getSalary() != 0)
		  .sorted((s1, s2) -> Double.compare(s2.getSalary(), s1.getSalary()))
		  .limit(3)
		  .forEach(System.out::println);
		
		System.out.println("name of cdac employee");
		li.stream()
		  .filter(p -> p.getCname().equalsIgnoreCase("CDAC"))
		  .forEach(System.out::println);
		
		System.out.println("");
		
		li.stream()
		  .filter(p -> p.getSalary() >= 50000)
		  .forEach(System.out::println);
	}
}
