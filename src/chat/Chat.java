
package chat;

import java.util.ArrayList;
import java.util.Scanner;


public class Chat {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Login user = new Login();
        Message msg = new Message(0, "+27718693002", "Hi Mike, can you join us for dinner tonight?");

        ArrayList<String> sentMessages = new ArrayList<>();

        String firstName;
        String lastName;
        String username = "";
        String password = "";

        System.out.println("===== QUICKCHAT REGISTRATION =====");

        System.out.print("Enter First Name: ");
        firstName = input.nextLine();

        System.out.print("Enter Last Name: ");
        lastName = input.nextLine();

        String registrationMessage;

        do {
            System.out.print("Enter Username: ");
            username = input.nextLine();

            System.out.print("Enter Password: ");
            password = input.nextLine();

            registrationMessage = user.registerUser(username, password, "+27838968976", "Kyle", "Smith");

            System.out.println(registrationMessage);

        } while (!registrationMessage.equals("Username and Password successfully captured."));

        boolean loggedIn = false;

        while (!loggedIn) {

            System.out.println("\n===== LOGIN =====");

            System.out.print("Username: ");
            String enteredUser = input.nextLine();

            System.out.print("Password: ");
            String enteredPass = input.nextLine();

            if (user.loginUser(username, password, enteredUser, enteredPass)) {

                System.out.println("\nWelcome " + firstName + " " + lastName + ", it is great to see you again.");

                loggedIn = true;

            } else {

                System.out.println("Username or password incorrect.");
            }
        }

        int choice = 0;
        int totalSent = 0;

        while (choice != 3) {

            System.out.println("\n===== MENU =====");
            System.out.println("1) Send Messages");
            System.out.println("2) Show recently sent messages");
            System.out.println("3) Quit");

            System.out.print("Choose option: ");
            choice = input.nextInt();
            input.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("How many messages do you wish to enter? ");
                    int numMessages = input.nextInt();
                    input.nextLine();

                    for (int i = 0; i < numMessages; i++) {

                        String messageID = msg.generateMessageID();

                        System.out.print("\nEnter Recipient Number (+27...): ");
                        String recipient = input.nextLine();

                        System.out.println(msg.checkRecipientCell(recipient));

                        if (!recipient.matches("\\+27\\d{9}")) {
                            continue;
                        }

                        System.out.print("Enter Message: ");
                        String messageText = input.nextLine();

                        if (messageText.length() > 250) {
                            System.out.println("Message exceeds 250 characters.");
                            continue;
                        }

                        String hash = msg.createMessageHash(messageID, i + 1, messageText);

                        System.out.println("\n1) Send");
                        System.out.println("2) Disregard");
                        System.out.println("3) Store");

                        System.out.print("Choose option: ");
                        int action = input.nextInt();
                        input.nextLine();

                        switch (action) {

                            case 1:

                                totalSent++;

                                String details = "\n===== MESSAGE DETAILS ====="
                                        + "\nMessage ID: " + messageID
                                        + "\nMessage Hash: " + hash
                                        + "\nRecipient: " + recipient
                                        + "\nMessage: " + messageText;

                                System.out.println(details);

                                sentMessages.add(details);

                                System.out.println("Message successfully sent.");

                                break;

                            case 2:

                                System.out.println("Message disregarded.");
                                break;

                            case 3:

                                msg.saveMessageToJSON(messageID, hash, recipient, messageText);

                                System.out.println("Message successfully stored in JSON.");

                                break;
                        }
                    }

                    System.out.println("\nTotal messages sent: " + totalSent);

                    break;

                case 2:

                    if (sentMessages.isEmpty()) {

                        System.out.println("No messages sent yet.");

                    } else {

                        for (String m : sentMessages) {
                            System.out.println(m);
                        }
                    }

                    break;

                case 3:

                    System.out.println("Thank you for using QuickChat.");
                    break;
            }
        }
    }
}