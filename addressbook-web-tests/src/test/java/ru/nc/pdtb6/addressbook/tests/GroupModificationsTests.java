package ru.nc.pdtb6.addressbook.tests;

import org.testng.annotations.Test;
import ru.nc.pdtb6.addressbook.model.GroupData;

public class GroupModificationsTests extends TestBase {

    @Test
    public void testGroupModification(){
        app.getNavigationHelper().gotoGroupPage();
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().initGroupModification();
        app.getGroupHelper().fillGroupForm(new GroupData("wer", "we2", "we3"));
        app.getGroupHelper().submitGroupModification();
        app.getGroupHelper().returnToGroupPage();
    }

}
