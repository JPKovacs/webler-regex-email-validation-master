package hu.webler;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Unit testing of email validator")
class EmailValidatorTest {

    @Test
    @DisplayName("Should return true in case of valid email")
    void shouldReturnTrue_forValidEmail() {
        String testEmail1 = "example@example.com";
        String testEmail2 = "user1234@example.co.uk";
        String testEmail3 = "user_name@example-domain.com";

        assertTrue(EmailValidator.isValidEmail(testEmail1));
        assertTrue(EmailValidator.isValidEmail(testEmail2));
        assertTrue(EmailValidator.isValidEmail(testEmail3));
    }

    @Test
    @DisplayName("Should return false in case of invalid email")
    void shouldReturnFalse_forInvalidEmail() {
        String testEmail1 = "example@example.comcomcom";
        String testEmail2 = "invalid.email@com";
        String testEmail3 = "notatsymbol.com";
        String testEmail4 = "missing@domain";
        String testEmail5 = "nothingafteratsymbol@";

        assertFalse(EmailValidator.isValidEmail(testEmail1), "The email is invalid: " + testEmail1);
        assertFalse(EmailValidator.isValidEmail(testEmail2), "The email is invalid: " + testEmail2);
        assertFalse(EmailValidator.isValidEmail(testEmail3), "The email is invalid: " + testEmail3);
        assertFalse(EmailValidator.isValidEmail(testEmail4), "The email is invalid: " + testEmail4);
        assertFalse(EmailValidator.isValidEmail(testEmail5), "The email is invalid: " + testEmail5);
    }
}