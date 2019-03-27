package JavaCodingT_0327;

public class ex06 {

	public static void main(String[] args) {
		int num;
		int big = 0;
		
		for(int i=100; i<1000; i++) {
			for(int k=1; k<1000; k++) {
				num = i*k;
				
				if(num/100000 == num%10) {
					if(num/10000%10 == num/10%10) {
						if(num/1000%10 == num/100%10) {
							if(big < num) {
								big=num;
							}
						}
					}
				}
			}
		}
		System.out.println(big);
	}
}
