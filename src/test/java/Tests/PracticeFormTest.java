package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.net.NoRouteToHostException;

public class PracticeFormTest {

    public WebDriver driver;

    @Test

    public void automationMethod() {
        //deschidem un browser de Chrome
        driver = new ChromeDriver();

        // accesam o pagina web
        driver.get("https://demoqa.com/");
        //facem browserul maximize
        driver.manage().window().maximize();

        //facem scroll
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,350)", "");

        WebElement formElement= driver.findElement(By.xpath("//h5[text()='Forms']"));
        formElement.click();

        WebElement practiceFormField=driver.findElement(By.xpath("//span[text()='Practice Form']"));
        practiceFormField.click();

        WebElement firstNameField= driver.findElement(By.id("firstName"));
        String firstNameValue="Oana";
        firstNameField.sendKeys(firstNameValue);

        WebElement lastNameField= driver.findElement(By.id("lastName"));
        String lastNameValue="Irimus";
        lastNameField.sendKeys(lastNameValue);

        WebElement emailField= driver.findElement(By.id("userEmail"));
        String emailValue="oana@gmail.com";
        emailField.sendKeys(emailValue);

        WebElement mobileField= driver.findElement(By.cssSelector("input[placeholder='Mobile Number']"));
        String mobilelValue="0745854548";
        mobileField.sendKeys(mobilelValue);


        WebElement pictureField=driver.findElement(By.id("uploadPicture"));
        File file = new File("src/test/resources/astrobot-richardson-stewart.jpg");
        pictureField.sendKeys(file.getAbsolutePath());

        WebElement maleElement= driver.findElement(By.xpath("//label[@for='gender-radio-1']"));
        WebElement femaleElement= driver.findElement(By.xpath("//label[@for='gender-radio-2']"));
        WebElement otherGenderElement= driver.findElement(By.xpath("//label[@for='gender-radio-3']"));

        String genderValue="Female";
        if (maleElement.getText().equals(genderValue)) {
            maleElement.click();
        }
            else if(femaleElement.getText().equals(genderValue)) {
                femaleElement.click();
            }
               else {
                   otherGenderElement.click();
                }

    }
}
