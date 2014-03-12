package figglewatts.SEGment.test;

import java.util.ArrayList;
import java.util.List;

import figglewatts.SEGment.test.tests.CreateObjectTest;

public class SEGmentTest {
	private static List<BaseTest> testList = new ArrayList<BaseTest>();
	
	public static void main(String[] args) throws Exception {
		populateList();
		executeTest(0);
	}
	
	private static void populateList() {
		testList.add(new CreateObjectTest());
	}
	
	private static void executeTest(int testNumber) {
		System.out.println("Running test " + testNumber);
		testList.get(testNumber).Execute();
		System.out.println("Test " + testNumber + " executed completely.");
	}
}
