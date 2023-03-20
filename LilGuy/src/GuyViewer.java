import javax.swing.*;

public class GuyViewer
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        frame.setSize(300, 300);
        frame.setTitle("Me");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Guy component = new Guy();
        frame.add(component);

        frame.setVisible(true);
    }
}
