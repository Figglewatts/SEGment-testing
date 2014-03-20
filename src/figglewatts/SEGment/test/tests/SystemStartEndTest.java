package figglewatts.SEGment.test.tests;

import figglewatts.SEGment.ComponentEngine;
import figglewatts.SEGment.test.BaseTest;
import figglewatts.SEGment.test.TestSystem;

public class SystemStartEndTest extends BaseTest {

	@Override
	public void Execute() throws Exception {
		TestSystem systemTest = new TestSystem();
		ComponentEngine.addSystem(systemTest);
		ComponentEngine.removeSystem(systemTest);
	}
}
