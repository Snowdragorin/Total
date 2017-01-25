import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.IOException;

/**
 * Created by blankamachackova on 25.01.17.
 */
public class ExportPDFTest {
    package LogInLogOutSuite;



import Library.Utility;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;

import java.io.IOException;


    /**
     * Created by blankamachackova on 04.01.17.
     *
     *
     * Preconditons:
     * Existing user, valid username and password
     */

    public class LogInTest {
        @Test
        public void logIn (WebDriver driver) throws IOException, InterruptedException {

            System.setProperty("web.gecko.driver", "/usr/local/Cellar/geckodriver/0.11.1");
            driver = new FirefoxDriver();
            driver.get("tstmag.nifique.eu/dashboard/");
            driver.manage().window().maximize();


            //Finding login pop up, e-mail, password, and submit form
            driver.findElement(By.id("user_login")).sendKeys("alex");
            driver.findElement(By.id("user_pass")).sendKeys("woldan");



            js.executeScript("var el = document.querySelector('#loginform > div');
                                    var string = el.innerText;
                                     var stringArray = string.substring(20).trim().split(/\s+/);
                                         stringArray[0];
                                         stringArray[2];")
            Integer firstNumber = driver.findElement(By.xpath("//*[@id=\"loginform\"]/div")).getText("(\\d)\\s+(&nbsp;)\\s+(\\+(?!\\w)){0,1}(\\=(?!\\w)){0,1}\\s+(&nbsp;)");
            Integer secondNumber = driver.findElement(By.xpath("//*[@id=\"loginform\"]/div")).getText("(\\d)\\s+(&nbsp;)\\s+(\\+(?!\\w)){0,1}(\\=(?!\\w)){0,1}\\s+(&nbsp;)");

            Integer resultNumber = firstNumber + secondNumber;

            driver.findElement(By.cssSelector("#loginform > div > input[type=\"input\"]:nth-child(2)")).sendKeys(resultNumeber);


            driver.findElement(By.cssSelector(".login-form button[type=submit]")).click();
            Thread.sleep(30000);


            if (driver.getCurrentUrl().contains("https://app.dev.sendit.gl")) {

                System.out.println("Login test passed");
            } else {
                System.out.println("Login test failed");

            }

        }


    }

}
