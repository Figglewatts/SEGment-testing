package figglewatts.SEGment.test;

import java.util.ArrayList;
import java.util.List;

import figglewatts.SEGment.test.tests.ComponentDockTest;
import figglewatts.SEGment.test.tests.CreateComponentTest;
import figglewatts.SEGment.test.tests.CreateNodeTest;
import figglewatts.SEGment.test.tests.CreateObjectTest;
import figglewatts.SEGment.test.tests.CreateSystemTest;
import figglewatts.SEGment.test.tests.RegisterNodeTest;
import figglewatts.SEGment.test.tests.RegisterObjectTest;

public class SEGmentTest {
	private static List<BaseTest> testList = new ArrayList<BaseTest>();
	
	public static void main(String[] args) throws Exception {
		populateList();
		executeTest(6);
	}
	
	private static void populateList() {
		testList.add(new CreateObjectTest());
		testList.add(new CreateComponentTest());
		testList.add(new ComponentDockTest());
		testList.add(new CreateNodeTest());
		testList.add(new RegisterNodeTest());
		testList.add(new CreateSystemTest());
		testList.add(new RegisterObjectTest());
	}
	
	private static void executeTest(int testNumber) throws Exception {
		System.out.println("Running test " + testNumber);
		testList.get(testNumber).Execute();
		System.out.println("Test " + testNumber + " executed completely.");
	}
}
