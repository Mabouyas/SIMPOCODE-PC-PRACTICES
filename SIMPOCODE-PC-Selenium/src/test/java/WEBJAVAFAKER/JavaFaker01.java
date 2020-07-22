package WEBJAVAFAKER;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class JavaFaker01 {
    
    @Test
    public void fakerTest() {
        Faker faker = new Faker();
        
        String name = faker.name().fullName();
        System.out.println("name = " + name);
        String firstName = faker.name().firstName();
        System.out.println("firstName = " + firstName);
        String lastName = faker.name().lastName();
        String streetAddress = faker.address().streetAddress();
        System.out.println("StreetAddress = " + streetAddress);
        String gameOfThrone = faker.gameOfThrones().quote();
        System.out.println("gameOfThrone = " + gameOfThrone);
        String chuckNorris = faker.chuckNorris().fact();
        System.out.println("chuckNorris = " + chuckNorris);
    }
}
