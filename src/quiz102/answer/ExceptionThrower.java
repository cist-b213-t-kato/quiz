package quiz102.answer;

public class ExceptionThrower {
	public void method( int n ) throws Exception {
		if ( n == 0 ) {
			throw new Exception();
		}
	}
}
