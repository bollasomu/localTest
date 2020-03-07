package org.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class MapSortTest {

	public static void main(String[] args) {

		Employee e1 = new Employee(1,"zahi","bangalore",9000);
		Employee e2 = new Employee(2,"yaman","chennai",7000);
		Employee e3 = new Employee(3,"prem","hyderabad",6000);
		Employee e4 = new Employee(4,"chandu","vijayawada",90000);
		Employee e5 = new Employee(5,"dayan","pune",50000);
		
		Map<Integer,Employee> employeesMap = new HashMap<>();
		employeesMap.put(5,e5);
		employeesMap.put(1,e1);
		employeesMap.put(4,e4);
		employeesMap.put(3,e3);
		employeesMap.put(2,e2);
		
		System.out.println("employee map before sorting : "+ employeesMap);
		
		
		List<Entry<Integer,Employee>> listEmployees = new ArrayList<>(employeesMap.entrySet());
		
		Collections.sort(listEmployees, new Comparator<Entry<Integer,Employee>>() {	
			@Override
			public int compare(Entry<Integer,Employee> e1, Entry<Integer,Employee> e2) {
				
				return e2.getValue().getName().compareTo(e1.getValue().getName());
			}
		});
		
		System.out.println("after sorting "+ listEmployees);

	}


}
