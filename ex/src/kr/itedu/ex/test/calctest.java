package kr.itedu.ex.test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import kr.itedu.ex.calc;

class calctest {

	@Test
	void testSum() {
		assertEquals(3,calc.sum(1, 2));
		assertEquals(5,calc.sum(3, 2));
		assertEquals(10,calc.sum(1, 9));
		
	}

}
