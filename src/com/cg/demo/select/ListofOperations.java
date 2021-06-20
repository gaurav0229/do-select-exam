package com.cg.demo.select;
import java.util.*;
class ArrayListOps {
	
	public ArrayList<Integer> makeArrayListInt(int n) {
		ArrayList<Integer> arraylist = new ArrayList<Integer>(n);
		for (int i = 0; i < n; i++) {
			arraylist.add(0);
		}
		return arraylist;
	}

	public ArrayList<Integer> reverseList(ArrayList<Integer> list) {
		Collections.reverse(list);
		return list;
	}

	public ArrayList<Integer> changeList(ArrayList<Integer> list, int m, int n) {
		Collections.replaceAll(list, m, n);
		return list;
	}
   
}
public class ListofOperations{
	public static void main(String[] args) {
		int n = 4;
		ArrayListOps values = new ArrayListOps();
		System.out.println(values.makeArrayListInt(n));
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(10, 25, 33, 28, 10, 12));
		System.out.println(values.reverseList(list));
		System.out.println(values.changeList(list, 28, 20));
	}
}
