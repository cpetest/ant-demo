package com.vaannila.domain;


import junit.framework.TestCase;
import org.junit.Test;

public class UserTest extends TestCase {
    int i = 0;
    Boolean b = false;

    @Test
    public void test001() {
        if (i == 0) {
            b = true;
        } else {
            assertTrue("i is 0", b);
        }
    }

    @Test
    public void test002() {
        if (i == 1) {
            b = true;
        } else {
            assertTrue("i is 0", b);
        }
    }
}
