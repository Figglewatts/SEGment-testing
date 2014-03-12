package figglewatts.SEGment.test;

import figglewatts.SEGment.Component;

public class TestComponent extends Component {
	
	private int anInt = 4;
	
	public int getAnInt() {
		return anInt;
	}
	public void setAnInt(int anInt) {
		this.anInt = anInt;
	}
	
	public TestComponent() throws Exception {
		super("TestComponent");
	}
}
