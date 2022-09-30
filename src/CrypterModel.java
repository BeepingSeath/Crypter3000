import javax.swing.*;

public class CrypterModel {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Write your string");
        String key = JOptionPane.showInputDialog("Enter a key");
        int x;
        int y;
        String output = "";

        for (int i = 0; i<input.length(); i++){
            x =  input.charAt(i);
            y =  key.charAt(i);
            int z = x^y;
            char c = (char)z;
            output += c;
        }
        System.out.println(output);

    }

}
