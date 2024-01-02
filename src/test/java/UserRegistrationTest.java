import com.day21.InvalidUserDetailsException;
import com.day21.UserRegistration;

public class UserRegistrationTest {
    public static void main(String[] args) {
        UserRegistration userRegistration = new UserRegistration();

        try {
            userRegistration.validateFirstName("John");
            userRegistration.validateLastName("Doe");
            userRegistration.validateEmail("john.doe@example.com");
            userRegistration.validateMobile("91 9919819801");
            userRegistration.validatePassword("Pass@word1");
            System.out.println("Happy Test Cases Passed!");
        } catch (InvalidUserDetailsException e) {
            System.out.println("Happy Test Cases Failed: " + e.getMessage());
        }

        try {
            userRegistration.validateFirstName("jo");
            userRegistration.validateLastName("doe");
            userRegistration.validateEmail("invalid-email");
            userRegistration.validateMobile("1234567890");
            userRegistration.validatePassword("password");
            System.out.println("Sad Test Cases Passed!");
        } catch (InvalidUserDetailsException e) {
            System.out.println("Sad Test Cases Failed: " + e.getMessage());
        }
    }
}
