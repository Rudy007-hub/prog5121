package chat;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LoginTest {

    // ================= USERNAME SUCCESS =================
    @Test
    public void testCheckUserNameSuccess() {

        Login login = new Login();

        boolean result = login.checkUserName("kyl_1");

        assertTrue(result);
    }

    // ================= USERNAME FAILURE =================
    @Test
    public void testCheckUserNameFailure() {

        Login login = new Login();

        boolean result = login.checkUserName("kyle!!!!!!");

        assertFalse(result);
    }

    // ================= PASSWORD SUCCESS =================
    @Test
    public void testCheckPasswordComplexitySuccess() {

        Login login = new Login();

        boolean result = login.checkPasswordComplexity("Ch&&sec@ke99!");

        assertTrue(result);
    }

    // ================= PASSWORD FAILURE =================
    @Test
    public void testCheckPasswordComplexityFailure() {

        Login login = new Login();

        boolean result = login.checkPasswordComplexity("password");

        assertFalse(result);
    }

    // ================= CELL NUMBER SUCCESS =================
    @Test
    public void testCheckCellPhoneNumberSuccess() {

        Login login = new Login();

        boolean result = login.equals("+27838968976");

        assertTrue(result);
    }

    // ================= CELL NUMBER FAILURE =================
    @Test
    public void testCheckCellPhoneNumberFailure() {

        Login login = new Login();

        boolean result = login.equals("08966553");

        assertFalse(result);
    }

    // ================= REGISTER USER SUCCESS =================
    @Test
    public void testRegisterUserSuccess() {

        Login login = new Login();

        String expected =
        "Username and Password successfully captured.";

        String actual = login.registerUser(
                "kyl_1",
                "Ch&&sec@ke99!",
                "+27838968976",
                "Kyle",
                "Smith"
        );

        assertEquals(expected, actual);
    }

    // ================= LOGIN SUCCESS =================
    @Test
    public void testLoginUserSuccess() {

        Login login = new Login();

        login.registerUser(
                "kyl_1",
                "Ch&&sec@ke99!",
                "+27838968976",
                "Kyle",
                "Smith"
        );

        boolean result = login.loginUser(
                "kyl_1",
                "Ch&&sec@ke99!"
        );

        assertTrue(result);
    }

    // ================= LOGIN FAILURE =================
    @Test
    public void testLoginUserFailure() {

        Login login = new Login();

        login.registerUser(
                "kyl_1",
                "Ch&&sec@ke99!",
                "+27838968976",
                "Kyle",
                "Smith"
        );

        boolean result = login.loginUser(
                "wrong",
                "wrong"
        );

        assertFalse(result);
    }

    // ================= LOGIN STATUS =================
    @Test
    public void testReturnLoginStatus() {

        Login login = new Login();

        login.registerUser(
                "kyl_1",
                "Ch&&sec@ke99!",
                "+27838968976",
                "Kyle",
                "Smith"
        );

        String expected =
        "Welcome Kyle Smith, it is great to see you again.";

        String actual = login.returnLoginStatus(true);

        assertEquals(expected, actual);
    }
}