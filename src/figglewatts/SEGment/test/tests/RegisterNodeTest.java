package figglewatts.SEGment.test.tests;

import figglewatts.SEGment.ComponentEngine;
import figglewatts.SEGment.test.BaseTest;
import figglewatts.SEGment.test.TestNode;

public class RegisterNodeTest extends BaseTest {
	
	@Override
	public void Execute() throws Exception {
		TestNode node = new TestNode();
		ComponentEngine.registerNode(node);
		System.out.println(ComponentEngine.getNodeFromCache(new String[] { "TestComponent" }));
		System.out.println(ComponentEngine.cacheHasNode(new String[] { "TestComponent" }));
		System.out.println(ComponentEngine.getNodes("TestNode"));
	}
}
