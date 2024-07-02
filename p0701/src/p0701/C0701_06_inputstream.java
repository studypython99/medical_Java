package p0701;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C0701_06_inputstream {

	public static void main(String[] args) throws Exception{
		//기본적인 InputStream 형태
		try {
			//파일에서 받아온다
		FileInputStream fis = new FileInputStream("c:/save/aaa.txt");
		int read = 0;
		try {
			while((read = fis.read()) !=-1) {
				System.out.println((char)read);
				}		
		
			} catch (IOException e) {e.printStackTrace();}
		} catch(FileNotFoundException e) {e.printStackTrace();}
		
		//		byte[] b = new byte[1024];
//		try {
//			fis.read(b);//파일 읽어오기
//			FileInputStream fis = new FileInputStream("c:/save/aaa.txt");
//			System.out.println(new String(b));
//			
//		} catch (Exception e) {e.printStackTrace();}
	}
}
