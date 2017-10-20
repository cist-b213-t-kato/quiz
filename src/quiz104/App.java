package quiz104;

public class App {

	public static void main(String[] args) {
		Cup cup = new Cup();

		// コップに容量以上の水を入れる
		cup.water = 1000;
		cup.view();

		// コップの水を飲み干す
		cup.water -= 400;
		cup.water -= 400;
		cup.water -= 400;
		cup.view();

	}

}
