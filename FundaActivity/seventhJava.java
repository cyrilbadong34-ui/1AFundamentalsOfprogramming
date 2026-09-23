import javax.swing.JOptionPane;
public class seventhJava {
    public static void main(String[] args) {
        String name = "";
        name = JOptionPane.showInputDialog("Please Enter your name");

        String msg = "Hello " + name + "!";
        JOptionPane.showMessageDialog(null, msg);
    }
}