package weekThree;
import javax.swing.JOptionPane;

public class Login {
    public static void main(String[] args) {
        String userName = "myUsername";
        String password = "myPassword";
        String name = JOptionPane.showInputDialog("Enter your username:");
        String pw = JOptionPane.showInputDialog("Enter your password:");
        if (userName.equals(name) && password.equals(pw)) {
            JOptionPane.showMessageDialog(null, "Welcome to CS121.");
        } else if (userName.equals(name)) {
            JOptionPane.showMessageDialog(null, "Password is incorrect.");
        } else if (password.equals(pw)) {
            JOptionPane.showMessageDialog(null, "Username is incorrect.");
        } else {
            JOptionPane.showMessageDialog(null, "Both username and password are incorrect.");
        }
    }
}

