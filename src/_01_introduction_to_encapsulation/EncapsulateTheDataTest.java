package _01_introduction_to_encapsulation;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EncapsulateTheDataTest {
	EncapsulateTheData data = new EncapsulateTheData();
	@Test
	void test() {
	data.set(10);
	assertEquals(10, data.get());
	data.set(-1);
	assertEquals(0, data.get());
	
	}
	@Test
	void test2() {
		data.set2(360);
		assertEquals(360,data.get2(),360);
		data.set2(361);
		assertEquals(1,data.get2(),1);
		data.set2(-100);
		assertEquals(260, data.get2(),260);
	}
	@Test
	void test3() {
		data.set3("");
		assertEquals(" ",data.get3());
		data.set3("Yummy");
		assertEquals("Yummy", data.get3());
	}
	@Test
	void test4() {
		data.set2(0);
		assertEquals(0, data.get2(),0);
	}

}
