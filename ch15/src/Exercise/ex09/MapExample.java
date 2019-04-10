package Exercise.ex09;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapExample {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);
		
		String name = null;
		int maxScore = 0;
		int totalScore = 0;
		
		Set<Entry<String, Integer>> keySet = map.entrySet();
		int sum = 0;
		for(Entry<String, Integer> key : keySet) {
			if(maxScore <= key.getValue()) {
				maxScore = key.getValue();
				name = key.getKey();
			}
			sum += key.getValue();
			totalScore = sum/keySet.size();
		}
	
			
		System.out.println("평균점수 : " + totalScore);
		System.out.println("최고점수 : " + maxScore);
		System.out.println("최고점수를 받은 아이디 : " + name);
		
	}

}
