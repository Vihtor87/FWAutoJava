package com.max;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class UITest extends ElementTest{

    @Test
    void testGBNotEmailLogin() {
        loginPage.loginUserPage("login");
        loginPage.passwordUserPage("password");
        loginPage.buttonEnterPage();

        Assertions.assertFalse(driver.findElements(By
                .xpath("//*[@class='parsley-type'][text()='Введите адрес электронной почты.']")).isEmpty());
    }

    @Test
    void testGBWithoutPassword() {
        loginPage.loginUserPage("login@login.ru");
        loginPage.buttonEnterPage();

        Assertions.assertFalse(driver.findElements(By
                .xpath("//*[@class='parsley-required'][text()='Обязательное поле.']")).isEmpty());
    }
}
