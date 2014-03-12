package figglewatts.SEGment.test;

import java.util.ArrayList;
import java.util.List;

import figglewatts.SEGment.test.tests.ComponentDockTest;
import figglewatts.SEGment.test.tests.CreateComponentTest;
import figglewatts.SEGment.test.tests.CreateObjectTest;

public class SEGmentTest {
	private static List<BaseTest> testList = new ArrayList<BaseTest>();
	
	public static void main(String[] args) throws Exception {
		populateList();
		executeTest(2);
	}
	
	private static void populateList() {
		testList.add(new CreateObjectTest());
		testList.add(new CreateComponentTest());
		testList.add(new ComponentDockTest());
	}
	
	private static void executeTest(int testNumber) throws Exception {
		System.out.println("Running test " + testNumber);
		testList.get(testNumber).Execute();
		System.out.println("Test " + testNumber + " executed completely.");
	}
}
