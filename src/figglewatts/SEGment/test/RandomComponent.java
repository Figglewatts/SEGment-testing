package figglewatts.SEGment.test;

import figglewatts.SEGment.Component;

public class RandomComponent extends Component {
	
	private int multiplier;
	
	public int getMultiplier() {
		return multiplier;
	}

	public void setMultiplier(int multiplier) {
		this.multiplier = multiplier;
	}

	public RandomComponent() throws Exception {
		super("RandomComponent");
	}
}
