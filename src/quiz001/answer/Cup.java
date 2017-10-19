package quiz001.answer;

public class Cup {

	private int water;

	public void setWater( int water ) {
		if ( water >= 300 ) {
			this.water = 300;
		} else if ( water < 0 ) {
			this.water = 0;
		} else {
			this.water = water;
		}
	}

	public int getWater() {
		return water;
	}

	public void view() {
		System.out.println("コップの中の水は" + water + "cc");
	}

}
