package h_Chapter07;

// 상속에서의 생성자
// : 상속받은 클래스에서 생성자 호출 순서는 부모 > 자식 순서로 진행

// 자식 클래스의 객체를 생성할 때
// 자식 클래스의 객체를 생성할 때, 자식 클래스는 자식 생성자를 통해 자식 객체 생성

class mammal{
	String name = "Parents";
	// 사용자 정의 생성자
	mammal(){
		System.out.println("빈 부모 생성자");
	}
	
	mammal(String name){
		this.name = name;
	   System.out.println("부모 클래스가 생성되었습니다.");
	   
	
	}
	
	
	
}

class Cat extends mammal{
	String name = "Child";
	// 1. super() 참조 메서드
	// 자식 클래스의 기본 생성자는 사용자가 정으히자 않더라도
	// , super() 부모 클래스 생성자 호출 키워드가 정의되어 있음
	
	// 2. super 참조 변수
	
	void greet() {
		
		// 해당 클래스가 가진 인스턴스 변수에 접근(생략)
		System.out.println("Hello" + this.name); // 지금 객체의 name을 가져옴
		// 부모 클래스가 가진 인스턴스 변수에 접근(super키워드를 사용하여 접근)
		System.out.println("Hello" + super.name);  // -> 상위 클래스의 name을 가져옴
	}
	Cat(){
		System.out.println("빈 자식 생성자");
	}
	Cat (String name){
		// super()는 부모 클래스의 생성자를 가지고 오기 때문에
		//  , 기본 생성자 또는 사용자 정의 생성자의 형태 그대로를 사용
		super(name); // 부모 클래스를 가르킴
	System.out.println("자식 클래스가 생성되었습니다.");
	}
}
public class Inheritance02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//  자식 클래스는 항상 부모 클래스의 생성자를 호출
		// : 단 , 항상 직접적으로 정의된 생성자를 필요로 하는 것은 X
		
		Cat voidCat = new Cat();
		Cat myCat = new Cat("초코");
		
		// 자식 클래스의 name 호출된 후 
		// 위의 인스턴스 생성 시 부모 클래스로 전달했던 choco 이름의
		// , 부모 클래스의 name이 호출
		myCat.greet();
		
		
		
	}

}
// super
// : 자식 클래스에서 부모 클래스의 멤버(필드 , 메서드)에 접근할 때 사용

//super()
// : 부모 클래스의 생성자를 호출하는데 사용되는 메서드
