package figglewatts.SEGment.test.tests;

import figglewatts.SEGment.test.BaseTest;
import figglewatts.SEGment.test.TestObject;

public class CreateObjectTest extends BaseTest {

	@Override
	public void Execute() {
		TestObject object = new TestObject();
		System.out.println("Object ID: " + object.getID());
	}
}
