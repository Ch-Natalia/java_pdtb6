package ru.nc.pdtb6.addressbook;


import org.testng.annotations.*;

public class GroupCreationTests extends TestBase {

  @Test
  public void testGroupCreation() throws Exception {
    gotoGroupPage();
    initGroupCreation();
    fillGroupForm(new GroupData("wer", "we2", "we3"));
    submitGroupCreation();
    returnToGroupPage();
    logout();
  }

}
