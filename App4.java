
package app4;

import java.util.Scanner;


public class App4 {

    
    public static void main(String[] args) {
      

        Scanner sc = new Scanner(System.in);
        Login rudy = new Login();

        String fName, lName, username, password, phone;
        String message;

        //  REGISTRATION LOOP
        while (true) {
            System.out.println("\n--- REGISTRATION ---");

            System.out.print("First Name: ");
            fName = sc.next();

            System.out.print("Last Name: ");
            lName = sc.next();

            System.out.print("Username: ");
            username = sc.next();

            System.out.print("Password: ");
            password = sc.next();

            System.out.print("Phone (+27...): ");
            phone = sc.next();

            message = rudy.registerUser(username, password, phone);
            System.out.println(message);

            // Break only if successful
            if (message.equals(" Registration successful!")) {
                break;
            }

            System.out.println("Please try registering again...\n");
        }

        // Create user after successful registration
        User newUser = new User(username, password, fName, lName);

        // LOGIN LOOP
        boolean loggedIn = false;

        while (!loggedIn) {
            System.out.println("\n--- LOGIN ---");

            System.out.print("Enter Username: ");
            String logUser = sc.next();

            System.out.print("Enter Password: ");
            String logPass = sc.next();

            loggedIn = rudy.loginUser(logUser, logPass, newUser);

            System.out.println(rudy.returnLoginStatus(loggedIn, newUser));
        }

        System.out.println("Access Granted!");
    }
}
    
    

