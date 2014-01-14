package figglewatts.SEGment.test;

import figglewatts.SEGment.Node;

public class MultiplierNode extends Node {

	public MultiplierNode(RandomComponent randomComponent, RandomerComponent randomerComponent) {
		super("MultiplierNode", randomComponent, randomerComponent);
		this.dependencies = new String[] { "RandomComponent", "RandomerComponent" };
	}
}
