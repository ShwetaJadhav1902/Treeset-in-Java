package treeset;

import java.util.TreeSet;

public class TreeSetDemo {
public static void main(String[] args) {
	
	TreeSet<Integer> t=new TreeSet<>();
	t.add(40);
	t.add(50);
	t.add(10);
	t.add(100);
	t.add(30);
   
	for(Integer i:t) {
		System.out.println(i);
	}
}
}
