package com.jabagain.test;

import java.io.PrintStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class App {

	public static void main(String[] args) throws Exception {
//		System.out.println("Hello World");
		
		
		Map<String, String> map = new HashMap<String, String>();
		
		Set<String> set = new HashSet<String>();
		set.stream();
		
		Queue<String> q = new LinkedList<String>();
		q.add("jake");
		q.add("acido");
		q.add("bagain");
		
		q.stream().forEach(System.out::println);
		
		
//		File file = new File("test.txt");
//		if(file != null) {
//			System.out.println("File exists.");
////			FileReader fr = new FileReader(file);
//			Scanner scan = new Scanner(file);
//			scan.
//			fr.close();
//			
//		}
		
	}
	
	public void passName() {
		printName(String.valueOf("test"));
	}
	
	
	public void printName(String name) {
		
	}
}
