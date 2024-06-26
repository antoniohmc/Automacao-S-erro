package pages.positivas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CadastroEmail {

    static WebDriver driver;

    public CadastroEmail(WebDriver driver) {
        this.driver = driver;
    }

    public void preencherCampo() {
        WebElement name = driver.findElement(By.name("Username"));
        name.sendKeys("henriquecampos0148");

        WebElement botaoAvancar = driver.findElement(By.xpath("//span[contains(text(), 'Avançar')]"));
        botaoAvancar.click();
        WebDriverWait waitPg4 = new WebDriverWait(driver, Duration.ofSeconds(50));

        waitPg4.until(ExpectedConditions.presenceOfElementLocated(
                By.xpath("//span[contains(text(), 'Crie uma senha forte')]")));

    }
}
