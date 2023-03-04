package week6;

public class Password {

    public static boolean isValidPassword(String password) {
        if (password.length() < 6 || password.contains(" ")) {
            return false;
        }
        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasSpecial = false;
        boolean hasDigit = false;
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (Character.isUpperCase(c)) {
                hasUpper = true;
            } else if (Character.isLowerCase(c)) {
                hasLower = true;
            } else if (Character.isDigit(c)) {
                hasDigit = true;
            } else if (!Character.isLetterOrDigit(c)) {
                hasSpecial = true;
            }
        }
        return hasUpper && hasLower && hasSpecial && hasDigit;
    }


    public static void main(String[] args) {
        System.out.println("isValidPassword(\"!qwerty@123ABC\") = " + isValidPassword("!qwerty@123ABC"));
    }
}
