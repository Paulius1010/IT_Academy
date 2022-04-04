package uitest;

import org.junit.Assert;
import org.junit.Test;

public class BasicActionTest extends AbstractTest {

    @Test
    public void testPageTitle() {
        //write your code here
        Assert.assertEquals("Contact us - My Store", driver.getTitle());
    }
}
