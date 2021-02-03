package lt.vtmc;

public class JavaProgram {
	private static final int NUMBER = 11;

	public static void main(String[] args) {
		for (int i = 0; i < NUMBER; i++) {
			System.out.println(i + " !is " + factorial(i));
		}
	}

	public static int factorial(int n) {
		int result =  1;
		for (int i = 1; i <= n; i++) {
			result = result *  i;
		}
		return result;
	}
}

