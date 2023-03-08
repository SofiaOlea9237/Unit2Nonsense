import javax.swing.*;
import java.awt.*;

public class Rectangles extends JComponent
{
    protected void paintComponent(Graphics g)
    {
        Graphics2D x = (Graphics2D) g;
        java.awt.Rectangle box = new java.awt.Rectangle(5, 10, 20, 30);
        x.draw(box);
        x.translate(25,25);
        x.draw(box);
    }
}
