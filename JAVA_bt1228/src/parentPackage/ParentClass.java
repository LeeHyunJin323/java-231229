package parentPackage;


public class ParentClass {

	// public 접근 제한자를 사용한 필드
	public String protectedField;
	
	// protected 접근 제한자를 사용한 필드
	
	public ParentClass() {
		this.protectedField = "public Field";
	}
		
		public void  protectedMethod() {
			System.out.println("This is a public method");
		}
	

}
