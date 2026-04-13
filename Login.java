
package app4;


class Login {
    public boolean checkUserName(String username) {
        return username.contains("_") && username.length() <= 5;
    }

    public boolean checkPasswordComplexity(String password) {
        if (password.length() < 8) return false;

        boolean hasCap = false;
        boolean hasNum = false;
        boolean hasSpec = false;

        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (Character.isUpperCase(c)) hasCap = true;
            else if (Character.isDigit(c)) hasNum = true;
            else if (!Character.isLetterOrDigit(c)) hasSpec = true;
        }

        return hasCap && hasNum && hasSpec;
    }

    public boolean checkCellPhoneNumber(String phone) {
        return phone.startsWith("+27") && phone.substring(3).matches("\\d{9,10}");
    }

    public String registerUser(String user, String pass, String phone) {
        if (!checkUserName(user)) {
            return " Username must contain '_' and be max 5 characters.";
        }
        if (!checkPasswordComplexity(pass)) {
            return "Password must be 8+ chars, include capital, number & special char.";
        }
        if (!checkCellPhoneNumber(phone)) {
            return " Phone must start with +27 and contain valid digits.";
        }
        return " Registration successful!";
    }

    public boolean loginUser(String enteredUser, String enteredPass, User storedUser) {
        return enteredUser.equals(storedUser.getUsername()) &&
               enteredPass.equals(storedUser.getPassword());
    }

    public String returnLoginStatus(boolean isLoggedIn, User user) {
        if (isLoggedIn) {
            return "Welcome " + user.getFirstName() + " " + user.getLastName() + "!";
        } else {
            return " Incorrect username or password. Try again.";
        }
    }
}
