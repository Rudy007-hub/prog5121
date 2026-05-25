
package chat;


class Login {
  

    public boolean checkUserName(String username) {

        return username.matches("(?=.{1,5}$).*_.*");
    }

    public boolean checkPasswordComplexity(String password) {

        return password.matches("^(?=.*[A-Z])(?=.*\\d)(?=.*[^a-zA-Z0-9]).{8,}$");
    }

    public String registerUser(String username, String password, String string, String kyle, String smith) {

        if (!checkUserName(username)) {

            return "Username is not correctly formatted; please ensure that your username contains an underscore and is no more than five characters in length.";

        } else if (!checkPasswordComplexity(password)) {

            return "Password is not correctly formatted; please ensure that the password contains at least eight characters, a capital letter, a number, and a special character.";

        }

        return "Username and Password successfully captured.";
    }

    public boolean loginUser(String storedUser, String storedPass,
                             String enteredUser, String enteredPass) {

        return storedUser.equals(enteredUser)
                && storedPass.equals(enteredPass);
    }
}

