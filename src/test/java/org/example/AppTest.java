package org.example;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    public void test1_task3()
    {
        assertTrue(App.task3("aassaa"));
    }
    public void test2_task3()
    {
        assertTrue(App.task3("aasaa"));
    }
    public void test3_task3()
    {
        assertFalse(App.task3("absaa"));
    }
    public void test4_task3()
    {
        assertFalse(App.task3("abssaa"));
    }
    public void test5_task3()
    {
        assertTrue(App.task3("margeletsnorahseesharonstelegram"));
    }
}
