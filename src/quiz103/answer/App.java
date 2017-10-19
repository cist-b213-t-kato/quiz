package quiz103.answer;

public class App {
	public static void main(String[] args) {
		try {
			Singleton singleton1 = Singleton.getInstance();
			Singleton singleton2 = Singleton.getInstance();
			Singleton singleton3 = Singleton.getInstance();
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println("もうインスタンス化すんなボケェ！！");
		}

	}
}
