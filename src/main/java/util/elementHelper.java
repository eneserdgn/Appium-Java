package util;

import io.cucumber.core.logging.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;
import java.util.Random;

public class elementHelper {

    WebDriver driver;
    Actions actions;
    WebDriverWait wait;
    propertiesFactory propertiesFactory = new propertiesFactory();
    ;

    public elementHelper(WebDriver driver) {
        this.driver = driver;
        this.actions = new Actions(driver);
        this.wait = new WebDriverWait(driver, propertiesFactory.getWait());
    }

    public void click(By by) {
        scrollElement(by).click();
    }

    public void longPress(By by) {
        WebElement element = scrollElement(by);
        actions.clickAndHold(element).pause(Duration.ofSeconds(3)).release().perform();
    }

    public void checkElementsText(By by, String text) {
        boolean check = false;
        List<WebElement> elements = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
        for (WebElement element : elements) {
            if (element.getText().equals(text)) {
                check = true;
                break;
            }
        }
        Assert.assertEquals(check, true, "İstediğin textte element yok");
    }

    public String getElementsLastText(By by) {
        List<WebElement> elements = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
        return elements.get(elements.size()-1).getText();
    }

    public void clickElementsLast(By by) {
        List<WebElement> elements = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
        elements.get(elements.size()-1).click();
    }

    public String getElementsTextUnderElement(By by, String text, By underBy) {
        boolean check = false;
        String elementText = "";
        List<WebElement> elements = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
        for (WebElement element : elements) {
            if (element.getText().equals(text)) {
                System.out.println("enes");
                System.out.println(element.findElement(underBy).getTagName());
                elementText = element.findElement(underBy).getTagName();
                break;
            }
        }
        Assert.assertEquals(check, true, "İstediğin textte element yok");
        return elementText;
    }

    public void clickEquals(By by, String text) {
        List<WebElement> elements = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
        for (WebElement element : elements) {
            if (element.getText().equals(text)) {
                element.click();
                break;
            }
        }
    }

    public String getTitle() {
        return driver.getTitle();
    }

    public void clickListRandom(By by) {
        List<WebElement> elements = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
        Random rand = new Random();
        int size = rand.nextInt(elements.size());
        actions.moveToElement(elements.get(size)).build().perform();
    }

    public void sendKey(By by, String text) {
        scrollElement(by).clear();
        scrollElement(by).sendKeys(text);
    }

    public void clear(By by) {
        scrollElement(by).clear();
    }

    public String getText(By by) {
        String text = scrollElement(by).getText();
        return text;
    }

    public String getAttribute(By by, String attribute) {
        String attr = scrollElement(by).getAttribute(attribute);
        return attr;
    }

    public void waitAttribute(By by, String attribute, String exp) {
        wait.until(ExpectedConditions.elementToBeClickable(by));
    }

    public void checkElementPresence(By by) {
        wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }

    public void checkElementClickable(By by) {
        wait.until(ExpectedConditions.elementToBeClickable(by));
    }

    public void checkElementNotPresence(By by) {
        wait.until(ExpectedConditions.invisibilityOfElementLocated(by));
    }

    public void select(By by, String count) {
        Select dropdown = new Select(scrollElement(by));
        dropdown.selectByIndex(Integer.parseInt(count));
    }

    public String getSelectedText(By by) {
        Select dropdown = new Select(scrollElement(by));
        return dropdown.getFirstSelectedOption().getText();
    }


    public WebElement scrollElement(By by) {
        checkElementPresence(by);
        WebElement element = driver.findElement(by);
        actions.moveToElement(element).build().perform();
        return element;
    }


}
