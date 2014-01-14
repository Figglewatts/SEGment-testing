package figglewatts.SEGment.test;

import figglewatts.SEGment.Component;

public class RandomerComponent extends Component {
	
	private int number;
	
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public RandomerComponent() throws Exception {
		super("RandomerComponent");
	}
}
