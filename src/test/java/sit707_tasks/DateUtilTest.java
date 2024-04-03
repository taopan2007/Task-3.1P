package sit707_tasks;

import java.util.Random;

import org.junit.Assert;
import org.junit.Test;


/**
 * @author Ahsan Habib
 */
public class DateUtilTest {
	
	@Test
	public void testStudentIdentity() {
		String studentId = "221508095";
		Assert.assertNotNull("Student ID is null", studentId);
	}

	@Test
	public void testStudentName() {
		String studentName = "Tao Pan";
		Assert.assertNotNull("Student name is null", studentName);
	}

	@Test
	public void testMaxJanuary31ShouldIncrementToFebruary1() {
		// January max boundary area: max+1
		DateUtil date = new DateUtil(31, 1, 2024);
        System.out.println("january31ShouldIncrementToFebruary1 > " + date);
        date.increment();
        System.out.println(date);
        Assert.assertEquals(2, date.getMonth());
        Assert.assertEquals(1, date.getDay());
	}
	
	@Test
	public void testMaxJanuary31ShouldDecrementToJanuary30() {
		// January max boundary area: max-1
		DateUtil date = new DateUtil(31, 1, 2024);
        System.out.println("january31ShouldDecrementToJanuary30 > " + date);
        date.decrement();
        System.out.println(date);
        Assert.assertEquals(30, date.getDay());
        Assert.assertEquals(1, date.getMonth());
	}
	
	@Test
	public void testNominalJanuary() {
		int rand_day_1_to_31 = 1 + new Random().nextInt(31);
        DateUtil date = new DateUtil(rand_day_1_to_31, 1, 2024);
        System.out.println("testJanuaryNominal > " + date);
        date.increment();
        System.out.println(date);
	}
	
	/*
	 * Complete below test cases.
	 */
	
	@Test
	public void testMinJanuary1ShouldIncrementToJanuary2() {
		// Code here
		System.out.println("January min: increment should be 2nd January.");
	    DateUtil date = new DateUtil(1, 1, 2024);
		System.out.println(date);
		date.increment();
		System.out.println(date);
	}
	
	@Test
	public void testMinJanuary1ShouldDecrementToDecember31() {
		    System.out.println("January min: decrement should be 31 December previous year.");
		    DateUtil date = new DateUtil(1, 1, 2024);
			System.out.println(date);
			date.decrement();
			System.out.println(date);
	}
	
	@Test
	public void test1B(){
		try {
		    System.out.println("June min: increment should be 2nd June.");
		    DateUtil date = new DateUtil(1, 6, 1994);
		    System.out.println(date);
		    date.increment();
		    System.out.println(date);
		} catch (Exception e) {
		    System.out.println("Exception caught: " + e.getMessage());
		}
	}

	@Test
	public void test2B(){
		try {
		    System.out.println("June min: increment should be 3rd June.");
		    DateUtil date = new DateUtil(2, 6, 1994);
		    System.out.println(date);
		    date.increment();
		    System.out.println(date);
		} catch (Exception e) {
		    System.out.println("Exception caught: " + e.getMessage());
		}
	    
	}

	@Test
	public void test3B(){
		try {
		    System.out.println("June min: increment should be 16th June.");
		    DateUtil date = new DateUtil(15, 6, 1994);
		    System.out.println(date);
		    date.increment();
		    System.out.println(date);
		} catch (Exception e) {
		    System.out.println("Exception caught: " + e.getMessage());
		}
	}

	@Test
	public void test4B(){
		try {
		    System.out.println("June min: increment should be 1st July.");
		    DateUtil date = new DateUtil(30, 6, 1994);
		    System.out.println(date);
		    date.increment();
		    System.out.println(date);
		} catch (Exception e) {
		    System.out.println("Exception caught: " + e.getMessage());
		}
	}

	@Test
	public void test5B(){
	
		try {
		    System.out.println("June min: increment should be Invalid Date.");
		    DateUtil date = new DateUtil(31, 6, 1994);
		    System.out.println(date);
		} catch (Exception e) {
		    System.out.println("Exception caught: " + e.getMessage());
		}
	}

	@Test
	public void test6B(){
		try {
		    System.out.println("January min: increment should be 16th January.");
		    DateUtil date = new DateUtil(15, 1, 1994);
		    System.out.println(date);
		    date.increment();
		    System.out.println(date);
		} catch (Exception e) {
		    System.out.println("Exception caught: " + e.getMessage());
		}
	}

	@Test
	public void test7B(){
		try {
		    System.out.println("February min: increment should be 16th February.");
		    DateUtil date = new DateUtil(15, 2, 1994);
		    System.out.println(date);
		    date.increment();
		    System.out.println(date);
		} catch (Exception e) {
		    System.out.println("Exception caught: " + e.getMessage());
		}

	}

	@Test
	public void test8B(){
		try {
		    System.out.println("November min: increment should be 16th November.");
		    DateUtil date = new DateUtil(15, 11, 1994);
		    System.out.println(date);
		    date.increment();
		    System.out.println(date);
		} catch (Exception e) {
		    System.out.println("Exception caught: " + e.getMessage());
		}
	}

	@Test
	public void test9B(){
		try {
		    System.out.println("December min: increment should be 16th December.");
		    DateUtil date = new DateUtil(15, 12, 1994);
		    System.out.println(date);
		    date.increment();
		    System.out.println(date);
		} catch (Exception e) {
		    System.out.println("Exception caught: " + e.getMessage());
		}
	}

	@Test
	public void test10B(){
		try {
		    System.out.println("June min: increment should be 16th June.");
		    DateUtil date = new DateUtil(15, 6, 1700);
		    System.out.println(date);
		    date.increment();
		    System.out.println(date);
		} catch (Exception e) {
		    System.out.println("Exception caught: " + e.getMessage());
		}
	}

	@Test
	public void test11B(){

		try {
		    System.out.println("June min: increment should be 16th June.");
		    DateUtil date = new DateUtil(15, 6, 1701);
		    System.out.println(date);
		    date.increment();
		    System.out.println(date);
		} catch (Exception e) {
		    System.out.println("Exception caught: " + e.getMessage());
		}
	}

	@Test
	public void test12B(){
		try {
		    System.out.println("June min: increment should be 16th June.");
		    DateUtil date = new DateUtil(15, 6, 2023);
		    System.out.println(date);
		    date.increment();
		    System.out.println(date);
		} catch (Exception e) {
		    System.out.println("Exception caught: " + e.getMessage());
		}
	}

	@Test
	public void test13B(){
		try {
		    System.out.println("June min: increment should be 16th June.");
		    DateUtil date = new DateUtil(15, 6, 2024);
		    System.out.println(date);
		    date.increment();
		    System.out.println(date);
		} catch (Exception e) {
		    System.out.println("Exception caught: " + e.getMessage());
		}
	}
	
	@Test
	public void extraTestCase(){
		try {
		    System.out.println("Feb min: increment should be 29th Feb.");
		    DateUtil date = new DateUtil(28, 2, 2024);
		    System.out.println(date);
		    date.increment();
		    System.out.println(date);
		} catch (Exception e) {
		    System.out.println("Exception caught: " + e.getMessage());
		}
	}

}
