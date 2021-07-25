import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

    public static void main(String[]args)
    {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Palesa\\IdeaProjects\\NewTours_Demo\\Drivers\\chromedriver.exe");

        WebDriver driver= new ChromeDriver();


        //maximize screen
        driver.manage().window().maximize();

        // Open NewTours browser
        driver.get("http://demo.guru99.com/test/newtours");

        //Click sign on button
        driver.findElement(By.xpath("//a[contains(text(),'SIGN-ON]'")).click();

        //Input Username
        driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("Test");

        //Input Password
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Test");

        // Click submit button
        driver.findElement(By.xpath("//input[@name='submit']")).click();

        //Variable to store Results
        String TestResults="";

         //Check if login Successfully element is Displayed.
        if (driver.findElement(By.xpath("//h3[contains(.,'Login Successfully')]")).isDisplayed()) {

            TestResults = "Passed";

        } else
                TestResults="Failed";



         System.out.println(TestResults);
        driver.close();






    }
}
