package sec02.Writer;

import java.io.FileWriter;
import java.io.Writer;

public class WriteExample4 {

	public static void main(String[] args) throws Exception{
		Writer write = new FileWriter("C:/Temp/test.txt");
		
		String data = "안녕 자바 프로그램";
		// write.write(data);
		write.write(data, 3, 2);
		write.flush();
		write.close();
	}

}
