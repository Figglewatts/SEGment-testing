package figglewatts.SEGment.test;

import figglewatts.SEGment.Node;

public class TestNode extends Node {

	public TestNode() {
		super("TestNode");
		this.dependencies = new String[] { "TestComponent" };
	}
}
