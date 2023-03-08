import javax.swing.*;

public class RectangleViewer
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        frame.setSize(300, 300);
        frame.setTitle("Rectangle");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        Rectangle component = new Rectangle();
        frame.add(component);

        frame.setVisible(true);
    }
}
