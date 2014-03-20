package figglewatts.SEGment.test.tests;

import figglewatts.SEGment.ComponentEngine;
import figglewatts.SEGment.Util;
import figglewatts.SEGment.test.BaseTest;
import figglewatts.SEGment.test.TestComponent;
import figglewatts.SEGment.test.TestNode;
import figglewatts.SEGment.test.TestObject;

public class RegisterObjectTest extends BaseTest {

	@Override
	public void Execute() throws Exception {
		TestObject object = new TestObject();
		TestComponent component = new TestComponent();
		object.components.add(component);
		TestNode testNode = new TestNode();
		ComponentEngine.registerNode(testNode);
		ComponentEngine.registerObject(object);
		System.out.println(Util.getObjectFromID(object.getID()));
		System.out.println(ComponentEngine.getNodeList(object.getID()).nodes.get(0));
	}
}
