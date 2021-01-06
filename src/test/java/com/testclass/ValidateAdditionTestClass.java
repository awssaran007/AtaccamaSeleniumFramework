package com.testclass;

import core.BaseTest;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.FileNotFoundException;


public class ValidateAdditionTestClass extends BaseTest {

    String url = null;


    public ValidateAdditionTestClass() throws FileNotFoundException {
        System.out.println("in  class");
        //this should be in before test setup() as per te env
        url = rx.readConfig().get("url");
    }

    @Test(description = "Validate Addition")
    public void test001_ValidateAddition() throws Exception {
        String operand1 = rx.readTestData(testName).getTestCase().get(0).getOperand1();
        String operand2 = rx.readTestData(testName).getTestCase().get(0).getOperand2();
        Assert.assertEquals(pageController.landingPage().gotoLandingPage(url), "Ataccama TestCalc Web UI");
        Assert.assertEquals(pageController.landingPage().performAddition(Integer.parseInt(operand1),Integer.parseInt(operand2)), rx.readTestData(testName).getTestCase().get(0).getResult());
    }

    @Test(description = "Validate Addition with negative value")
    public void test002_ValidateAdditionWithNegativeValues() throws Exception {
        String operand1 = rx.readTestData(testName).getTestCase().get(1).getOperand1();
        String operand2 = rx.readTestData(testName).getTestCase().get(1).getOperand2();
        Assert.assertEquals(pageController.landingPage().gotoLandingPage(url), "Ataccama TestCalc Web UI");
        Assert.assertEquals(pageController.landingPage().performAddition(Integer.parseInt(operand1),Integer.parseInt(operand2)), rx.readTestData(testName).getTestCase().get(1).getResult());
    }


    }





