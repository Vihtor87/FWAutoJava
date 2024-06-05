package com.max;

import Login.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public abstract class ElementTest {
    static WebDriver driver;
    static LoginPage loginPage;

    private void authorization(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        //options.addArguments("--headless");
        options.addArguments("start-maximized");
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.get("https://gb.ru/login");
    }
    @BeforeEach
    void startChromeDriver(){
        authorization();
        loginPage = new LoginPage(driver);
    }
    @AfterEach
    void endChromeDriver(){
        driver.quit();
    }
}
