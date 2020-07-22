/*
1- Setup - open browser and application
2- Login
3- Close
 */


import org.testng.annotations.Test;

public class FirstTestCase {

    @Test(priority=2)
    public void setup() {
        System.out.println("Opening browser");
    }

    @Test(priority=1)
    public void login() {
        System.out.println("This is login test");
    }

    @Test(priority=3)
    public void tearDown() {
        System.out.println("Closing browser");
    }


}
