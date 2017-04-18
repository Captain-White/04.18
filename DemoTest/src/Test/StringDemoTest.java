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
		assertEquals("һ����ĸ��Сд",str.smallString("A"),"a");
	}

	@Test
	public void testSmallString2() {
		assertEquals("һ����ĸ��Сд",str.smallString("Z"),"Z");
	}

	@Test
	public void testSmallString3() {
		assertEquals("һ����ĸ��Сд",str.smallString("a"),"a");
	}

	@Test
	public void testSmallString4() {
		assertEquals("һ����ĸ��Сд",str.smallString("A"),"Z");
	}

	@Test
	public void testSmallString5() {
		assertEquals("һ����ĸ��Сд",str.smallString("A"),"Z");
	}

	@Test
	public void testSmallString6() {
		assertEquals("һ����ĸ��Сд",str.smallString("."),"a");
	}

	@Test
	public void testSmallString7() {
		assertEquals("һ����ĸ��Сд",str.smallString("AA"),"a");
	}

	@Test
	public void testSmallString8() {
		assertEquals("һ����ĸ��Сд",str.smallString(""),"error");
	}
	
	@Test
	public void testSmallString9() {
		str=null;
		assertEquals("һ����ĸ��Сд",str.smallString(null),"error");
	}
	
	@Test
	public void testSmallString10() {
		assertEquals("һ����ĸ��Сд",str.smallString("K"),"k");
	}
	
}
