package quiz101.answer;

import quiz101.DecoratePrinter;

public class App {

	public static void main(String[] args) {
		DecoratePrinter dp = new DecoratePrinter() {
			@Override
			public void print() {
				System.out.println("hello, world");
			}
		};

		dp.decoratePrint();

	}

}
