import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Test_1 {
    WebDriver wd;

    @Test
    public void start(){
        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriverManager.chromedriver().setup();
        wd=new ChromeDriver();
        System.setProperty("webdriver.chromedriver", "C:/Users/julia/Documents/QA/QA_Automation/QA/QA_Test4/chromedriver.exe");
        // wd.get("https://contacts-app.tobbymarshall815.vercel.app/home"); // without history

        wd.navigate().to("https://trello.com/"); // with history
        wd.navigate().back();
        wd.navigate().forward();
        wd.navigate().refresh();


        //wd.close();
        wd.quit();
    }
    @Test
    public void firstTest(){
        wd=new ChromeDriver();
        wd.navigate().to("https://trello.com/");

        // open form --> click login button
        WebElement login;
        login.click();

        // fill valid email
        WebElement emailTextBox;
        emailTextBox.click();
        emailTextBox.clear();
        emailTextBox.sendKeys("");

        //confirm login
        WebElement confirmButton;
        confirmButton.click();


        // fill valid password
        WebElement passwordTextBox;
        passwordTextBox.click();
        passwordTextBox.clear();
        passwordTextBox.sendKeys("");

        // click confim pwd button
        WebElement logButton;
        logButton.click();

        // Assert
    }

}
