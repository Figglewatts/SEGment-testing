package figglewatts.SEGment.test.tests;

import figglewatts.SEGment.test.BaseTest;
import figglewatts.SEGment.test.TestComponent;
import figglewatts.SEGment.test.TestObject;

public class ComponentDockTest extends BaseTest {

	@Override
	public void Execute() throws Exception {
		TestComponent component = new TestComponent();
		TestObject object = new TestObject();
		object.components.add(component);
		System.out.println(object.components.get("TestComponent"));
		System.out.println(object.components.get(component.getIdentifier()));
		System.out.println(object.components.list().get(0));
	}
}
