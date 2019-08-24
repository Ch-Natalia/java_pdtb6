package ru.nc.pdtb6.addressbook.tests;

import org.testng.annotations.Test;

public class ContactModificationTests extends TestBase{

    @Test
    public void testContactModification(){
       app.getNavigationHelper().gotoHomePage();
       app.getContactHelper().selectContact();
       app.getContactHelper().modifyContact();
       app.getContactHelper().submitModification();
       app.getNavigationHelper().gotoHomePage();
        }
}
