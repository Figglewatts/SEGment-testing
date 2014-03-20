package figglewatts.SEGment.test;

import figglewatts.SEGment.ISystem;

public class TestSystem implements ISystem {

	@Override
	public void end() {
		System.out.println("Test system ending now.");
	}

	@Override
	public void start() {
		System.out.println("System starting now.");
	}

	@Override
	public void update(double delta) {
		System.out.println("Updating system.");
	}
}
