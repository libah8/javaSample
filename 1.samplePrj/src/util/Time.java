package util;

public class Time {
	private int hour;
	private int minute;
	private int second;
	private boolean am = true;  //명시적인 초기화 am pm
	
	public Time() {
		
	}
	public Time(int hour, int minute, int second) {
		this.setHour(hour);
		this.setMinute(minute); //this.minute=minute;이면 들어오는 값이 유효성검사를 거치지지 않는다. setMinute를 이용해서 유효성검사.
		this.setSecond(second);
	}
	
	
	public boolean isAm() {
		return am;
	}
	public void setAm(boolean am) {
		this.am = am;
	}
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		if(hour<0||hour>23){
			return;
		}
		if(hour>=12) am = false;
		this.hour = hour;
	}
	public int getMinute() {
		return minute;
	}
	public void setMinute(int minute) {
		if(minute<0||minute>=60){
			return;
		}
		this.minute = minute;
	}
	public int getSecond() {
		return second;
	}
	public void setSecond(int second) {
		if(second<0||second>60){
			return;
		}
		this.second = second;
	}
	
	
	/*toString메소드와 display메소드는 같은 의미의 코드이다.*/
	@Override
	public String toString() {
		return "Time [hour=" + hour + ", minute=" + minute + ", second=" + second + "]";
	}//주소만 찍어도 이 문자열을 리턴해준다. ex) system.out.println(t4)

	public void display(){
		String d = "Time [hour=" + hour + ", minute=" + minute + ", second=" + second + "]";
		System.out.println(d);
	}
}
