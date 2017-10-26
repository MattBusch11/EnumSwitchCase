import javax.swing.*;

public class EnumSwitchCase {
/**
Author: Matt Busch
Date: 10/26/17
Purpose: To run an enum Switch Case loop 
*/
    public enum Month {January, February, March, April, May, June, July, August, September, October, November, December}
    public static void main(String [] args) {
/**
Purpose: To prompt the user to select a month from the drop down list and keep selecting until they hit the cancel button
*/
        Month[] choices = {Month.January, Month.February, Month.March, Month.April, Month.May, Month.June, Month.July, Month.August, Month.September, Month.October, Month.November, Month.December};
        Month select = (Month) JOptionPane.showInputDialog(null, "Select a month.", "Month", JOptionPane.INFORMATION_MESSAGE, null, choices, choices[11]);
        while (select!=null) {
            switch (select) {
                case January:
                    JOptionPane.showMessageDialog(null, "Do you want to build a snowman?");
                    break;
                case February:
                    JOptionPane.showMessageDialog(null, "Do you want to build a snowman?");
                    break;
                case March:
                    JOptionPane.showMessageDialog(null, "Happy Spring Days!");
                    break;
                case April:
                    JOptionPane.showMessageDialog(null, "Happy Spring Days!");
                    break;
                case May:
                    JOptionPane.showMessageDialog(null, "Happy Spring Days!");
                    break;
                case June:
                    JOptionPane.showMessageDialog(null, "It's summer time!");
                    break;
                case July:
                    JOptionPane.showMessageDialog(null, "It's summer time!");
                    break;
                case August:
                    JOptionPane.showMessageDialog(null, "It's summer time!");
                    break;
                case September:
                    JOptionPane.showMessageDialog(null, "Welcome to the foliage season!");
                    break;
                case October:
                    JOptionPane.showMessageDialog(null, "Welcome to the foliage season!");
                    break;
                case November:
                    JOptionPane.showMessageDialog(null, "Welcome to the foliage season!");
                    break;
                case December:
                    JOptionPane.showMessageDialog(null, "Do you want to build a snowman?");
                    break;
            }
            select = (Month) JOptionPane.showInputDialog(null, "Select a month.", "Month", JOptionPane.INFORMATION_MESSAGE, null, choices, choices[11]);
        }
    }

}
