package k_Chapter10;

//Fruit 인터페이스를 정의
//인터페이스에는 color라는 추상 메서드와 

//describe라는 디폴트 메서드
//디폴트 메서드"This is a fruit of color: "

//printType라는 정적 메서드
//"This is a type of fruit."



interface Fruit{
	String color(); // public abstract 생략되있음
	// 추상 메소드
	// 추상 메소드는에는 public abstract가 생략이 되있음
	
	
	// 디폴트 메서드 
	// 디폴트 메서드의 경우 public 이 생략이 되있음
	default void describe() {
		System.out.println("This is a fruit of color : " + color());
	}
		// 정적메소드
	// 정적 메소드의 경우에는 public  생략이 되있음
	// 상수의 경우에 public static final이 생략
			static void printType() {
				System.out.println("This is a type of fruit");
			}
	}

// 인터페이스 구현
// : 다음으로, Apple과 Orange 클래스를 만들어 Fruit 인터페이스를 구현
// : 각 클래스는 color 메서드를 오버라이드하여 색상을 반환
class Apple implements Fruit{
	@Override
	public String color() {
		return "red";
	}
    // 디폴트 메서드가 재정의 되지 않았기 때문에 
	// ,  Fruit에 있는 디폴트 메서드가 생략된 형태
}


class Orange implements Fruit{
	@Override
	public String color() {
		return "orange";
	}
}
public class Z_Practice02 {
	public static void main(String[] args) {
		// 디폴트 메서드 활용
		// describe 메서드는 Fruit 인터페이스의 디폴트 메서드
		// Apple과 Orange 객체에서 호출 가능
		
		// 정적 메서드 활용
		
		Fruit apple = new Apple();
		Fruit orange = new Orange();
		apple.describe();
		orange.describe();
		
		
		Fruit.printType();
		// 정적 메소드이기 때문에 클래스에서 바로 선언한걸 보여줌 
		
		
	}
}
