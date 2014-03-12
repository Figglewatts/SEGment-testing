package figglewatts.SEGment.test.tests;

import figglewatts.SEGment.test.BaseTest;
import figglewatts.SEGment.test.TestComponent;

public class CreateComponentTest extends BaseTest {

	@Override
	public void Execute() throws Exception {
		TestComponent component = new TestComponent();
		System.out.println("Component Identifier: " + component.getIdentifier());
		System.out.println("Component Name: " + component.getName());
	}
}
