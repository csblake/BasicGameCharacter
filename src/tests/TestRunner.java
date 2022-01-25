/**
 * @author clayblake - csblake
 * CIS175 - Fall 2021
 * Jan 25, 2022
 */
package tests;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {
	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(TestCharacterPersuade.class);
		Result result2 = JUnitCore.runClasses(TestLevelUp.class);
		
		// test the first result
		for(Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
		}
		
		// test the second result
		for(Failure failure : result2.getFailures()) {
			System.out.println(failure.toString());
		}
		
		System.out.println(result.wasSuccessful());
	}
}
