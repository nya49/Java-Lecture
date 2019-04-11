package sec02.Writer;

import java.io.FileWriter;
import java.io.Writer;

public class WriteExample2 {

	public static void main(String[] args) throws Exception{
		Writer write = new FileWriter("C:/Temp/test.txt");
		char[] data = "홍길동 홍길동".toCharArray();
		write.write(data);
		write.flush();
		write.close();
	}

}
