import javax.swing.*;
public class MPS
{
    public static void main(String[] args)
    {
        double seconds =Double.parseDouble(JOptionPane.showInputDialog("How long did it take you to " +
                "arrive to your destination? (in seconds)"));
        double meters = Double.parseDouble(JOptionPane.showInputDialog("What distance did " +
                "you traveled (in meters)"));
        double mps = meters/seconds;
        System.out.print("You traveled at a velocity of: ");
        System.out.print(mps);
        System.out.println(" m/s");
    }
}
