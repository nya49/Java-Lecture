package Exercise;

import java.io.FileReader;

public class ex07_AddLineNumberExample {

	public static void main(String[] args) throws Exception {
		String filePath = "D:\\workspace\\EGov\\java\\ch18\\src\\sec05\\ex02\\BufferedInputStreamExample.java";
		FileReader fr = new FileReader(filePath);
		
		int readCharNo;
		int counter = 1;
		
		System.out.print(counter++ + " : ");
		
		while((readCharNo=fr.read()) != -1) {
			System.out.print((char)readCharNo);
			if(readCharNo == '\n')
				System.out.print(counter++ + " : ");
		}
		fr.close();
	}

}
