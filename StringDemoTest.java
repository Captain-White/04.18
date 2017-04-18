package Test;


import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StringDemoTest {

	private StringDemo str;
	@Before
	public void setUp() throws Exception {
		str = new StringDemo();
	}

	@Test
	public void testStringDemo1() {
		assertEquals("toLowerCase",str.smallString("A"),"a");
	}

	@Test
	public void testSmallString2() {
		assertEquals("toLowerCase",str.smallString("Z"),"Z");
	}

	@Test
	public void testSmallString3() {
		assertEquals("toLowerCase",str.smallString("a"),"a");
	}

	@Test
	public void testSmallString4() {
		assertEquals("toLowerCase",str.smallString("A"),"Z");
	}

	@Test
	public void testSmallString5() {
		assertEquals("toLowerCase",str.smallString("A"),"Z");
	}

	@Test
	public void testSmallString6() {
		assertEquals("toLowerCase",str.smallString("."),"a");
	}

	@Test
	public void testSmallString7() {
		assertEquals("toLowerCase",str.smallString("AA"),"a");
	}

	@Test
	public void testSmallString8() {
		assertEquals("toLowerCase",str.smallString(""),"error");
	}
	
	@Test
	public void testSmallString9() {
		str=null;
		assertEquals("toLowerCase",str.smallString(null),"error");
	}
	
	@Test
	public void testSmallString10() {
		assertEquals("toLowerCase",str.smallString("K"),"k");
	}
	
}
