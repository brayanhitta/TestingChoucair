import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {
    //Declaracion de los locators
By registerLinkLocator = By.linkText("Empleos");
By registerPageLocator = By.xpath("//img[@src='https://www.choucairtesting.com/wp-content/uploads/2019/07/banner.png']");
By enterLocator        = By.linkText("Prepararse para aplicar");

    @Test
    public void webdriverChrome() throws InterruptedException {
        //Se crea la ubicacion del chromedriver
        System.setProperty("webdriver.chrome.driver","C:/ChromeDriver/ChromeDriver.exe");

        //Aquí se coloca el link al que se va a ingresar
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.choucairtesting.com/");

        //Se le ordena la funcion a realizar
        driver.findElement(registerLinkLocator).click();
        if(driver.findElement(registerPageLocator).isDisplayed()){
            driver.findElement(enterLocator).click();
        }
        //Tiempo de espera para poder cerrar el WebDriver
        Thread.sleep(7000);


        driver.quit();
    }

}
