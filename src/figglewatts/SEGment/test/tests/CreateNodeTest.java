package figglewatts.SEGment.test.tests;

import figglewatts.SEGment.test.BaseTest;
import figglewatts.SEGment.test.TestNode;

public class CreateNodeTest extends BaseTest {

	@Override
	public void Execute() throws Exception {
		TestNode node = new TestNode();
		System.out.println(node.getName());
		System.out.println(node.getDependencies());
		System.out.println(node.Instance());
	}
}
