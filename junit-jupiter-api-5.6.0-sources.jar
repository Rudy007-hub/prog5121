package chat;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MessageTest {

    // ================= MESSAGE LENGTH SUCCESS =================
    @Test
    public void testMessageLengthSuccess() {

        Message msg = new Message(
                0,
                "+27718693002",
                "Hi Mike, can you join us for dinner tonight?"
        );

        String expected = "Message ready to send.";

        boolean actual = msg.equals("message length");

        assertEquals();
    }

    // ================= MESSAGE LENGTH FAILURE =================
    @Test
    public void testMessageLengthFailure() {

        String longMessage =
        "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";

        Message msg = new Message(
                0,
                "+27718693002",
                longMessage
        );

        boolean actual = msg.equals("message length");
        
        
        
        assertEquals();
        
    }

    // ================= RECIPIENT SUCCESS =================
    @Test
    public void testRecipientSuccess() {

        Message msg = new Message(
                0,
                "+27718693002",
                "Hello"
        );

        String expected =
        "Cell phone number successfully captured.";

        boolean actual = msg.equals(msg);

        assertEquals();
    }

    // ================= RECIPIENT FAILURE =================
    @Test
    public void testRecipientFailure() {

        Message msg = new Message(
                0,
                "08575975889",
                "Hello"
        );

        String expected =
        "Cell phone number is incorrectly formatted or does not contain an international code.";

       boolean actual = msg.equals(msg);

        assertEquals();
    }

    // ================= MESSAGE HASH =================
    @Test
    public void testMessageHash() {

        Message msg = new Message(
                0,
                "+27718693002",
                "Hi Mike, can you join us for dinner tonight?"
        );

        
    }

    // ================= MESSAGE ID =================
    @Test
    public void testMessageIDCreated() {

        Message msg = new Message(
                0,
                "+27718693002",
                "Hello"
        );

        String actual = msg.generateMessageID();

       
    }

    // ================= SEND MESSAGE =================
    @Test
    public void testSendMessageOption() {

        Message msg = new Message(
                0,
                "+27718693002",
                "Hello"
        );

        String expected = "Message successfully sent.";

    

       
    }

    // ================= DISCARD MESSAGE =================
    @Test
    public void testDiscardMessageOption() {

        Message msg = new Message(
                0,
                "+27718693002",
                "Hello"
        );

        String expected = "Press 0 to delete the message.";

        
    }

    // ================= STORE MESSAGE =================
    @Test
    public void testStoreMessageOption() {

        Message msg = new Message(
                0,
                "+27718693002",
                "Hello"
        );

        String expected = "Message successfully stored.";

        
    }

    private void assertEquals() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}