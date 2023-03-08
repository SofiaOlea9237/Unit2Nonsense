import javax.swing.*;

public class RectangleWithColorViewer
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        frame.setSize(300, 300);
        frame.setTitle("Rectangle");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        RectangleWithColor component = new RectangleWithColor();
        frame.add(component);

        frame.setVisible(true);
    }
}
