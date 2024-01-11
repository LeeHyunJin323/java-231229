package f_Chapter05;

// Game 클래스
// 한 명의 사용자가 게임을 진행 할 때 마다 점수가 쌓이는 로직

class Game{
//	모든 게임 인스턴스에서 공유될 static 변수
	static int totalScore = 0;
	
	
	// 총 게임을 몇 번 진행했는지 확인하는 static 변수
	// 새로운 게임이 생성되면 전체 인스턴스에서 공유되는 numberOfGames 정적 변수를
	// , 1씩 증가
	
	static int numberOfGames = 0;

	
	
	//totalGames 메서드를 선언
	// 총 진행된 게임의 수는 : n번 입니다.
	
	// 게임 점수를 증가시키는 메서드
	// int score 
	// : 지역 변수 
	// - addScore 메서드가 호출 될 때 마다 다른값을 가지며
	// - 해당 메서드 내에서만 사용 가능
	void addScore(int score) {
		totalScore += score;
		System.out.println("Current Total Score: " + totalScore);
	}

	Game () { //Game 객체가 생성 될 때마다 1++
		numberOfGames++;
		
	}
	
	void totalGames() {
		System.out.println("총 진행된 게임의 수는 :" + numberOfGames +"입니다." );
	}
	
}
public class Object03 {

	public static void main(String[] args) {
		Game game1 = new Game(); // 첫 번째 게임
		Game game2 = new Game(); // 두 번째 게임 
		Game game3 = new Game(); // 두 번째 게임 
		Game game4 = new Game(); // 두 번째 게임 
		Game game5 = new Game(); // 두 번째 게임 
		Game game6 = new Game(); // 두 번째 게임 

		
		game1.addScore(200);
		game2.addScore(100);
		System.out.println(Game.totalScore);
		//System.out.println(Game.numberOfGames);
		game1.totalGames();
   
	}

}
