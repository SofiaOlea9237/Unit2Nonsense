import javax.swing.*;

public class RectanglesViewer
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        frame.setSize(300, 300);
        frame.setTitle("Rectangles");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        Rectangles component = new Rectangles();
        frame.add(component);

        frame.setVisible(true);
    }
}
