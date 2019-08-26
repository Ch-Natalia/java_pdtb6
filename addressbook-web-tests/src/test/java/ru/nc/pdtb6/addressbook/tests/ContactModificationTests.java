package ru.nc.pdtb6.addressbook.tests;

import org.testng.annotations.Test;
import ru.nc.pdtb6.addressbook.model.ContactData;

public class ContactModificationTests extends TestBase{

    @Test
    public void testContactModification(){
       app.getNavigationHelper().gotoHomePage();
       app.getContactHelper().selectContact();
       app.getContactHelper().modifyContact();
       app.getContactHelper().fillContactForm(new ContactData("Alex", "Corn", "Secret", "11111111", null));
       app.getContactHelper().submitModification();
       app.getNavigationHelper().gotoHomePage();
        }
}
