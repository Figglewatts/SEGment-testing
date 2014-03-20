package figglewatts.SEGment.test.tests;

import figglewatts.SEGment.test.BaseTest;
import figglewatts.SEGment.test.TestSystem;

public class CreateSystemTest extends BaseTest {

	@Override
	public void Execute() throws Exception {
		TestSystem systemTest = new TestSystem();
		System.out.println(systemTest);
	}
}
