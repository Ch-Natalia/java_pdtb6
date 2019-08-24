package ru.nc.pdtb6.addressbook;

public class ContactData {
    private final String firstname;
    private final String lastname;
    private final String workplace;
    private final String phone;

    public ContactData(String firstname, String lastname, String workplace, String phone) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.workplace = workplace;
        this.phone = phone;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getWorkplace() {
        return workplace;
    }

    public String getPhone() {
        return phone;
    }
}
