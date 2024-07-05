package SeleniumTest;

public class Verify {
	
	public static boolean equalValues(String actual, String expected) {
		if(actual.equals(expected)) {
			System.out.println("Correct Values");
			return true;
		}
		else {
			System.out.println("incorrect values");
			return false;
		}
	}
	
	public static boolean containValues(String actual, String expected) {
		if(actual.contains(expected)) {
			System.out.println("Correct Values");
			return true;
		}
		else {
			System.out.println("incorrect values");
			return false;
		}
	}

}
