package c_Chapter02;

import java.util.Scanner;

// while 문
// : 일반적으로 반복 횟수가 지정되어 있지 않을 때 사용하는 반복문

// 조건을 검사하고 해당 조건이 true인 ㄱㅇ우 코드 블럭을 실행하는 반복문
// :if문의 반복 형태
public class D_While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//기본 구조
//		while(조건) {
//			조건이 True일 때 실행할 코드 
//			>> 반복 실행할 코드 블럭이 종료되면 조건을 다시 검사
//			>> true면 반복 false 면 탈출
//		}

//		//while문 기본 예시
//		int i = 0;
//		while(i <= 5)
//		{
//			System.out.println(i); 
//			//i++을 해주지 않으면 계속 1이기 때문에 무한반복
//			//i++을 함으로써 조건의 5를 넘어서 종료가 됨
//			i++;
//			
//		}
//		// continue문 , break
//		int number = 0;
//		while(true)
//		{
//			if(number %2 == 0)
//			{
//				number++;
//				//
//				continue;
//			}
//			System.out.println(number);
//			number++;
//		}
		
//		do {
//			실행할 코드
//		}while (조건);
		
		//:최초의 코드 실행을 보장하는 기능
		
		
//		1부터 4까지를 출력하는 코드
		int doNumber = 1;
		do {
			System.out.println(doNumber);
			doNumber++;
		}while(doNumber <= 4);
		
		
		Scanner sc = new Scanner(System.in);
		String input = null;
		do {
			System.out.println("yes를 입력하세요");
			input = sc.nextLine();
			
		}while(!input.equals("yes"));
		
		//a.equals(b)의 경우
		//a와 b가 일치(동등)한지 판단하여 논리값을 반환하는 메소드(기능)
		
		
	}

}