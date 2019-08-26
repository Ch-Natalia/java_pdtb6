package ru.nc.pdtb6.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.nc.pdtb6.addressbook.model.ContactData;

public class ContactHelper extends HelperBase{

    public ContactHelper (WebDriver wd) {
        super(wd);
    }

    public void selectContact(){
        click(By.name("selected[]"));

    }

    public void modifyContact() {
        click(By.xpath("//img[@alt='Edit']"));
    }

    public void submitModification() {
        click(By.name("update"));
    }

    public void deleteContact() {
        click(By.xpath("//input[@value='Delete']"));
    }

    public void fillContactForm(ContactData contactData) {
        type(By.name("firstname"), contactData.getFirstname());
        type(By.name("lastname"), contactData.getLastname());
        type(By.name("company"), contactData.getWorkplace());
        type(By.name("mobile"), contactData.getPhone());
    }

    private void type(By locator, String text) {
        wd.findElement(locator).click();
        wd.findElement(locator).clear();
        wd.findElement(locator).sendKeys(text);
    }
}
