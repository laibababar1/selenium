import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class sigintest {

    WebDriver driver = new ChromeDriver();


    @Test
    public void passcaseforsignin(){
        driver.navigate().to("https://sis.cuiatd.edu.pk/login.aspx");

        Select batchno = new Select(driver.findElement(By.id("ddl_Session")));
        batchno.selectByVisibleText("FA17");
        Select program = new Select(driver.findElement(By.id("ddl_Program")));
        program.selectByVisibleText("BSE");


        WebElement rollnoo = driver.findElement(By.id("txt_RollNo"));
        String js = "arguments[0].setAttribute('value','"+"034"+"')";
        ((JavascriptExecutor) driver).executeScript(js, rollnoo);

        WebElement password = driver.findElement(By.id("txt_Password"));
        String js1 = "arguments[0].setAttribute('value','"+"#mypassword#"+"')";
        ((JavascriptExecutor) driver).executeScript(js1, password);

        WebElement signIn = driver.findElement(By.id("btn_StudentSignIn"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", signIn);






    }
    @Test
    public void signinstestingfailcase(){
        driver.navigate().to("https://sis.cuiatd.edu.pk/login.aspx");

        Select batchno = new Select(driver.findElement(By.id("ddl_Session")));
        batchno.selectByVisibleText("FA17");
        Select program = new Select(driver.findElement(By.id("ddl_Program")));
        program.selectByVisibleText("bse");


        WebElement rollnoo = driver.findElement(By.id("txt_RollNo"));
        String js = "arguments[0].setAttribute('value','"+"034"+"')";
        ((JavascriptExecutor) driver).executeScript(js, rollnoo);

        WebElement password = driver.findElement(By.id("txt_Password"));
        String js1 = "arguments[0].setAttribute('value','"+"#mypassword#"+"')";
        ((JavascriptExecutor) driver).executeScript(js1, password);

        WebElement signIn = driver.findElement(By.id("btn_StudentSignIn"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", signIn);


    }
}
