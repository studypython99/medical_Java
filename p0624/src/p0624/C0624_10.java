package p0624;

public class C0624_10 {

	public static void main(String[] args) {
		Stu_score s = new Stu_score();
		s.stuNo = "s0001";
		s.name = "홍길동";
		s.kor = 100;
		s.eng = 99;
		s.math = 87;
		s.total = s.kor+s.eng+s.math;
		s.avg = s.total/3.0;
		
		//위의 형태에서, 아래의 형태로 
		
		//매개변수가 있는 생성자 사용
		Stu_score s2 = new Stu_score("s0002","유관순",100,88,85);
		
		Stu_score s3 = new Stu_score();
//		s3 = s2; //얕은복사, 주소값만 복사 둘다 같아진다
				//이렇게 하면 안된다;;
//		s3.kor = 10;
//		System.out.println(s2.kor);
	}
}
