import java.awt.*;

public class RectangleWithColor
{
    public void paintComponent(Graphics g)
    {
        // Recover Graphics2D
        Graphics2D variable = (Graphics2D) g;

        // Construct a rectangle and draw it
        java.awt.Rectangle box = new java.awt.Rectangle(5, 10, 20, 30);
        variable.draw(box);


    }
}
