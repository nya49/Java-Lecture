package sec02.OutputStream;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample3 {

	public static void main(String[] args) throws Exception{
		OutputStream os = new FileOutputStream("C:/Temp/test.txt");
		byte[] data = "WriteExample2".getBytes();
		os.write(data);
		os.flush();
		os.close();
	}

}
