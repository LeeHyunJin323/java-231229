package c_Chapter02;


//중첩된 반복문(nested loop)

//중첩 루프
// : 반복문 안에 또 다른 반복문이 있는 구조
// : 각 반복마다 내부 루프가 전체를 완전히 반복
public class E_NestedLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		for(int i = 0; i<=5 ; i++)
//		{
//			for(int j = 0; j<=5; j++)
//			{
//				System.out.print("*");
//			}
//			System.out.println(); // 5개찍고 엔터
//		}

//		별 1개부터 5개까지 찍어 내려오기
		
		for(int i = 0; i<=5; i++ )
		{
			
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	
	}

}
