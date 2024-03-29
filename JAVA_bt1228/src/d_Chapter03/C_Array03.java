package d_Chapter03;

import java.util.Random;
import java.util.Scanner;

public class C_Array03 {

	public static void main(String[] args) {
//   가위 바위 보 게임
		//:사용자가 가위,바위,보 중 하나를 선택
		// : 컴퓨터도 동일하게 무작위로 하나를 선택하여 승패를 결정
		Scanner sc = new Scanner(System.in);
		//난수를 생성하는 Random 기능
		Random random = new Random();
		
		//가위바위보 배열
		
		String[] choices = {"가위","바위","보"};
		String userChoice ,computerChoice;
		
		int computerChoiceIndex;
		
		while (true)
		{
			System.out.println("가위,바위,보 중 하나를 선택하세요");
			System.out.println("게임 종료를 원하면 '종료'를 입력하세요.");
			
			userChoice = sc.nextLine();
			//a.equals(b) a와 b가 일치하면 true 아니면 false
			if(userChoice.equals("종료")) {
				break;
			}
			
			//컴퓨터의 선택
			//0부터 choics 배열의 길이-1 사이의 무작위 수를 생성
			//random.nextInt(n): 0부터 n-1까지의 사이에서 무작위 수를 찾아냄
			computerChoiceIndex = random.nextInt(choices.length); // 랜덤 숫자를 초이스 배열 개수 범위인 0~2까지 랜덤으로 선택됨
			
			//배열의 요소에 접근 : 배열명[요소의 인덱스번호]
			computerChoice = choices[computerChoiceIndex]; // 컴퓨터 초이스가 초이스 중 랜덤으로 받아짐 [1], [2] 이런식으로 랜덤 하나가 들어옴
			
			//승패 결정 로직

			//승리     //유저가 가위, 컴퓨터가 보 일 경우 승리,  유저가 보 , 컴퓨터가 바위일경우 승리, 유저가 바위 , 컴퓨터가 가위일 경우 승리.
			if((userChoice.equals("가위") && computerChoice.equals("보")) ||  // 승리 로직 
					(userChoice.equals("보") && computerChoice.equals("바위")) 
					||(userChoice.equals("바위") && computerChoice.equals("가위"))) {
						System.out.println("승리 하였습니다.");
				
			}
			else if (userChoice.equals(computerChoice)) {
				System.out.println("비겼습니다"); // 유저와 컴퓨터가 같다면 비겼습니다 호출
				
			}else if ((userChoice.equals("보") && computerChoice.equals("가위")) ||
					(userChoice.equals("바위") && computerChoice.equals("보"))
					||(userChoice.equals("가위") && computerChoice.equals("바위"))){
				System.out.println("졌습니다."); 
			}
			else {
				System.out.println("입력이 잘못 되었습니다. 다시 입력해주세요."); // 나머지 입력은 가위,바위,보 이 외의 입력 이기 때문에 다시 입력.
			}

		}
		
		sc.close(); // 스캐너 썼으니 닫아줌
		System.out.println("게임을 종료합니다."); //종료 입력시 맨 밑으로 와서 '게임을 종료합니다.'가 나옴 
		
		
		
		
	}

}
