package JavaCodingT_0327;

public class ex07 {

	public static void main(String[] args) {
		
		int a, b, c = 0;
		for(a=1; a<1000; a++) {
			for(b=1; b<1000; b++) {
				for(c=1; c<1000; c++) {
					if(a<b && (a+b+c) == 1000 && Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2)) {
						System.out.println("a+b+c=1000이 되는 a=" + a + ", b=" + b + ", c=" + c);
					}
				}
			}
		}
	}

}
