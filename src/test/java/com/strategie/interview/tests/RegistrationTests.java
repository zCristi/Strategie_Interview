package com.strategie.interview.tests;

import com.strategie.interview.base.BaseTest;
import com.strategie.interview.pages.RegistrationPage;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class RegistrationTests extends BaseTest {

    @Test
    @DisplayName("TC-001 - Verify successful user profile creation with valid data")
    void successfulRegistration() {

        // Arrange
        RegistrationPage registrationPage = new RegistrationPage(page);

        // Act
        registrationPage.open(BASE_URL);

        registrationPage.fillMandatoryFields(
                "John",
                "Smith",
                "john.smith@example.com",
                "P@ssw0rd123",
                "P@ssw0rd123"
        );

        registrationPage.fillOptionalFields(
                "male",
                "1995-01-15",
                "1234567890",
                "123 Main St, Apt 1",
                "https://www.linkedin.com/in/johnsmith",
                "https://github.com/johnsmith"
        );

        registrationPage.clickSubmit();

        // Assert
        // An actual message or page would load showing success
    }
}