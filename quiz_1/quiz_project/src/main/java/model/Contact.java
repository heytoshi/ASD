package model;

import java.util.ArrayList;
import java.util.List;

public class Contact {
    private String firstName;
    private String lastName;
    private String company;
    private String job;
    private List<PhoneNumber> phoneNumbers;
    private List<Email> emails;

    public Contact() {

    }

    public Contact(String firstName, String lastName, String company, String job) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.company = company;
        this.job = job;
        this.phoneNumbers = new ArrayList<>();
        this.emails = new ArrayList<>();
    }

    public void addPhone(PhoneNumber phone) {
        phoneNumbers.add(phone);
    }

    public void addEmail(Email email) {
        emails.add(email);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public List<PhoneNumber> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(List<PhoneNumber> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    public List<Email> getEmails() {
        return emails;
    }

    public void setEmails(List<Email> emails) {
        this.emails = emails;
    }
}
