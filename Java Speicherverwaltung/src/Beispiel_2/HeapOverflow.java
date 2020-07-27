package Beispiel_2;

import java.util.ArrayList;

public class HeapOverflow {

	private ArrayList<Long[]> list = new ArrayList<Long[]>();
	
	public HeapOverflow() {
		runOverflow();
	}
	
	private void runOverflow() {
		while(true) {
			Long[] l = new Long[10000];
			list.add(l);
		}
	}
	
	public static void main(String[] args) {
		new HeapOverflow();
	}
}
