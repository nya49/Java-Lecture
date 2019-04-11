package sec02.Reader;

import java.io.FileReader;
import java.io.Reader;

public class ReadExample1 {

	public static void main(String[] args) throws Exception{
		Reader reader = new FileReader("C:/Temp/test.txt");
		int readByte;
		while(true) {
			readByte = reader.read();
			if(readByte == -1) break;
			System.out.println((char)readByte);
		}
		reader.close();
	}

}
