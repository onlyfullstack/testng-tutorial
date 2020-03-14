package com.onlyfullstack.dao;

import org.testng.Assert;
import org.testng.annotations.Test;

public class EmployeeDaoLayer {
    @Test
    public void testEmployeeData() {
        System.out.println("@Test - testEmployeeData");
    }

    @Test
    public void testInsert() {
        System.out.println("@Test - testInsert");
    }

    @Test
    public void testUpdate() {
        Assert.assertEquals("sample", "onlyfullstack");
    }
}
