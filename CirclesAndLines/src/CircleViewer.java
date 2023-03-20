import javax.swing.*;

public class CircleViewer
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        frame.setSize(300, 300);
        frame.setTitle("Just a circle");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Circle component = new Circle();
        frame.add(component);

        frame.setVisible(true);
    }
}

