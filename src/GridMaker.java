import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author VirusFreeNewt
 */
public class GridMaker
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Grid buttonGrid = new Grid(20);
        buttonGrid.horizontalStripes(Color.red, Color.black);
        JFrame gridFrame = new JFrame("grid");
        gridFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gridFrame.getContentPane().add(buttonGrid);
        gridFrame.pack();
        gridFrame.setVisible(true);
    }
}