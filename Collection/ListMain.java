package collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
public class ListMain {
	public static void main(String[] args) {
		List<ListDemo> li = new ArrayList<ListDemo>();
		li.add(new ListDemo(101,"Dinesh","CS",7.77));
		li.add(new ListDemo(103,"Ram","CS",8.2));
		li.add(new ListDemo(104,"Sham","ME",7.52));
		li.add(new ListDemo(105,"Sagar","CS",9.7));
		li.add(new ListDemo(102,"Abhay","ETC",8.33));
		li.add(new ListDemo(108,"Harshal","ME",6.7));
		li.add(new ListDemo(109,"Tejas","CIVIL",9.65));
		li.add(new ListDemo(107,"Rahul","CS",9.45));
		li.add(new ListDemo(106,"Tanmay","IT",8.45));
		
		li.forEach(System.out::println);
		
		System.out.println("Name Based on ASC order");
		Collections.sort(li, new Comparator<ListDemo>() {
			public int compare(ListDemo s1, ListDemo s2) {
				return s1.getName().compareTo(s2.getName());
			}
		});
		li.forEach(System.out::println);
		System.out.println("--------------------");
		
		li.stream()
		  .filter(s -> s.getName() != null)
		  .sorted((s1, s2) -> s1.getName().compareTo(s2.getName()))
		  .forEach(System.out::println);
		
		
		
		System.out.println("Name Based on DEC order");
		Collections.sort(li, new Comparator<ListDemo>() {
			public int compare(ListDemo s1, ListDemo s2) {
				return s2.getName().compareTo(s1.getName());
			}
		});
		li.forEach(System.out::println);
		
		System.out.println("Name Based on length of there name");
		Collections.sort(li, new Comparator<ListDemo>() {
			public int compare(ListDemo s1, ListDemo s2) {
				return s1.getName().length() - s2.getName().length();
			}
		});
		li.forEach(System.out::println);
		
		System.out.println("Asc order based on roll no");
		Collections.sort(li, new Comparator<ListDemo>() {
			public int compare(ListDemo s1, ListDemo s2) {
				return Integer.compare(s1.getRno(), s2.getRno());
			}
		});
		li.forEach(System.out::println);
		
		System.out.println("Student with highest GPA");
		Collections.sort(li, new Comparator<ListDemo>() {
			public int compare(ListDemo s1, ListDemo s2) {
				return Double.compare(s2.getGpa(), s1.getGpa());
			}
		});
		li.stream().limit(1).forEach(System.out::println);
		
		System.out.println("Top 5 based on gpa");
		Collections.sort(li, new Comparator<ListDemo>() {
			public int compare(ListDemo s1, ListDemo s2) {
				return Double.compare(s2.getGpa(), s1.getGpa());
			}
		});
		li.stream().limit(5).forEach(System.out::println);
		
		System.out.println("Top 2 in CS branch based on gpa");
		li.stream()
		  .filter(s -> s.getBranch().equalsIgnoreCase("CS"))
		  .sorted((s1, s2) -> Double.compare(s2.getGpa(), s1.getGpa()))
		  .limit(2)
		  .forEach(System.out::println); 
		
		
		System.out.println("All CS student");
		li.stream()
		  .filter(s -> s.getBranch().equalsIgnoreCase("CS"))
		  .forEach(System.out::println);
		
		System.out.println("Average gpa of CS ");
		double avg = li.stream()
		  .filter(s -> s.getBranch().equalsIgnoreCase("CS"))
		  .mapToDouble(ListDemo::getGpa)
		  .average()
		  .orElse(0);
		System.out.println("Average GPA of CS : "+avg);
		  
		System.out.println("Avreage GPA by branch");
		Map<String, Double> avgByBranch = li.stream()
				  .collect(Collectors.groupingBy(
						  ListDemo::getBranch,
				          Collectors.averagingDouble(ListDemo::getGpa)
						  ));
		avgByBranch.forEach((branch, avrg) -> System.out.println(branch + " -> Average GPA: " + String.format("%.2f", avrg)));
				  

	}
}
