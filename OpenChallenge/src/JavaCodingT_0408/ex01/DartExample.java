package JavaCodingT_0408.ex01;

import java.util.Scanner;

public class DartExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("입력 > ");
        int cnt=0;
        String input = sc.next();
        char [] inputC = input.toCharArray();

        for(char a : inputC)    //항의 갯수
            if(a=='S' || a=='D' || a=='T')
                cnt++;

        int [] answer_arr = new int[cnt];

        for(int i=1,j=0;i<inputC.length;i++){
            if(inputC[i]=='S' || inputC[i]=='D' || inputC[i]=='T'){
                if(inputC[i]=='S'){
                    if(inputC[i-1]=='0' && inputC[i-2]=='1'){
                        answer_arr[j]=10;
                    }else{
                        Character a1 = new Character(inputC[i-1]);
                        answer_arr[j] = Integer.parseInt(a1.toString());
                    }
                }else if(inputC[i]=='D'){
                    if(inputC[i-1]=='0' && inputC[i-2]=='1'){
                        answer_arr[j]=10;
                    }else{
                    Character a1 = new Character(inputC[i-1]);
                    answer_arr[j] = (int)Math.pow(Integer.parseInt(a1.toString()), 2);  
                    }
                }else if(inputC[i]=='T'){
                    if(inputC[i-1]=='0' && inputC[i-2]=='1'){
                        answer_arr[j]=10;
                    }else{
                    Character a1 = new Character(inputC[i-1]);
                    answer_arr[j] = (int)Math.pow(Integer.parseInt(a1.toString()), 3);
                    }
                }
                j++;
            }
            if(inputC[i]=='*'){
                if(j==1){
                    answer_arr[0]*=2;
                }else{
                    for(int k=j;k>j-2;k--){
                        answer_arr[k-1]*=2;
                    }
                }           
            }
            if(inputC[i]=='#'){
                    answer_arr[j-1] = answer_arr[j-1]*-1;
            }
        }

        int sum = 0;
        for(int a : answer_arr){
            sum+=a;
        }
        System.out.println(sum);

	}

}
