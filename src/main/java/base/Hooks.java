package base;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Hooks extends BasePage {

    public Hooks() {
        try {
            init(); // Initializes properties from config file
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Failed to initialize Hooks", e);
        }
    }


    @BeforeTest
    public void setup() throws IOException {
        getDriver().get(getUrl());
    }

    @AfterTest
    public void tearDown() {
        WebDriverInstance.cleanupDriver();
    }

}
