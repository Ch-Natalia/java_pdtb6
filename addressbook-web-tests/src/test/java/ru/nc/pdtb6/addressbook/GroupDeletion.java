package ru.nc.pdtb6.addressbook;

import org.testng.annotations.Test;

public class GroupDeletion extends TestBase {

  @Test
  public void testGroupDeletion() throws Exception {
    gotoGroupPage();
    selectGroup();
    deleteSelectedGroup();
    returnToGroupPage();
  }
}
