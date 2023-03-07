import javax.swing.*;
public class CubeVolume
{
    public static void main(String[] args)
    {
        double length = Double.parseDouble(JOptionPane.showInputDialog("Side length (in cm)"));
        double volume = (length*length*length);
        System.out.println("The volume of the cube is: ");
        System.out.print(volume);
        System.out.println(" cm^3");
        System.out.println("------------------------------");
        System.out.print("(");
        System.out.print(volume/100);
        System.out.print(" m^3");
        System.out.println(")");
    }
}
