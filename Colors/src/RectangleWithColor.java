import javax.swing.*;
import java.awt.*;

public class RectangleWithColor extends JComponent
{
    public void paintComponent(Graphics g)
    {
        // Recover Graphics2D
        Graphics2D g2 = (Graphics2D) g;

        // Construct a rectangle and draw it
        g2.setColor(Color.GREEN);
        java.awt.Rectangle Box = new java.awt.Rectangle(30, 30, 40, 50);
        g2.draw(Box);

        //Now same thing but filling the rectangle
        g2.setColor(Color.GREEN);
        java.awt.Rectangle FullBox = new java.awt.Rectangle(100, 30, 40, 50);
        g2.fill(FullBox);


    }
}
