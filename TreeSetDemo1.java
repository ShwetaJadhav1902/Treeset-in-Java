package treeset;

import java.util.TreeSet;

public class TreeSetDemo1 {
	public static void main(String[] args) {
		
		TreeSet<String> t=new TreeSet<>();
		t.add("shweta");
		t.add("aishu");
		t.add("yog");
		t.add("niks");
		t.add("shree");
	   
		for(String s:t) {
			System.out.println(s);
		}
	}


}
