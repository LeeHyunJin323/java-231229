package g_Chapter06;

// 사칙연산 클래스
// : 두 개의 값을 매개벼수로 전달받아 사칙연산 수행
// :add , subtract, multiply , divide의 4개의 메서드	
class MyMath{
	int add(int a, int b) {return a+b;}
	int subtract(int a, int b) { return a-b;}
	int multiply(int a, int b) { return a*b;}
	double divide(double a, double b) { return a/b;}
	
	// return 문
	// : 현재 실행중인 메서드를 종료하고 호출한 메서드로 돌아감
	// : 반환값이 유무에 관계없이 모든 메서드에는
	// : , 적어도 하나 이상의 return문이 존재해야 함
	// :   - 자바 컴파일러가 메서드의 마지막에 자동으로 retrun; 을 추가
	
	// 반환이 없는 메서드
	void noReturn() {
		System.out.println("해당 메서드는 반환값이 없습니다.");
		return; // 반환 타입이 void이기 때문에 생략 가능 - 컴파일러가 자동 추가
	}
	
	// 반환값이 있는 메서드
	String yesReturn() {
		String msg = "해당 메서드는 반환값이 있습니다.";
		// 반환타입이 void가 아닌 경우 return문 작성을 생략 시 오류 발생
		return msg;
		
	}

}
public class Method03 {

	public static void main(String[] args) {
		MyMath mm = new MyMath(); // 인스턴스 생성
		
		// 메서드의 실행 흐름
		// 1. main 메서드에서 메서드 add를 호출 - 인자를 매개변수에 전달
		// 2. 메서드 add 내에서 중괄호{} 구현부 내의 문장이 순서대로 수행
		// 3. 메서드 add의 모든 문장이 실행하거나 return 문을 만나면
		//     , 호출된 메서드(main)로 돌아와 이후 문장을 실행
		//     , 반환된 값을 value 변수에 할당
		//     , 함수가 void 타입으로 바로 출력하는 경우 console창에 출력
		
		int value = mm.add(10, 20); // 메서드 호출
		int value2 = mm.subtract(20,10);
		int value3 = mm.multiply(5, 3);
		double value4 = mm.divide(5, 3);
		System.out.println(value);
		System.out.println(value2);
		System.out.println(value3);
		System.out.println(value4);
		


	}

}