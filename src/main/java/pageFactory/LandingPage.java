package pageFactory;


import org.openqa.selenium.WebDriver;
import utils.WebDriverClient;

public class LandingPage {


    WebDriverClient pageWebDriver;

    public String txt_val1 = "//input[@name='val1']";

    public String txt_val2 = "//input[@name='val2']";

    public String radio_add = "//input[@value='add']";

    public String radio_sub = "//input[@value='sub']";

    public String radio_mul = "//input[@value='mul']";

    public String radio_div = "//input[@value='div']";

    public String btn_calculate = "//input[@value='Calculate']";

    public String txt_result = "//input[@name='result']";


    public LandingPage(WebDriver driver) {
        pageWebDriver = new WebDriverClient(driver);
    }

    
    public String gotoLandingPage(String url) {
        pageWebDriver.launchURL(url);
        return pageWebDriver.title();
    }

    
    public String performAddition(int operand1, int operand2) throws Exception {
        pageWebDriver.type(txt_val1, Integer.toString(operand1));
        pageWebDriver.type(txt_val2, Integer.toString(operand2));
        selectOperation("add");
        pageWebDriver.click(btn_calculate);
        return pageWebDriver.readText(txt_result);
    }

    
    public String performSubtraction(int operand1, int operand2) throws Exception {
        pageWebDriver.type(txt_val1, Integer.toString(operand1));
        pageWebDriver.type(txt_val2, Integer.toString(operand2));
        selectOperation("sub");
        pageWebDriver.click(btn_calculate);
        return pageWebDriver.readText(txt_result);
    }

    
    public String performMultiplication(int operand1, int operand2) throws Exception {
        pageWebDriver.type(txt_val1, Integer.toString(operand1));
        pageWebDriver.type(txt_val2, Integer.toString(operand2));
        selectOperation("mul");
        pageWebDriver.click(btn_calculate);
        return pageWebDriver.readText(txt_result);

    }

    
    public String performDivision(int operand1, int operand2) throws Exception {
        pageWebDriver.type(txt_val1, Integer.toString(operand1));
        pageWebDriver.type(txt_val2, Integer.toString(operand2));
        selectOperation("div");
        pageWebDriver.click(btn_calculate);
        return pageWebDriver.readText(txt_result);
    }

    
    public void selectOperation(String operation) throws Exception {
        if (operation.equals("add"))
            pageWebDriver.click(radio_add);
        else if
        (operation.equals("sub"))
            pageWebDriver.click(radio_sub);
        else if
        (operation.equals("mul"))
            pageWebDriver.click(radio_mul);
        else if (operation.equals("mul"))
            pageWebDriver.click(radio_div);
        else
            throw new Exception();
    }

}
