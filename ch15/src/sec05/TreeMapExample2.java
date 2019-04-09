package sec05;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class TreeMapExample2 {

	public static void main(String[] args) {
		TreeMap<Integer, String> scores = new TreeMap<Integer, String>();
		scores.put(new Integer(87), "홍길동");
		scores.put(new Integer(98), "이동수");
		scores.put(new Integer(75), "박길순");
		scores.put(new Integer(95), "신용권");
		scores.put(new Integer(80), "김자바");
		
		NavigableMap<Integer, String> descendingMap = scores.descendingMap();			// 내림차순
		for(Map.Entry<Integer, String> score : descendingMap.entrySet()) {
			System.out.print(score.getKey() + "-" + score.getValue() + " ");
		}
		System.out.println();
		
		NavigableMap<Integer, String> ascendigMap = descendingMap.descendingMap();			// 내림차순
		for(Map.Entry<Integer, String> score : ascendigMap.entrySet()) {
			System.out.print(score.getKey() + "-" + score.getValue() + " ");
		}
		System.out.println();
		
		
		
	}

}
