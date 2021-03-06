import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class MethodsForRegistrationFormTests {

    WebDriver driver = new FirefoxDriver();

//    WebDriver setDriver()
//    {
//        WebDriver driver = new FirefoxDriver();
//        return driver;
//    }

    public void setSleep(long timeInMillis) throws InterruptedException {
        Thread.sleep(timeInMillis);
    }

    public void setWait(int timeInSeconds)
    {
        WebDriverWait wait = new WebDriverWait(driver, timeInSeconds);
    }

    public void webPageLoad()
    {
        driver.get("http://contactform-swedbank.rhcloud.com/registration.html");
    }

    public void setMessageInput(String message)
    {
        WebElement messageInput = driver.findElement(By.id("inputOther"));
        messageInput.clear();
        messageInput.sendKeys(message);
    }

    public void setNameInput(String name)
    {
        WebElement nameInput = driver.findElement(By.id("inputName"));
        nameInput.clear();
        nameInput.sendKeys(name);
    }

    public void setSurnameInput(String surname)
    {
        WebElement surnameInput = driver.findElement(By.id("inputSurname"));
        surnameInput.clear();
        surnameInput.sendKeys(surname);
    }

    public void setPhonenrInput(String number)
    {
        WebElement phonenrInput = driver.findElement(By.id("inputPhone"));
        phonenrInput.clear();
        phonenrInput.sendKeys(number);
    }

    public void setEmailInput(String email)
    {
        WebElement emailInput = driver.findElement(By.id("inputEmail"));
        emailInput.clear();
        emailInput.sendKeys(email);
    }

    public void setDateInput(String date)
    {
        WebElement dateInput = driver.findElement(By.id("inputDate"));
        dateInput.clear();
        dateInput.sendKeys(date);
    }

    public void setTopicSelect(int index)
    {
        Select topicSelect = new Select(driver.findElement(By.id("inputTopic")));
        topicSelect.selectByIndex(index);
    }

    public void setBankDivisionSelect(int index)
    {
        Select bankDivisionSelect = new Select(driver.findElement(By.id("inputBankDivision")));
        bankDivisionSelect.selectByIndex(index);
    }

    public boolean setSubmitButtonIsClickable()
    {
        WebElement submitButton = driver.findElement(By.xpath("//input[contains(@value, 'Siųsti')]"));
        return submitButton.isEnabled();
    }

    public void clickLtButton()
    {
        WebElement ltButton = driver.findElement(By.id("lt"));
        ltButton.click();
    }

    public void clickSubmitButton()
    {
        WebElement submitButton = driver.findElement(By.xpath("//input[contains(@value, 'Siųsti')]"));
        submitButton.click();
    }

    public void clickRegisterButton()
    {
        WebElement registerButton =
                driver.findElement(By.xpath("//input[contains(@class, 'col-xs-offset-8 col-xs-2 btn btn-primary')]"));
        registerButton.click();
    }

    WebElement checkAciuKadKreipiatesPasMusTextArea()
    {
        WebElement aciuKadKreipiatesPasMusTextArea =
                driver.findElement(By.xpath("//p[contains(@class, 'col-xs-10 ng-binding')]"));
        return  aciuKadKreipiatesPasMusTextArea;
    }

    public void quitDriver()
    {
        driver.quit();
    }

}
