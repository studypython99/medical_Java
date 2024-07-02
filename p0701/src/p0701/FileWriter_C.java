package p0701;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriter_C {

	public static void main(String[] args) {
		
		String str = "s0003,이순신,100,100,100,300,100.0,0\r\n";
		str +=  "s0004,김구,80,80,80,240,80.0,0\r\n";
		str +=  "s0005,강감찬,70,70,70,210,70.0,0\r\n";
		
		try {
			FileWriter fw = new FileWriter("c:/save/abc.txt",true); // false:덮어쓰기 true: 이어쓰기
			BufferedWriter bw = new BufferedWriter(fw); //한번에 저장
			bw.write(str);
			bw.close();
		} catch (IOException e) {e.printStackTrace();}
		
		System.out.println("파일에 내용을 저장했습니다.");
		
	}
}
