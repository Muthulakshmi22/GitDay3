package org.camp;

import org.testng.annotations.Test;

public class Data2 {
//priority
	@Test(priority=2)
	private void test5() {
		System.out.println("5");
	}
	@Test(priority=3)
	private void test4() {
System.out.println("4");
	}
	@Test(priority=1)
	private void test3() {
System.out.println("3");
	}
	@Test(priority=4)
	private void test2() {
System.out.println("2");
	}
}
