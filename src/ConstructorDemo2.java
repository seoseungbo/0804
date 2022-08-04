/*
 * 생성자의 역할은 멤버변수(필드, property)의 초기화
 * 파라미터가 없는 생성자를 기본 생성자라고 한다.
 * 파라미터가 없는 기본 생성자는 어떻게 멤버변수를 초기화할 것인가?
 * 0, 0.0, false, '\o' or '\u0000', null
 * 기본생성자는 항상 해당 클래스의 생성자가 한 개도 없을 때 자동으로 만들어준다.
 * 만일 한개라도 생성자가 존재하면 컴파일러는 자동으로 생성하지 않는다.
 */

public class ConstructorDemo2 {
	public static void main(String[] args) {
//		Tiger tiger = new Tiger();  //기본 생성자
//		System.out.println(tiger.flag);
		MyCalendar mc = new MyCalendar();
		System.out.println(mc.year);
	}
}
class MyCalendar{
	int year, month, day;
	public MyCalendar() {}
	public MyCalendar(int year, int month, int day) { //Default Constructor Override(재정의)
		this.year = year;
		this.month = month;
		this.day = day;
	}
}



class Tiger{
	String name;
	int age;
	boolean flag;
	double weight;
	char grade;
	
}
