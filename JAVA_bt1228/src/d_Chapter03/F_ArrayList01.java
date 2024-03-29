package d_Chapter03;

//동적 배열을 사용하기 위한 ArrayList  구문 import
import java.util.ArrayList;
import java.util.Arrays;

public class F_ArrayList01 {

	public static void main(String[] args) {
		//자바의 기본 배열 형태
		//:한 번 생성되면 크기를 변경X
		//:새로운 배열을 생성하고, 원래 배열의 요소를 복사
		
		int[] numbers = new int[5];
		

		//ArrayList 클래스
		//: 자바의 라이브러리에서 제공하는 기능
		//java.utils.ArrayList을 import해서 사용
		
		//공통점
		//: 일반 배열과 동일하게 연속된 메모리 공간을 사용
		//: 인덱스 번호가 0부터 시작
		
		
		//차이점
		//:일반 배열은 크기가 고정, ArrayList는 크기가 가변적
		//:배열의  타입 지정 시 일반 데이터 타입이 아닌 참조 타입으로 작성
		//:int(Integer),char (Charactor) , boolean(Boolean) , String 등
		
		
		// ArrayList 생성
		// ArrayList<데이터 타입> 배열명 = new ArrayList<>(선택);
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		
		
		//ArrayList 데이터 추가;
		// 배열명.add(추가할데이터);
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(3);
		System.out.println(arrayList);
		
		//ArrayList 데이터 변경
		//배열명.set(인덱스번호, 변경할 데이터);
		
		arrayList.set(1,5); //1번쨰를 5로 변경
		System.out.println(arrayList);
		
		//ArrayList는 toString 사용할 필요가 없음.
		//ArrayList 출력
		//:배열명으로 곧바로 출력
		
		
		//ArrayList 데이터 삭제
		//ArrayList.remove(인덱스번호);
		arrayList.remove(1); 
		System.out.println(arrayList);
		
	
		// ArrayList 원하는 위치에 데이터 삽입
		// 배열명.add(인덱스번호, 데이터);
		arrayList.add(1,4);		
		arrayList.add(1,5);		
		arrayList.add(1,6);	 // 추가된 데이터 위치 이후의 데이터는 인덱스 번호가 밀리게 됨
		
		System.out.println(arrayList);
		
		//ArrayList 크기 확인
		//배열명.size();
		int size = arrayList.size();
		System.out.println(size); // 5
		
		//ArrayList 특정 요소 접근 
		//:배열명.get(인덱스번호);
		System.out.println(arrayList.get(3)); // 3번째 요소를 가져옴
		
		
		
		
		
	}

}
