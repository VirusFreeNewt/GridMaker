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
        if(args.length > 0)
        {
            switch (args[0])
            {
                case "verticalStripes":
                    buttonGrid.verticalStripes(Color.red, Color.black);
                    break;
                case "horizontalStripes":
                    buttonGrid.horizontalStripes(Color.red, Color.black);
                    break;
                case "stairsLeft":
                    buttonGrid.stairsLeft(Color.red, Color.black);
                    break;
                case "stairsRight":
                    buttonGrid.stairsRight(Color.red, Color.black);
                    break;
                case "checkers":
                    buttonGrid.checkers(Color.red, Color.black);
                    break;
                case "random":
                    buttonGrid.random(Color.red, Color.black);
                    System.out.println(Grid.getEvaluateColor(Color.red));
                    break;
                default:
                    buttonGrid.colorAll(Color.black);
                    break;
            }
        }
        else
        {
            buttonGrid.colorAll(Color.red);
        }
        JFrame gridFrame = new JFrame("grid");
        gridFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gridFrame.getContentPane().add(buttonGrid);
        gridFrame.pack();
        gridFrame.setVisible(true);
    }
}