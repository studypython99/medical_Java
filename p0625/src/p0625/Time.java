package p0625;

class Time { // public제거, 같은클래스, 같은패키지에서만 접근가능
	private int hour;
	private int minute;
	private int second;
	private int day;
	
	public int getHour()//출력
	{
		return hour;
	}
	
	public void setHour(int hour)//입력
	{
		if(hour<0 || hour>23)
		{
			System.out.println("잘못된 데이터를 입력했습니다.");
			return;
		}
		
		this.hour = hour;
	}
	

}
