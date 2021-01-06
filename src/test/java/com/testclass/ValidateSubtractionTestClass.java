package com.testclass;

import core.BaseTest;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.Test;

import java.io.FileNotFoundException;


public class ValidateSubtractionTestClass extends BaseTest {

    String url = null;
    public ValidateSubtractionTestClass() throws FileNotFoundException {
       // super(testName);
        url = rx.readConfig().get("url");
    }
 /*   public ValidateSubtractionTestClass(String testName) {
        super(testName);
    }*/

    @Test(description = "Validate Addition")
    public void test001_ValidateAddition() throws Exception {
        String operand1 = rx.readTestData(testName).getTestCase().get(0).getOperand1();
        String operand2 = rx.readTestData(testName).getTestCase().get(0).getOperand2();
        Assert.assertEquals(pageController.landingPage().gotoLandingPage("http://localhost:8080/qa_testCalc_java11/webUI"), "Ataccama TestCalc Web UI");
        Assert.assertEquals(pageController.landingPage().performSubtraction(Integer.parseInt(operand1),Integer.parseInt(operand2)), rx.readTestData(testName).getTestCase().get(0).getResult());
    }

    @Test(description = "Validate Addition with negative value")
    public void test002_ValidateAdditionWithNegativeValues() throws Exception {
        String operand1 = rx.readTestData(testName).getTestCase().get(1).getOperand1();
        String operand2 = rx.readTestData(testName).getTestCase().get(1).getOperand2();
        Assert.assertEquals(pageController.landingPage().gotoLandingPage("http://localhost:8080/qa_testCalc_java11/webUI"), "Ataccama TestCalc Web UI");
        Assert.assertEquals(pageController.landingPage().performSubtraction(Integer.parseInt(operand1),Integer.parseInt(operand2)), rx.readTestData(testName).getTestCase().get(1).getResult());
    }




}
