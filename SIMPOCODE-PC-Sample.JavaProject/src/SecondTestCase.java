import org.testng.Assert;
import org.testng.annotations.Test;

public class SecondTestCase {

    @Test(priority = 1)
    public void setup() {
        System.out.println("Opening browser");
    }

    @Test(priority = 2)
    public void searchCustomer() {
        System.out.println("This is search customer test");
        Assert.assertEquals(1,1);
    }

    @Test(priority = 3)
    public void addCustomer() {
        System.out.println("This is add customer test");
    }

    @Test(priority = 4)
    public void tearDown() {
        System.out.println("Closing browser");
    }

}
