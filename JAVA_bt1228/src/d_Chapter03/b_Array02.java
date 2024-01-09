package d_Chapter03;
import java.util.Scanner;
public class b_Array02 {

	public static void main(String[] args) {
//		업다운 게임
		//1. 임의의 난수(무작위 수 ) 생성
		// :정수 , 1부터 100 사이의 정수
		int secretNumber = (int)(Math.random()*100+1);
		//Math.random(): 0.0이상 1.0 미만의 무작위 실수를 반환
		//2. 사용자로 부터 정수 입력
		int guess;
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.println("숫자를 입력하세요. (1~100) ");
			guess = sc.nextInt();
			
			if(secretNumber == guess)
			{
				System.out.println("정답입니다.");
				break;
				
			}else if (guess < secretNumber)
			{
				System.out.println("UP");
			}else
			{
				System.out.println("DOWN");
			}
			
		}
		
	
		//3. 무한루프 생성: while 문의 조건이 항상 true
		
		   //사용자의 입력 값이 난수와 같다면
		//  : '정답입니다.' 출력
		// 입력 값이 난수보다 작다면
		// : 'UP' 출력
		// 입력 값이 난수보다 크다면
		// : 'DOWN' 출력
        
		
		
	}

}
