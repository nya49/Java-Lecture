package JavaCodingT;

public class ex04 {

	public static void main(String[] args) {
		int[] num = new int[10];
        for (int i=1; i<=1000; i++){
            if(i/10==0){
                num[i]++;
            }
            else if(i/100==0){
                num[i/10]++;
                num[i-(i/10)*10]++;
            }
            else if(i/1000==0){
                num[i/100]++;
                num[(i/10)-(i/100)*10]++;
                num[i-(i/10)*10]++;
            }
            else{
                num[0] = num[0] + 3;
                num[1] = num[1] + 1;
            }
        }
        for (int k=0; k<=9; k++){
            System.out.println(k+"의 개수는 "+num[k]);
        }

	}
}
