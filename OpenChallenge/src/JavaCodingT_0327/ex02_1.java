package JavaCodingT_0327;

import java.util.ArrayList;
import java.util.Scanner;

public class ex02_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String nums = sc.nextLine();          //6539864
        String [] array_nums = nums.split(""); //6,5,3,9,8,6,4

        ArrayList <String> list_nums = new ArrayList <String>();
        for(String i:array_nums){list_nums.add(i);} //["6","5","3","9","8","6","4"]

        for(int k=0;k<(array_nums.length)-1;k++){
            if(Integer.parseInt(list_nums.get(k))%2==1 && Integer.parseInt(list_nums.get(k+1))%2==1){
                list_nums.remove(k);
                list_nums.add(k,array_nums[k]+"-");
                }

            else if(Integer.parseInt(list_nums.get(k))%2==0 && Integer.parseInt(list_nums.get(k+1))%2==0){
                list_nums.remove(k);
                list_nums.add(k,array_nums[k]+"*");
                }
        }
        String result = "";
        for(String l:list_nums){result+=l;}
        System.out.println(result); 
	}
}
