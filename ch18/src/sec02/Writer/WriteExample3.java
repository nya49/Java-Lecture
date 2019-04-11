package sec02.Writer;

import java.io.FileWriter;
import java.io.Writer;

public class WriteExample3 {

	public static void main(String[] args) throws Exception{
		Writer write = new FileWriter("C:/Temp/test.txt");
		char[] data = "홍길동".toCharArray();
		write.write(data, 1, 2);
		write.flush();
		write.close();
	}

}
