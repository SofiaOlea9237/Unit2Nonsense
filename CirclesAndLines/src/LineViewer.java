import javax.swing.*;
import java.awt.*;
import java.awt.geom.Line2D;

public class LineViewer
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        frame.setSize(300, 300);
        frame.setTitle("Just lines");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Line component = new Line();
        frame.add(component);

        frame.setVisible(true);
    }
}
