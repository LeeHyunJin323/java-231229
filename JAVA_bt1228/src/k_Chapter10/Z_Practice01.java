package k_Chapter10;

// 모바일 애플리케이션이라는 추상 클래스를 선언(MobileApp)
// : '실행'이라는 추상 메서드를 선언(execute)
// : '앱 설명'이라는 일반 메서드를 구현(appInfo)

// '게임 애플리케이션'과 (GameApp)
// '사회 네트워킹 애플리케이션'이라는 클래스를 생성 (SocialApp)
// : 모바일 애플리케이션 추상 클래스를 상속받는 자식클래스
// : 각 클래스에서 '실행' 메서드를 구현
// : '게임 애플리케이션'에서만 일반 메서드 재정의
abstract class MobileApp{
	abstract void execute();
	void appInfo() {
		System.out.println("This is a mobile app");
	}
}

class GameApp extends MobileApp{
	
	void execute() {
		System.out.println("Game app executes");
	}
	@Override
	void appInfo() {
		System.out.println("Gmae app");
	}
}

class SocialApp extends MobileApp{
	
	void execute() {
		System.out.println("SocialApp executes");
	}
}
public class Z_Practice01 {
	public static void main(String[] args) {
		// 메인메서드에서 GameApp, SocialApp 인스턴스 생성
		// 각각의 메서드 실행
		MobileApp ga1 = new GameApp();
		MobileApp sa1 = new SocialApp();
		
		ga1.execute();
		ga1.appInfo(); // 재정의된 메서드 출력
		
		sa1.execute();
		sa1.appInfo(); // 추상 클래스가 가진 메서드 출력
		
	}
}