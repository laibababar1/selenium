import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class signuptest {
    WebDriver driver = new ChromeDriver();
    @Test
    public void signinstestingpasscase()
    {
        driver.navigate().to("https://www.udemy.com/join/signup-popup/?locale=en_US&response_type=html&next=https%3A%2F%2Fwww.udemy.com%2Flogout%2F");



        WebElement myElement3 = driver.findElement(By.id("id_fullname"));
        String js3 = "arguments[0].setAttribute('value','"+"laiba babar"+"')";
        ((JavascriptExecutor) driver).executeScript(js3, myElement3);

        WebElement myElement4 = driver.findElement(By.id("email--1"));
        String js4 = "arguments[0].setAttribute('value','"+"laibababarrr@gmail.com"+"')";
        ((JavascriptExecutor) driver).executeScript(js4, myElement4);

        WebElement myElement5 = driver.findElement(By.id("password"));
        String js5 = "arguments[0].setAttribute('value','"+"Qwerty123"+"')";
        ((JavascriptExecutor) driver).executeScript(js5, myElement5);

        WebElement ele = driver.findElement(By.id("submit-id-submit"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", ele);

    }
    @Test
    public void signinstestingfailcase()
    {
        driver.navigate().to("https://www.udemy.com/join/signup-popup/?locale=en_US&response_type=html&next=https%3A%2F%2Fwww.udemy.com%2Flogout%2F");


        WebElement myElement3 = driver.findElement(By.id("id_fullname"));
        String js3 = "arguments[0].setAttribute('value','"+"laiba"+"')";
        ((JavascriptExecutor) driver).executeScript(js3, myElement3);

        WebElement myElement4 = driver.findElement(By.id("email--1"));
        String js4 = "arguments[0].setAttribute('value','"+"laibababarrr@gmail.com"+"')";
        ((JavascriptExecutor) driver).executeScript(js4, myElement4);

        WebElement myElement5 = driver.findElement(By.id("password"));
        String js5 = "arguments[0].setAttribute('value','"+"Qwerty123"+"')";
        ((JavascriptExecutor) driver).executeScript(js5, myElement5);

        WebElement ele = driver.findElement(By.id("submit-id-submit"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", ele);

    }


}
