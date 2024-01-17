package j_Chapter09;

// 다형성
// Animal, Cat, Dog 클래스
// Animal 클래스 : sound메서드 (The animal makes a sound)
// Cat , Dog 클래스 - Animal 클래스를 상속
//  : sound 메서드를 오버라이딩 >> 각각 "meow" , "bark" 출력

// instanceof 연산자
// AnimalChecker 클래스 선언
// : Animal , Cat , Dog 클래스를 사용하여 다형성을 확인하는 메서드 작성
// : checkAnimalType 메서드 - Animal 타입의 매개변수를 전달
// : instanceof 연산자를 사용하여 매개변수가 Cat과 Dog 중 어느 인스턴스인지 확인
// : Cat > 'cat' 출력 /Dog > 'dog' 출력 / 둘 다 X > 'Unknown animal type'
class Animal1{
	void sound() {
		System.out.println("The animal makes a sound");
	}
	
}
class Cat extends Animal1{
	void sound() {
		System.out.println("meow");
	}
}
class Dog1 extends Animal1{
	void sound() {
		System.out.println("The animal makes a sound");
	}
}
public class Z_Practice01 {

	public static void main(String[] args) {
		
		//Animal , Cat , Dog 클래스의 객체를 Animal타입으로 저장
		// 생성된 각 객체를 checkAnimalType 메서드를 사용하여 확인
		Animal1 myanimal = new Animal1();
		Animal1 mydog = new Dog1();
		Animal1 mycat = new Cat();
		if (mydog instanceof Animal1) {
			System.out.println("Dog > 'dog''");
		}
		
		if (mycat instanceof Animal1) {
			System.out.println("Cat > 'cat'");
		}
		
		if (Animal1 instanceof Car) {
			System.out.println("운송수단은 차입니다.");
		} else 
			System.out.println("운송수단은 차가 아닙니다.");
		

	}

}
