import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UltimateQATest extends PageSetup{



        @Test
        public void testOne() {
            WebElement buttonUsingID = driver.findElementById ("idExample");
            buttonUsingID.click();

            WebElement buttonSuccesText = driver.findElementByClassName("entry-title");
            Assertions.assertEquals("Button success", buttonSuccesText.getText());

        }

        @Test
    public void test2() throws InterruptedException {
        WebElement nameTextField = driver.findElementByName("et_pb_contact_name_0");
        nameTextField.sendKeys("Tester");


        WebElement emailTextField = driver.findElementByName("et_pb_contact_email_0");
        emailTextField.sendKeys("Tester@testar.com");

        Thread.sleep(3000);

        WebElement emailButton =  driver.findElementByName("et_builder_submit_button");
        emailButton.click();

            Thread.sleep(3000);
        }


}
