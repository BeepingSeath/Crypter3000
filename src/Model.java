import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Model {
    private String message;
    private String key;
    private String crypt;
    private boolean getCrypt;


    public void setMessage(String input){
        this.message = message;
    }
    public void setKey(String key){
        this.key = key;
    }
    public String getCrypt() {
        return crypt;
    }

    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Write your string");
        String key = JOptionPane.showInputDialog("Enter a key");

        Model cryptModel = new Model();
        cryptModel.setMessage(input);
        cryptModel.setKey(key);
        cryptModel.Encrypt();
        System.out.println(cryptModel.getCrypt);
    }

    public String Encrypt(String input, String key) {
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
        crypt = output;
        return crypt;
    }

    private static int crypt(int x, int y) {
        return x^y;
    }

    public void Encrypt() {

    }
}
