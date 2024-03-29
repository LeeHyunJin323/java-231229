package h_Chapter07;


// 사람 클래스 (Person)
// 인스턴스 변수(이름, 나이)

 // 기본 생성자 - 인스턴스 변수 초기화 ( 매개변수 X - 변수값)

// 매개변수가 있는 생성자 - 오버로딩 (각각의 인스턴스 변수값을 매개변수로 전달)

// 매개변수가 있는 생성자 - 오버로딩 ( 이름만 매개변수로 전달받아 초기화 , 나이는 0)

//메서드 (반환X, 매개변수X) - 사람의 정보를 출력
// :Name : 이름 , Age: 나이

class Person{
	String name;
	int age;
	
	Person(){
		this.name = ""; // 문자열의 초기값을 빈 문자열로 지정
		this.age = 0;

	}
	Person(String name,  int age){
		this.name = name;
		this.age = age;
	}
	Person(String name){
		this.name = name; 
		// this (name , 25);
		this.age  = 0;
		
		
		
	}
	void displayInfo() {
		System.out.println(":Name : "+name +" Age:"+ age);
	}
	
}
public class Z_Practice {

	public static void main(String[] args) {
		// 사람 인스턴스 3명 생성
		// 각각 다른 생성자로 생성, 각 인스턴스에 대한 메서드 호출
		
		Person p1 = new Person();
		p1.name = "현진";
		p1.age = 25;
		
		Person p2 = new Person("이현진");
		p2.age = 25;
		
		Person p3 = new Person("이현진",25);
		
		p1.displayInfo();
		p2.displayInfo();
		p3.displayInfo();
		
		

	}

}
