package testNG;


import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;

public class RunFailedTestCases {

	public static void main(String[] args) {

		TestNG runner=new TestNG();

		List<String> list = new ArrayList<String>();

		list.add("E:/STUDY_STUFF/SQA/Workplace/Advance_Framework/test-output/Loan Department/testng-failed.xml");
		runner.setTestSuites(list);

		runner.run();
	}
}
