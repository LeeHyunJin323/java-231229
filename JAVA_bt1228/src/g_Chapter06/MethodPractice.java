package g_Chapter06;


// BaseballPlayer 클래스
// : 선수의 이름(name) , 타율(battingAverage) , 홈런 수 (homeRus);
// : 이름 - 문자열 ,타율 - 실수 , 홈런 수 - 정수

// : 생성된 선수의 총 수 (playerCount) - 모든 인스턴스에서 공유

// 생성자
// : 생성 시 선수의 이름, 타율, 홈런 수를 받아서 인스턴스 변수 초기화
// : 생성 시 정적 변수를 후위 증가(변수명++)

// 메서드
// : updateStates: 선수의 타율과 홈런 수를 업데이트하는 메서드
// : 매개변수로 newBattingAverage , newHomeRuns를 입력 
// : 타율 업데이트 , 홈런 수 업데이트 (기존의 인스턴스 변수에 재할당)
class Baseballplayer{
	String name;
	double battingAverage;
	int homeRus;
	double newBattingAverage;
	int newHomeRuns;
	
	
	static int playerCount = 0; // 생성된 선수의 총 수 
	// 타자가 칠 때마다 ++ 해주면 될듯
	
	Baseballplayer(String name,double battingAverage , int homeRus){
		this.name = name;
		this.battingAverage = battingAverage;
		this.homeRus = homeRus;
		
		playerCount++;
		
	}


	

	void updateStates(double newBattingAverage , int newHomeRuns) {
		this.battingAverage = newBattingAverage;
		this.homeRus = newHomeRuns;
		
	}
	
	
	
}
public class MethodPractice {

	public static void main(String[] args) {
		// BaseballPlayer클래스로 야구선수 3명의 객체 생성
		// 총 생성된 선수의 수를 출력
		
		
		Baseballplayer player1 = new Baseballplayer("Hyun",0.257,3);
		Baseballplayer player2 = new Baseballplayer("Ryu",0.256,7);
		Baseballplayer player3 = new Baseballplayer("Jun",0.258,2);

		
		System.out.println("첫번째 선수"+ player1.name+"의 타율"+player1.battingAverage+"홈런 수 :"+ player1.homeRus);
		System.out.println("두번째 선수"+ player2.name+"의 타율:"+player2.battingAverage+"홈런 수 :"+ player2.homeRus);
		System.out.println("세번째 선수"+ player3.name+"의 타율:"+player3.battingAverage+"홈런 수 :"+ player3.homeRus);
		
		System.out.println("총 생성된 선수의 수 :" + Baseballplayer.playerCount);

		player1.updateStates(0.0, 0);
	
		System.out.println("업데이트 된 첫번째 선수"+ player1.name+"의 타율"+player1.battingAverage+"홈런 수 :"+ player1.homeRus);
		
	}

}
