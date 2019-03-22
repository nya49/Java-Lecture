package JavaInterface.Opench03;

import java.util.Arrays;
import java.util.Collections;

public class MySortImpl implements MySort{

	@Override
	public String[] sort(String[] strArray) {
		Arrays.sort(strArray);
		for(int i=0; i<strArray.length; i++) {
			System.out.println(strArray[i]);
		}
		return strArray;
	}

	@Override
	public String[] sort(String[] strArray, boolean descOrder) {
			Arrays.sort(strArray,Collections.reverseOrder());
			for(int i=0; i<strArray.length; i++) {
				System.out.println(strArray[i]);
			}

		return strArray;
	}

	
}
