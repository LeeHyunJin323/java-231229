package l_Chapter11;


//! 내부 클래스
// : 클래스 내에 선언된 클래스(내부에 정의된다는 점을 제외하고는 일반적인 클래스와 유사)
// : 두 클래스가 서로 긴밀한 관계가 있거나 , 하나의 클래스 또는 메서드에서만 사용될 때
// : 외부클래스에 의존적인 클래스를 생성하기 위해 사용
// 예) 은행 계좌 시스템(클래스) - 해당 계좌에 대한 거래 처리 시스템(클래스)

// !내부 클래스 장점 및 특징
// - 캡슐화 강화
// : 내부 클래스는 외부 클래스의 멤버에 직접 접근 가능
// : , 내부 클래스를 외부에 노출시키지 않아 보안성이  높아짐
//  - 코드의 유지보수성 향상
// : 관련된 기능을 같은 장소로 묶어 코드의 가독성과 유지보수성을 향상시킴

// ! 내부 클래스의 형태
class OuterClass{ // 외부 클래스
	// 필드 & 메서드
	class innerClass { // 내부 클래스
		// 필드 & 메서드
		
	}
}

//! 내부 클래스의 예시
class Creature{ // 생물(외부 클래스)
	int life; // 외부 클래스의 인스턴스 변수
	
	// 클래스 Animal과 Insect 는 Creature의 내부 클래스
	class Animal {}
	class Insect{}
	
}

// ! 내부 클래스의 종류
// 비정적 내부 클래스 (인스턴스 클래스)
// : 외부 클래스의 멤버변수 선언 위치에 선언
// : 외부 클래스의 인스턴스 멤버처럼 사용

// 정적 내부 클래스 (스태틱 클래스)
// : 외부 클래스의 멤버변수 선언 위치에 선언
// : 외부 클래스의 정적 멤버처럼 사용
// : new 생성자 초기화가 가능 

// 지역 내부 클래스 (지역 클래스)
// : 외부 클래스의 메서드 또는 초기화 블럭 안에 선언
// : 선언된 메서드 블럭 내에서만 사용 가능

// 익명 내부 클래스 (익명 클래스)
// : 클래스의 선언과 객체의 생성을 동시에 하는 이름없는 클래스
// : 주로 클래스의 일회용으로 사용할 때 사용하는 경우

public class A_InnerClass {

	public static void main(String[] args) {
		// 자바 내부 클래스 사용 목적
		// - 캡슐화와 구조화
		// : 특정 클래스 내부에서 해당 클래스를 위한 기능 정의를 위해 사용
		// : 각 클래스 간의 연결성, 기능성 향상
		// 예) Car 클래스(외부) - Engine 클래스(내부)
		// >> Engine 클래스가 클래스 외부에 노출도지 않고 Car 내부에서만 관리
		// 캡슐화 -> 보안성을 높이기 위해 사용 
		
	}

}
