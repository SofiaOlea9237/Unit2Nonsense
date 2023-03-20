import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;

public class Line extends JComponent
{
        public void paintComponent(Graphics g)
        {
            // Recover Graphics2D
            Graphics2D g2 = (Graphics2D) g;

            // Draw the line
            Line2D.Double Stick = new Line2D.Double(10, 10, 10, 50);
            g2.draw(Stick);

            //Now a diagonal line
            Line2D.Double DiagonalStick = new Line2D.Double(20, 20, 60, 60);
            g2.draw(DiagonalStick);
        }
}
