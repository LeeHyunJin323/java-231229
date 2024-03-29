package i_Chapter08;
// 자바 패키지 또는 클래스 파일 간의
// 코드 연결을 위해서는 import 문을 사용하여
// 해당 패키지 또는 클래스 파일명을 명시해야 한다.
// 같은 패키지 내 : import 클래스명;
// 다른 패키지 : import 패키지명.클래스파일명
import parentPackage.ParentClass;



// 접근 제어자

//! 접근 제어자 정의
// : 클래스 , 메서드 , 변수의 접근 범위를 제어

// ! 접근 제어자의 종류
// :private , default , protected , public
// : 클래스나 멤버 변수, 메서드 , 생성자에 접근제어자가 지정되어 있지 않은 경우
// : >> default(기본값)으로 지정

// ! 접근 제어자의 범위
// public  > protected > (default)얘는 생략이 가능  > private
// private : 같은 클래스 내에서만 접근 가능
// protected : 같은 패키지내에서, 그리고 다른 패키지의 자손 클래스에서 접근이 가능
// (default) : 같은 패키지 내에서만 접근이 가능
// public : 접근 제한이 전혀 없이 접근 가능


// 1. private
class PrivateClass extends ParentClass {
	// 같은 클래스 내에서만 접근 가능한 private 멤버 변수
	// 부모 클래스의 protected 필드에 접근
	
	
	// 부모 클래스의 private 필드에 접근
	
	private int myField;
	private void myMethod() {}
	
	
	
}
class ChildClass extends PrivateClass {
	void childMethod() {
		// 부모 클래스의 myField 변수가 private 설정이 되어 있어
		// 해당 클래스 외부에서는 접근 X
//		super.myField; - Error
		
	}
	
//  2. default
//  : 같은 패키지 내라면 중복 X
//  : 패키지 외부에서는 접근 X
	class DefaultClass{
		// 같은 패키지 내의 다른 클래스들에 접근 가능
		int myField;
		void myMethod() {
			
		}
	}

// 3. protected 
// : 동일한 패키지 내의 모든 클래스와 다른 패키지의 하위 클래스에서 접근 가능
class ProtectedClass  {
	// 부모 클래스의 protected 필드에 접근
	protected int myField;
	public ProtectedClass() {
		System.out.println(protectedField);
		
		protectedMethod();
		
	}
	
}
	
}
public class A_modifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
}

