package JavaCodingT_0327;

public class ex01 {

	public static void main(String[] args) {
		
		int total = 0;

        for(int i=10; i<=1000; i++){

            Integer num = i; 
            int cnt = 1;
            String value = num.toString();
            char[] chArray = value.toCharArray();

            for( char ch : chArray){
                cnt *= Character.getNumericValue(ch);
            }

            total += cnt; 
        }

        System.out.println(total);

	}

}
