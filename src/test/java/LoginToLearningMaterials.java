import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginToLearningMaterials {

    WebDriver driver;
@BeforeTest
    public void LaunchBrowser(){
        driver = new ChromeDriver();
    }
@Test
    public void startBrowser(){
        driver.get("https://ndosiautomation.co.za/");
        driver.manage().window().maximize();
    }
@Test(priority = 1)
    public void verifyHomePageIsDisplayed(){
    driver.findElement(By.id("nav-btn-overview")).isDisplayed();
    }
@Test(priority = 2)
    public void clickLearningMaterials(){
    driver.findElement(By.id("nav-btn-practice")).click();
    }
@Test(priority = 3)
    public void enterEmail(){
    driver.findElement(By.id("login-email")).sendKeys("Ayanda123@gmail.com");
    }
@Test(priority = 4)
    public void enterPassword(){
    driver.findElement(By.id("login-password")).sendKeys("12345678");
    }
@Test(priority = 5)
    public void clickLoginButton()throws InterruptedException{
    driver.findElement(By.id("login-submit")).click();
    Thread.sleep(Long.parseLong("2000"));
    }
@Test(priority = 6)
    public void verifyPractiseheardingIsDisplayed() throws InterruptedException{
    driver.findElement(By.id("practice-heading")).isDisplayed();
    Thread.sleep(Long.parseLong("2000"));
    }
@Test(priority = 7)
    public void clickWebAutomationBasicForm() throws InterruptedException{
    driver.findElement(By.xpath("//*[@id=\"tab-btn-password\"]/span[2]")).click();
    Thread.sleep(Long.parseLong("2000"));
    }
@Test(priority = 8)
    public void enterFullName(){
    driver.findElement(By.id("name")).sendKeys("Mrs King");
}
@Test(priority = 9)
public void enterEmailAddress(){
    driver.findElement(By.id("email")).sendKeys("Ayanda King@gmail.com");
}
@Test(priority = 10)
public void enterAge(){
    driver.findElement(By.id("age")).sendKeys("35");
}
@Test(priority = 11)
public void selectGender(){
    driver.findElement(By.id("gender")).sendKeys("Female");
}
@Test(priority = 12)
public void selectCountry(){
    driver.findElement(By.id("country")).sendKeys("United State");
}
@Test(priority = 13)
public void selectExperienceLevel(){
    driver.findElement(By.id("experience")).sendKeys("Advance(+5years)");
}
@Test(priority = 14)
public void clickSkills(){
    driver.findElement(By.id("skill-testing")).click();
}
@Test(priority = 15)
public void enterAdditionalComments()throws InterruptedException{
    driver.findElement(By.id("comments")).sendKeys("Mrs King is an exceptional tester, who pays attention to every detail on the software");
 Thread.sleep(Long.parseLong("1000"));
}
@Test(priority = 16)
public void clickAcceptTerms(){
    driver.findElement(By.id("terms")).click();
    }
@Test(priority = 17)
    public void clickSubmitButton() throws InterruptedException{
    driver.findElement(By.id("submit-btn")).click();
    Thread.sleep(Long.parseLong("1000"));
    }
    @AfterTest
    public void closeBrowser(){
    driver.close();
    }
}

