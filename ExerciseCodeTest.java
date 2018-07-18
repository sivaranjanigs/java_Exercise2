package com.Exercise2.code.test;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertArrayEquals;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import com.Exercise2.code.*;



public class ExerciseCodeTest {
	private static ExerciseCode exerTest;
	private static MemberVariable mVar;
	private static EvenNumTest evenNum;
	private static Student stud;
	private static FileUpper fpUppLen;
	private static FileFilter fileFilt;
	private static Factorial fact;
	private static Frequency freq;


	@BeforeClass
	public static void setup() {
		exerTest = new ExerciseCode();

	}

	@AfterClass
	public static void teardown() {
		exerTest = null;

	}

	@SuppressWarnings("deprecation")
	@Test
	public void testCheckPalindrome() {
		int num = 24542;
		assertEquals(24542, exerTest.checkPalindrome(num));
	}

	@Test
	public void testPowerOfFour() {
		int num = 16;
		assertEquals(1, exerTest.powerOfFour(num));
	}

	@Test
	public void testDisplayMemberVariables() {
		assertArrayEquals(new String[] { "Members name:Harry Potter", "member salary:2500.3", "member age:30" },
				mVar.displayMemberVariables(new String[] { "Members name:", "member salary:", "member age:" }));
	}

	@Test
	public void testisEven() {

		assertEquals(true, evenNum.isEven(30));
	}

	@Test
	public void testStudent() {
		String[] expect = { "81.5", "65", "98" };
		int[] array = { 86, 65, 98, 77 };
		String[] actual = stud.findAvgMinMax(4, array);
		assertArrayEquals(expect, actual);

	}

	@Test
	public void testFileUpperLength() {
		String expect = "HI HELLO";
		assertEquals(expect, fpUppLen.convertUpper("/home/ranjani/Desktop/test.txt"));
		assertEquals("9.0", fpUppLen.findLength("/home/ranjani/Desktop/test.txt"));

	}
	@Test
	public void testFileFilter() {
		File folder = new File("/home/ranjani/Desktop/filecheck");
		assertEquals("hellohi",fileFilt.listFilesForFolder(folder));

	}
	@Test
	public void testFact() {

	    assertEquals(479001600, fact.printIntFactorials(1, 1));
	    assertEquals(2432902008176640000L, fact.printLongFactorials(1, 1));
	}
	
	@Test
	public void testFrequency() throws FileNotFoundException {
		
		Map<String, Integer> words = new HashMap<String, Integer>();
		String path ="/home/ranjani/FileDemo.txt/";

		String expected="{sleep=1, a=2, home.=1, like=1, have=1, i=3, man=1, to=1, am=1, ,=2}";
		assertEquals(expected,freq.countWordFrequency(path,words));
		}

}
