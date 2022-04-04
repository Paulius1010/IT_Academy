package uitest;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SelectorTest extends AbstractTest {

    @Test
    public void testSignInText() {
        //write your code here
        WebElement signIn = driver.findElement(By.cssSelector("#header > div.nav > div > div > nav > div.header_user_info > a"));
        Assert.assertEquals("Sign in", signIn.getText());
    }

    @Test
    public void testPhoneNumber() {
        //write your code here
        WebElement phone = driver.findElement(By.xpath("/html/body/div/div[1]/header/div[2]/div/div/nav/span/strong"));
        Assert.assertEquals("0123-456-789", phone.getText());
    }

    @Test
    public void testLastProductPrice() {
        //write your code here
        WebElement product = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div[1]/ul[1]/li[7]/div/div[2]/div[1]/span[2]"));
        Assert.assertEquals("$20.50", product.getText());
    }

    @Test
    public void testPhoneNumber2() {
        //write your code here
        WebElement phone = driver.findElement(By.cssSelector("#block_contact_infos > div > ul > li:nth-child(2) > span"));
        Assert.assertEquals("(347) 466-7432", phone.getText());
    }


}
