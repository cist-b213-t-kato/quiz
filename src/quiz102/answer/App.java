package quiz102.answer;

public class App {
	public static void main(String[] args) {
		ExceptionThrower te = new ExceptionThrower();

		try {
			te.method(10);
			te.method(0);
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println("ゼロ入れるんじゃねえ！！！");
		}

	}
}
