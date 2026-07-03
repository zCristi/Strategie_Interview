package com.strategie.interview.pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class RegistrationPage {

    private final Page page;

    
    private final Locator firstName;
    private final Locator lastName;
    private final Locator email;
    private final Locator password;
    private final Locator confirmPassword;

    
    private final Locator maleRadio;
    private final Locator femaleRadio;
    private final Locator preferNotToSayRadio;

    
    private final Locator dateOfBirth;
    private final Locator phoneNumber;
    private final Locator address;
    private final Locator linkedIn;
    private final Locator github;

    
    private final Locator submitButton;

    public RegistrationPage(Page page) {

        this.page = page;

        
        firstName = page.locator("#firstName");
        lastName = page.locator("#lastName");
        email = page.locator("#email");
        password = page.locator("#password");
        confirmPassword = page.locator("#confirmPassword");

        
        maleRadio = page.locator("#male");
        femaleRadio = page.locator("#female");
        preferNotToSayRadio = page.locator("#preferNotToSay");

        
        dateOfBirth = page.locator("#dob");
        phoneNumber = page.locator("#phone");
        address = page.locator("#address");
        linkedIn = page.locator("#linkedIn");
        github = page.locator("#github");

        
        submitButton = page.locator("input[type='submit']");
    }


    public void open(String url) {
        page.navigate(url);
    }


    public void enterFirstName(String value) {
        firstName.fill(value);
    }

    public void enterLastName(String value) {
        lastName.fill(value);
    }

    public void enterEmail(String value) {
        email.fill(value);
    }

    public void enterPassword(String value) {
        password.fill(value);
    }

    public void enterConfirmPassword(String value) {
        confirmPassword.fill(value);
    }


    public void selectGender(String gender) {

        switch (gender.toLowerCase()) {

            case "male":
                maleRadio.check();
                break;

            case "female":
                femaleRadio.check();
                break;

            case "prefer not to say":
            case "prefernottosay":
            case "prefer_not_to_say":
                preferNotToSayRadio.check();
                break;

            default:
                throw new IllegalArgumentException("Unknown gender: " + gender);
        }
    }

    public void enterDateOfBirth(String value) {
        dateOfBirth.fill(value);
    }

    public void enterPhoneNumber(String value) {
        phoneNumber.fill(value);
    }

    public void enterAddress(String value) {
        address.fill(value);
    }

    public void enterLinkedIn(String value) {
        linkedIn.fill(value);
    }

    public void enterGitHub(String value) {
        github.fill(value);
    }

    public void clickSubmit() {
        submitButton.click();
    }

    public void fillMandatoryFields(
            String first,
            String last,
            String emailAddress,
            String pass,
            String confirmPass) {

        enterFirstName(first);
        enterLastName(last);
        enterEmail(emailAddress);
        enterPassword(pass);
        enterConfirmPassword(confirmPass);
    }

    public void fillOptionalFields(
            String gender,
            String dob,
            String phone,
            String addr,
            String linkedInUrl,
            String githubUrl) {

        selectGender(gender);
        enterDateOfBirth(dob);
        enterPhoneNumber(phone);
        enterAddress(addr);
        enterLinkedIn(linkedInUrl);
        enterGitHub(githubUrl);
    }
}