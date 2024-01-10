package e_Chapter04;

//게임 캐릭터 클래스(GameCharacter)
//이름(name), 레벨(level), 힘(strength) 속성
// 캐릭터의 정보를 출력(displayInfo) 메서드

//생성자 - 각 필드의 데이터를 초기화

// - "Name" + name +", Level :" + level + ", Strenght: + strenght
class GameCharacter{
	String name;
	int level;
	int strength;
	
	
	 void displayInfo() {
		 System.out.println("Name" + name +", Level :" + level + ", Strenght: "+ strength);
	 }
	 
	 GameCharacter(String name , int level , int strenght){
		 this.name = name;
		 this.level = level;
		 this.strength = strenght;
		 
	 }

}


public class Object05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 캐릭터 객체 생성
		//"Warrior",10 , 100 초기화
		
		GameCharacter myCharacter = new GameCharacter("Warrior" , 10, 100 );
		myCharacter.displayInfo();
	}

}
