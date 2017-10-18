package quiz01;


public abstract class DecoratePrinter {

	protected abstract void print();

	public final void decoratePrint() {
		System.out.println("*+*+*+*+*+*+*+*+*+*+*+*+");
		print();
		System.out.println("*+*+*+*+*+*+*+*+*+*+*+*+");
	}

}
