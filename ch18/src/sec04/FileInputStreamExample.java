package sec04;

import java.io.File;
import java.io.FileInputStream;

public class FileInputStreamExample {

	public static void main(String[] args) {
		try {
			File file = new File("D:\\workspace\\EGov\\java\\ch18\\src\\sec04\\FileInputStreamExample.java");
			FileInputStream fis = new FileInputStream(file);
			int data;
			while((data = fis.read()) != -1) {
				System.out.write(data);
			}
			fis.close();
		} catch(Exception e) {
			e.printStackTrace();
		}

	}

}
