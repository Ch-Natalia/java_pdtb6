package ru.nc.pdtb6.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactHelper extends HelperBase{

    public ContactHelper (WebDriver wd) {
        super(wd);
    }

    public void selectContact(){
        click(By.id("2"));

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
}
