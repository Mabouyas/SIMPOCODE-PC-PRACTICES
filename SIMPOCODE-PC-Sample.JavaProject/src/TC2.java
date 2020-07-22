import org.testng.annotations.*;

public class TC2 {

    @BeforeClass
    public void beforeClass() {
        System.out.println("This will execute before the class");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("This will execute after the class");
    }

    @BeforeMethod
    public void beforeMethod()
    {
        System.out.println("This will execute before every Method");
    }

    @AfterMethod
    public void afterMethod()
    {
        System.out.println("This will execute after every Method");
    }

    @Test
    public void test3()
    {
        System.out.println("This is test3...");
    }

    @Test
    public void test4() {
        System.out.println("This is test4...");
    }
}


