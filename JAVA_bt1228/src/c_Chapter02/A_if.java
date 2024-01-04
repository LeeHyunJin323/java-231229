package c_Chapter02;

import java.util.Scanner;

// 조건문 (Condition)
// : 프로그램의 흐름을 제어하는 데 사용되는 기본적인 구조 중 하나


// 자바의 조건문 종류
// if , else , else if , switch 문

public class A_if {

	public static void main(String[] args) {
//		1. if문
//		: 조건에 따라 실행시키고자 하는 로직(프로세스)이 다를 떄 사용하는 구문
//		:조건이 true 일 때 실행할 코드를 지정하는 구문
		
//		if문 기본 구조
//      if(조건- '새라면'){
//		 : 조건이 true일 때 사용할 코드
//	     : '날 수 있다.'	
//	}

//		: 조건은 true . false 의 결과를 반환하는 boolean 형태의 표현식
		
		int age = 12;
		
		if(age > 19) 
		{
//		   중괄호 안의 코드 블럭은 들여쓰기가 기본
//		조건이 true 일 경우에만 {} 안에 작성한 코드 블럭이 실행
			
			System.out.println("성인입니다.");
		   
			
		}
//		if문의 경우 코드 블럭에 오는 코드가 하나의 구문이면 {} 생략가능
		if(age > 19) System.out.println("성인입니다."); // 
		System.out.println("조건 검사 완료");
		
//		2. if - else 문
//		: 조건이 true 일 경우와 false일 때 실행되는 코드를 각각 지정한 구문
//		: if문의 조건이 거짓일 경우에만 실행할 코드 블럭을 결정
		
		if(age > 19) 
		{
//		   중괄호 안의 코드 블럭은 들여쓰기가 기본
//		조건이 true 일 경우에만 {} 안에 작성한 코드 블럭이 실행
			
			System.out.println("성인입니다.");
		}else 
		{
			System.out.println("미성년자입니다.");
		}
//		조건에 따른 실행 코드가 한 줄일 경우에만 사용 가능한 구조
		if(age > 19) System.out.println("성인입니다.");  // 조건이 한줄이면 {} 안 써도 됨
		else System.out.println("미성년자입니다.");
		
//		3. 중첩 if문
//		 : if문 혹은 else문의 코드 블럭안에 if문을 작성
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("나이를 입력하세요.");
		
//		생성한 입력기를 실행
		age = sc.nextInt();
		
		if (age <= 19)
		{
			System.out.println("미성년자입니다.");
//			age 변수에는 19이하의 수만 작성 가능
			if(age <= 13)
			{
				System.out.println("어린이입니다.");
			}
			else 
			{
//				첫 번째 조건이 참이고 두 번째 조건이 거짓인 코드 블럭
//				13 초과와 19미만의 값
				System.out.println("청소년입니다.");
				
			}
		}
		else
		{
			System.out.println("성인입니다.");
			
		}
		
//		4. else if 문
//		 :여러 조건을 순차적으로 테스트할 때 사용
//		 :if문 뒤에 나오며, 여러 개를 연속해서 사용 가능
		
		//if(age > 19)
		{
			System.out.println("성인입니다.");
	
//			별도의 조건을 가지는 문장으로
//			첫 번째 조건은 거짓이면서 두 번째 조건은 참인 문장을 실행
}
				//else if (age <= 13)
						{
							System.out.println("어린이입니다.");
					}
//		    모든 조건식이 거짓일 때 실행
					//else
					//{
					//	System.out.println("청소년입니다.");
					//}
				
		//들여쓰기 단축키: tab
		//반대로는 shift + tab
		
//		if문 예제 실습 - 학점 계산기
//		점수가 0 ~ 100점
//		90 ~ 100:A
		//80~ 89 : B
		//70~79 : C
		//60~69 : D
//        59미만:F
		Scanner scanner = new Scanner(System.in);
		System.out.println("성적을 입력하세요 : ");
		int score = scanner.nextInt();
		

		String result = null;
		if(score < 0 || score > 100 )
		{
			System.out.println("점수는 0 ~ 100점 사이어야 합니다.");

		result = "계산 불가";
		}else if (score > 89)
		{
			System.out.println("90점대 입니다.");
			result = "A";
		}
		else if (score > 79)
		{
			System.out.println("80점대 입니다.");
			result = "B";
		}
		else if (score > 69 )
		{
			System.out.println("70점대 입니다.");
			result = "C";
		}
		else if (score > 59 )
		{
			System.out.println("60점대 입니다.");
			result = "D";
		}
		else 
		{
			System.out.println("59점 미만입니다.");
			result = "F";
		}
		
			System.out.println("결과 : " + result);
		

//			if 문 예제 실습 - 함수 위치 구하기
			Scanner functionData = new Scanner(System.in);
			int x = 0 ;
			int y =0 ;
			
			
			System.out.println("x값을 입력하세요.");
			x = functionData.nextInt();
			System.out.println("y값을 입력하세요.");
			y = functionData.nextInt();
			
//			참조 자료형
//			: 변수에 직접적인 데이터 X , 해당 데이터가 저장된 메모리 주소
//			: 초기화하지 않고 사용할 경우 컴파일 오류 발생 가능
//			: 기본 초기화 값 
//			   - null 
//			   - 메모리상의 어떠한 데이터 객체도 담고 있지 않음.
			
			String funcResult = null;
//         if 조건문 작성
			if(x>0&&y>0)
			{
				System.out.println("둘다 양수입니다.");
				funcResult = "제 1사분면";
			}
			else if(x<0&&y<0)
			{System.out.println("둘다 음수입니다.");
			funcResult = "제 3사분면";
			}
			else if(x<0&&y>0)
			{System.out.println("x가 음수이고 y가 양수입니다.");
			funcResult = "제 2사분면";
			}
			else if(x>0&&y<0)
			{System.out.println("x가 양수이고 y가 음수입니다.");
			funcResult = "제 4사분면";
			}
			
			System.out.println(funcResult);
			
			
					}

}
