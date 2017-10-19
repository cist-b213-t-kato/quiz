package quiz103.answer;

import java.util.ArrayList;
import java.util.List;

public class Singleton {

	private static List<Singleton> instanceList;

	private Singleton() {

	}

	public static Singleton getInstance() throws Exception {
		if ( instanceList == null ) {
			instanceList = new ArrayList<>();
		}

		if ( instanceList.size() < 2 ) {
			instanceList.add(new Singleton());
		} else {
			throw new Exception();
		}

		return instanceList.get(instanceList.size()-1);
	}

}
