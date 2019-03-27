package JavaCodingT_0327;

import java.util.Scanner;

public class ex05 {

	public static void main(String[] args) {
		
		String A = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String ans = "";
		int adr;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("문자열 입력 : ");
		String mun = scan.nextLine();
		System.out.print("n 입력 : ");
		int n =Integer.parseInt(scan.nextLine());
		n = n % 26;
		
		for(int i=0; i<mun.length(); i++) {
			String cnt = mun.substring(i, i+1);
			if(cnt.equals(" ")) {
				ans = ans+" ";
				continue;
			}
			adr = A.indexOf(cnt);
			ans = ans+A.substring(adr+n, adr+(n+1));
		}
		System.out.println(ans);
		scan.close();
	}

}
