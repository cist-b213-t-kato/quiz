package quiz001.answer;

public class App {

	public static void main(String[] args) {
		Cup cup = new Cup();

		// コップに容量以上の水を入れる
		cup.setWater(500);
		cup.view();

		// コップの水を飲み干す
		cup.setWater(-200);
		cup.view();

	}

}
