import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;

public class Circle extends JComponent
{
    public void paintComponent(Graphics g)
    {
        // Recover Graphics2D
        Graphics2D g2 = (Graphics2D) g;

        // Draw the circle
        Ellipse2D.Double Ball = new Ellipse2D.Double(20, 20, 100, 100);
        g2.draw(Ball);
    }
}
