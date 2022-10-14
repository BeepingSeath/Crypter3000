import javax.swing.*;

public class CrypterModel {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Write your string");
        String key = JOptionPane.showInputDialog("Enter a key");
        String output = Encrypt(input, key);
        JOptionPane.showMessageDialog(null,output);
        System.out.println(output);

    }

    private static String Encrypt(String input, String key) {
        int x;
        int y;
        String output = "";

        for (int i = 0; i< input.length(); i++){
            x =  input.charAt(i);
            y =  key.charAt(i);
            int z = crypt(x, y);
            char c = (char)z;
            output += c;
        }
        return output;
    }

    private static int crypt(int x, int y) {
        int z = x ^ y;
        return z;
    }

}
