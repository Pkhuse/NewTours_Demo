
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;



public class Registration {

    public static void main(String[]args)
    {


        System.setProperty("webdriver.chrome.driver","C:\\Users\\Palesa\\IdeaProjects\\NewTours_Demo\\Drivers\\chromedriver.exe");

        WebDriver driver= new ChromeDriver();


        //maximize screen
        driver.manage().window().maximize();

        // Open NewTours browser
        driver.get("http://demo.guru99.com/test/newtours");

        //Click sign on button
        driver.findElement(By.xpath("//a[contains(text(),'REGISTER')]")).click();

        //Input first name
        driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Palesa");
        //Input last name
        driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Khuse");
        //Input phone number
        driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("0839193030");
        //Input email address
        driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("pk@gmail.com");
        //Input address
        driver.findElement(By.xpath("//input[@name='address1']")).sendKeys("18 Loop Street");
        //Input City
        driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Cape Town");
        //Input Province
        driver.findElement(By.xpath("//input[@name='state']")).sendKeys("Western Cape");
        //Input Postal code
        driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys("7750");
        //Input Country

        By option = By.xpath("//select[@name = 'country']/option[@value = 'South Africa']");
        driver.findElement(option).click();


        //Input username
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Palesa");
        //Input password
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Test123");
        //Input confirm password
        driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("Test123");

        //  Click submit button
        driver.findElement(By.xpath("//input[@name='submit']")).click();


        //Variable to store Results
        String Registration_verification="";

        //Check if Note: Your user name is Palesa. element is Displayed.
        if (driver.findElement(By.xpath("//b[contains(text(),'Note: Your user name is Palesa.')]")).isDisplayed()) {

            Registration_verification = "Registration Passed";

        } else
            Registration_verification="Registration Failed";


        System.out.println(Registration_verification);

        //Click Sign In
        driver.findElement(By.xpath("//a[contains(text(),'sign-in')]")).click();
        //Enter username
        driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("Palesa");
        //Enter Password
        driver.findElement(By.xpath("//input[@name='password']")) .sendKeys("Test123");
        //Click submit
        driver.findElement(By.xpath("//input[@name='submit']")) .click();

        //Variable to store Results
        String LoginPage="";

        //Check if login Successfully element is Displayed.
        if (driver.findElement(By.xpath("//h3[contains(.,'Login Successfully')]")).isDisplayed()) {

            LoginPage = "Login Passed";

        } else
            LoginPage="Login Failed";


        System.out.println(LoginPage);
        driver.close();






    }



}
