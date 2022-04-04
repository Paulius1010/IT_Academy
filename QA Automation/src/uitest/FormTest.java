package uitest;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FormTest extends AbstractTest {

    @Test
    public void testContactUsForm() {
        //write your code here
        Select heading = new Select(driver.findElement(By.id("id_contact")));
        heading.selectByIndex(1);

        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("aaa@gmail.com");
        WebElement order = driver.findElement(By.id("id_order"));
        order.sendKeys("bbb");
        WebElement message = driver.findElement(By.id("message"));
        message.sendKeys("ccc");
        WebElement button = driver.findElement(By.id("submitMessage"));
        button.click();

    }
}
