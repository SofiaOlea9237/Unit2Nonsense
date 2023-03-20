import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;

public class Guy extends JComponent
{
    public void paintComponent(Graphics g)
    {
        // Recover Graphics2D
        Graphics2D g2 = (Graphics2D) g;

        // Draw the face
        Ellipse2D.Double Face = new Ellipse2D.Double(50, 50, 80, 60);
        g2.draw(Face);

        //Draw the silly eyes
        Ellipse2D.Double LEye = new Ellipse2D.Double(50, 65, 40, 30);
        g2.draw(LEye);
        Ellipse2D.Double REye = new Ellipse2D.Double(90, 65, 40, 30);
        g2.draw(REye);

        //Now the pupils
        g2.setColor(Color.BLACK);
        Ellipse2D.Double LPupil = new Ellipse2D.Double(60, 72.5, 20, 15);
        g2.fill(LPupil);
        g2.setColor(Color.BLACK);
        Ellipse2D.Double RPupil = new Ellipse2D.Double(100, 72.5, 20, 15);
        g2.fill(RPupil);

        //The body
        Line2D.Double LBody = new Line2D.Double(65, 105, 60, 150);
        g2.draw(LBody);
        Line2D.Double RBody = new Line2D.Double(115, 105, 120, 150);
        g2.draw(RBody);

        //And I'll do the bottom part of the body too
        Line2D.Double Bottom = new Line2D.Double(60, 150, 120, 150);
        g2.draw(Bottom);

        //Lil hand
        Ellipse2D.Double Hand = new Ellipse2D.Double(150, 70, 25, 25);
        g2.draw(Hand);

        //Some dialogue for the guy
        g2.drawString("Hello!", 75, 175);
    }
}
