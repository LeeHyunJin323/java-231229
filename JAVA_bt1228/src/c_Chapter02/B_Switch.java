package c_Chapter02;

import java.util.Scanner;

// Switch 조건문
// : 특정 변수의 값에 따라 실행할 코드 블록의 범위를 결정하는 데 사용

// - 비교할 변수를 case 값과 비교하여 같은 case 찾아 해당 case 문을 실행
// - : 같은 값의 case 구문부터 끝까지 실행
// - break 문으로 종료 시점을 결정
// - : 해당 break가 있는 switch 종료


// - defalut문으로 해당하는 case가 없을 때 실행할 구문을 작성



// 기본 구조
//switch (비교할 대상) {
//   case 비교할 값 1:
     // 비교할 값1과 비교할 대상이 같을 경우 실행할 코드 
//     case 비교할 값2:
//      비교할 값2와 비교할 대상이 같을 경우 실행할 코드
      // break;
//      ... 
//    default :
      // 비교할 대상과 일치하든 안하든 실행할 코드
// } 
public class B_Switch {

	public static void main(String[] args) {
		// Switch문은 조건에 따라서 코드 실행 범위를 지정하는 것
		
		// 비교할 대상: 주로 변수 또는 값
		// case값: 비교할 대상의 값과 일치하는 값
		
		// 프로그램에서는 똑같은 이름의 변수 선언 x
		
		Scanner sc = new Scanner(System.in);
		System.out.println("chapter를 입력하세요.");
	   int chapter = sc.nextInt();
	   
		switch (chapter) {
		case 1:
			System.out.println("자바 기본 문법");
			break;
		case 2:
			System.out.println("제어문 - 조건문/반복문");
			break;
		case 3:
			System.out.println("배열");
			break;
		case 4:
			System.out.println("객체 지향 프로그램");
			break;
		case 5:
			System.out.println("객체 지향 응용 학습");
			break;
		case 6:
			System.out.println("자바 심화 학습");
			break;
			//default는 case 조건식 뒤에 작성
			
			default:
				System.out.println("범위 초과");
			
		}
		
		
//		Switch 연습 예제 - 온도 변환기
//		사용자로부터 온도 단위 선택
//		 1: 섭씨 -> 화씨
//		 2: 화씨 -> 섭씨
		System.out.println("변환할 온도의 단위를 선택하세요.");
		System.out.println("1: 섭씨 -> 화씨 / 2: 화씨 -> 섭씨");
		int choice = sc.nextInt();
		
		//온도 입력 받기
		System.out.print("온도를 입력하세요 >>");
		double temperature = sc.nextDouble();
		
		switch(choice)
		{
		case 1: // 섭씨 -> 화씨
			double fahrenheit = (temperature*9/5) + 32; 
			System.out.println("섭씨"+temperature+"도는 화씨로 "+fahrenheit+"도 입니다.");
			break;
		case 2: //화씨 -> 섭씨
			double celsius = (temperature - 32)*5/9;
			System.out.println("화씨"+temperature+"도는 섭씨로 "+celsius+"도 입니다.");
			break;
			default:
				System.out.println("잘못된 선택입니다. 1 또는 2를 입력해주세요.");
				break;
				
		}
		sc.close();

	}

}
