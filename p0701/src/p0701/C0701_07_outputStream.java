package p0701;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class C0701_07_outputStream {

	public static void main(String[] args) throws IOException {

		FileOutputStream fos = new FileOutputStream("c:/save/abc.txt");
		String str = "s0001,홍길동,100,100,100,300,100.0,0\r\n";
		str +=  "s0002,홍길동,50,50,50,150,50.0,0\r\n";
		// byte로 나눠서 저장한다. log 저장시 사용
		byte[] bytes = str.getBytes(); 
		for(byte b: bytes) { //단순 for문
			fos.write(b);
		}
		
//		for(int i=0;i<bytes.length;i++) {
//			
//		}
				
		
		System.out.println("파일에 글이 저장되었습니다.");
		
		///////////////////////////////////////////////////////////
		//try-catch
//		try {
//			FileOutputStream fos = new FileOutputStream("c:/save/abc.txt");
//			String str = "s0001,홍길동,100,100,100,300,100.0,0\r\n";
//			str +=  "s0002,홍길동,50,50,50,150,50.0,0\r\n";
//			// byte로 나눠서 저장한다. log 저장시 사용
//			byte[] bytes = str.getBytes(); 
//			for(byte b: bytes) { //단순 for문
//				fos.write(b);
//			}
//
//			
//		} catch(Exception e) {
//			e.printStackTrace();
//		}
//		System.out.println("파일에 글이 저장되었습니다.");
		
		
		
		
		
		/////////////////////////////////////////////////////////////
		//파일생성, 폴더생성
		//		String str = "c:/save1";
//		File folder = new File(str);
//		File file = new File(str+"/1.txt");
//		try {
//			if(!(folder.exists())) {
//				folder.mkdir(); //폴더가 없는경우 자동으로 생성
//			}
//			file.createNewFile();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		System.out.println("파일이 생성되었습니다.");
	}
}
