public class StaticVariableAndConst2 {
	public static void printTest(final int param) {
		// param++;
		System.out.println(param);
	}
	
	public static void main(String[] args) {
		int inner = 10;
		// System.out.println(TEST_SCOPE);
		final int TEST_SCOPE = 20;
		printTest(TEST_SCOPE);
		System.out.println("메인에서의 상수값: " + TEST_SCOPE);
		
		
		
		
		
		
		
		// {
			// System.out.println(inner);
			// System.out.println(TEST_SCOPE);
			
			// final int TEST_SCOPE;
			// final int BLOCK = 100;
		// }
		// System.out.println(BLOCK);
	}
}