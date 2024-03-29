package c_Chapter02;


// 반복문
// :어떤 작업을 반복적으로 실행하고 싶을 때 사용

// 자바 반복문 종류
// :for , while , do-while문

public class C_For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		for 문
//		특정 조건이 만족될 때까지 코드 블록을 반복 실행
		//:규칙이 있는 작업을 반복하는 제어문
		// : 반복 횟수가 정해져 있을 때 사용
		
		//기본 구조
//		for(초기화; 조건; 증감) {
//			조건이 만족될 때까지 실행할 코드
//		}
		
		
//		초기화
//		:반복문의 제어 변수를 초기화(데이터타입 변수명 = 값;)
//		:숫자형 변수를 사용하여 반복문이 실행되는 횟수를 제어
		
		
//		조건
//		:루프가 계속 실행될 조건을 지정
//		:해당 조건이 거짓이 되면 루프가 종료
		
		//증감
		//:루프의 각 반복 후에 실행 , 보통 반복 변수를 증가 또는 감소
		
		
		// for문 기본 예제
		// :1부터 5까지를 출력
//		int sum = 0;
//		for (int num =1; num <= 5; num++)
//		{
//			System.out.println(num);
//			
//			sum += num;
//						
//		}
//		System.out.println(sum);
//
//		
//		
//		for(int i=0; i<10; i++)
//		{
//			if(i%2 == 0)
//			{
//				System.out.println(i);
//
//			}
//			
//		}
		
		
//		int sum = 0;
//		for(int i = 0; i<=10; i++)
//		{
//			sum += i;
//		}
//		System.out.println(sum);

		for(int i=1; i <= 3; i++)
		{
			for(int j=1; j<= 9; j++)
			{
				System.out.println(i +"X" + j+ "=" + i*j);
			}
		}
	}

}
