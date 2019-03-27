package sec08;

import java.util.StringTokenizer;

public class StringTokenizerExample {

	public static void main(String[] args) {
		
		String path = System.getenv("PATH");
		
		StringTokenizer st = new StringTokenizer(path, ";");
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
		}
	}

}
