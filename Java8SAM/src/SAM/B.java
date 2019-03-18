package SAM;

public interface B {

	String test(String s1, String s2);
	default String testB() {
		return "TestB";
	}
	static String helloB() {
		return " Test B Static method";
	}
}
