package sec05.ex02;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample2 {

	public static void main(String[] args) {
		TreeSet<Integer> scores = new TreeSet<Integer>();
		scores.add(new Integer(87));
		scores.add(new Integer(98));
		scores.add(new Integer(75));
		scores.add(new Integer(95));
		scores.add(new Integer(80));
		
		for(Integer score : scores) {
			System.out.print(score + " ");
		}
		System.out.println();
		
		NavigableSet<Integer> descendingSet = scores.descendingSet();			// 내림차순
		for(Integer score : descendingSet) {
			System.out.print(score + " ");
		}
		System.out.println();
		
		NavigableSet<Integer> ascendingSet = descendingSet.descendingSet();		// 오름차순
		
		for(Integer score : ascendingSet) {
			System.out.print(score + " ");
		}
	}

}
