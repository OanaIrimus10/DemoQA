package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class webTableTest {

    public WebDriver driver;

    @Test

    public void automationMethod(){
        //deschidem un browser de Chrome
        driver= new ChromeDriver();

        // accesam o pagina web
        driver.get("https://demoqa.com/");
        //facem browserul maximize
        driver.manage().window().maximize();

        //facem scroll
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,350)", "");

        //declaram un elemet ca sa poata sa fie gasit
        WebElement ElementsField=driver.findElement(By.xpath("//h5[text()='Elements']"));
        ElementsField.click();

        WebElement WebTableField=driver.findElement(By.xpath("//span[text()='Web Tables']"));
        WebTableField.click();

        WebElement AddField=driver.findElement(By.id("addNewRecordButton"));
        AddField.click();

        WebElement FirstNameField= driver.findElement(By.id("firstName"));
        String firstNameValue="Oana";
        FirstNameField.sendKeys(firstNameValue);

        WebElement LastNameField= driver.findElement(By.id("lastName"));
        String lastNameValue="Irimus";
        LastNameField.sendKeys(lastNameValue);

        WebElement EmailField= driver.findElement(By.id("userEmail"));
        String emailValue="oana@test.com";
        EmailField.sendKeys(emailValue);

        WebElement AgeField= driver.findElement(By.id("age"));
        String ageValue= "25";
        AgeField.sendKeys(ageValue);

        WebElement  SalaryField= driver.findElement(By.id("salary"));
        String salaryValue= "9800";
        SalaryField.sendKeys(salaryValue);

        WebElement  DepartmentField= driver.findElement(By.id("department"));
        String departmentValue= "QA";
        DepartmentField.sendKeys(departmentValue);

        WebElement SubmitButton=driver.findElement(By.id("submit"));
        SubmitButton.click();




        








    }



}
