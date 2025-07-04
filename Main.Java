// SEBASTIAN_CARRASCO
// Lab #0

import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class Main {

    public static void main(String[] args) {
        String name, strOutput, msgTitle;
        int num1, num2, sum;

        Scanner scanner = new Scanner(System.in);

        name = JOptionPane.showInputDialog("What is your full name?");

        // JOptionPane.showInputDialog returns a string; we need to convert it to a number before storing in int
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Enter first number"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Enter second number"));

        sum = num1 + num2;
        msgTitle = "Java program by " + name + "!";
        strOutput = "The sum of " + num1 + " and " + num2 + " is " + sum;

        // outputs to a console
        System.out.println(msgTitle + "\n" + strOutput);

        ImageIcon icon = new ImageIcon("src/JavaLogo.jpg");
        JOptionPane.showMessageDialog(null, strOutput, msgTitle,
                JOptionPane.INFORMATION_MESSAGE, icon);

        // showConfirmDialog() will bring up a dialog with the options Yes and No
        int result = JOptionPane.showConfirmDialog(null, "Are you ready to exit?", "Exit",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);

        strOutput = "You selected: ";

        // switch statement - corrected with proper break statements
        switch (result) {
            case JOptionPane.YES_OPTION:
                strOutput += "YES";
                break;
            case JOptionPane.NO_OPTION:
                strOutput += "NO";
                break;
            default:
                strOutput += "UNKNOWN";
                break;
        }
        
        strOutput += "\nI am going to exit anyway :) ";

        System.out.println(strOutput);
        scanner.close();
    }
}

/*
Console Output:

Java program by Sebastian Carrasco!
The sum of 15 and 25 is 40
You selected: YES
I am going to exit anyway :) 

*/
