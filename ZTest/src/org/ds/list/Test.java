package org.ds.list;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.one.Student;

public class Test {
	
	
	
	
	
	public static void main(String[] args) {
		
		System.out.println(Math.max(10, 20));
		
		
	}
	
	private static void test(List<Object> objs) {
		
		if(objs.get(0) instanceof Student) {
			System.out.println("inside ");
		}
	}

}
