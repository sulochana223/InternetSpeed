package org.test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Speed {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sreenivasan\\eclipse-workspace\\IntenetSpeed\\Driver\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://fast.com/");
driver.manage().window().maximize();
Thread.sleep(20000);
WebElement ref = driver.findElement(By.xpath("//div[@class='speed-controls-container centered']"));
String print=ref.getText();
System.out.println(print);


}
}
