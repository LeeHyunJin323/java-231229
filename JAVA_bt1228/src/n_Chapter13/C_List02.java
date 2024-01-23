package n_Chapter13;

//! ArrayList & LinkedList 메서드 사용 시 유의사항

// 1. get, remove , set메서드 (index를 사용하는 메서드)의 경우
// 인덱스가 유효한지 확인
// >> 유효하지 않은 인덱스 사용 시 IndexOutOfBounds 예외 발생


// 2. contains(Object o) 메서드 사용 시
// : 리스트에 지정된 요소가 있는 지 검사 필요


public class C_List02 {

	public static void main(String[] args) {
		
		// ArrayList VS LinkedList
		
		// 1. 정의 & 특징
		// ArrayList
		// - 내부적으로 배열을 사용하여 요소를 저장
		// - 요소를 읽는 것은 빠름 / 요소를 추가, 삭제하는 것은 느림
		
		// LinkedList
		// - 내부적으로 이중 연결 배열을 사용하여 요소를 저장
		// - 요소를 추가하거나 삭제하는 것 빠름 / 요소를 읽는 것은 느림
		
		// 2. 저장 구조
		// ArrayList : 요소의 추가 및 삭제 시 요소를 이동시켜야 함.
		// - 인덱스를 통한 접근을 사용 : 빠름 
		
		// LinkedList : 옆의 요소와 연결만 변경하면 추가 삭제가 가능
		// - 처음부터 요소를 순회해야 함 : 느림
		
		
		
	}

}
