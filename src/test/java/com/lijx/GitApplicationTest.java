package com.lijx;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class GitApplicationTest
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public GitApplicationTest(String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( GitApplicationTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
    public void test(){
        System.out.println("测试分支1...");
    }
    public void test2(){
        System.out.println("测试分支2...");
    }
    public void test3(){
        System.out.println("测试分支3...");
    }
    public void test4(){
        System.out.println("测试分支4");
    }
    public void test5(){
        System.out.println("练习Git1");
    }
    public void test6(){
        System.out.println("练习Git2");
    }
    public void test7(){
        System.out.println("练习Git3");
    }
    public void test8(){
        System.out.println("练习Git4");
    }

}
