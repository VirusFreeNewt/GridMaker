import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author VirusFreeNewt
 */
public class Grid extends JPanel
{
    private JButton[][] tiles;

    public Grid(int dimensions)
    {
        tiles = new JButton[dimensions][dimensions];
        setLayout(new GridLayout(dimensions, dimensions));
        setPreferredSize(new Dimension(500,500));

        for(int row = 0; row < tiles.length; ++row)
        {
            for(int col = 0; col < tiles[row].length; ++col)
            {
                tiles[row][col] = new JButton();
                add(tiles[row][col]);
            }
        }
    }
    public void colorAll(Color c)
    {
        for(JButton[] row : tiles)
        {
            for(JButton col : row)
            {
                col.setBackground(c);
            }
        }
    }
    public void verticalStripes(Color c1, Color c2)
    {
        for(JButton[] row : tiles)
        {
            for(int col = 0; col < row.length; ++col)
            {
                row[col].setBackground((col % 2 == 0) ? c1 : c2);
            }
        }
    }
    public void horizontalStripes(Color c1, Color c2)
    {
        for(int row = 0; row < tiles.length; ++row)
        {
            for(int col = 0; col < tiles[row].length; ++col)
            {
                tiles[row][col].setBackground((row % 2 == 0) ? c1 : c2);
            }
        }
    }
    public void stairsLeft(Color c1, Color c2)
    {
        colorAll(c1);
        for(int row = 0; row < tiles.length; ++row)
        {
            for(int col = 0; col < row; ++col)
            {
                tiles[row][col].setBackground(c2);
            }
        }
    }
    public void stairsRight(Color c1, Color c2)
    {
        colorAll(c1);
        for(int row = 0; row < tiles.length; ++row)
        {
            for(int col = tiles[row].length - 1; col > tiles[row].length - row - 1; --col)
            {
                tiles[row][col].setBackground(c2);
            }
        }
    }
    public void checkers(Color c1, Color c2)
    {
        boolean checker = true;
        for(JButton[] row : tiles)
        {
            for(JButton col : row)
            {
                col.setBackground(checker ? c1 : c2);
                checker = !checker;
            }
            checker = !checker;
        }
    }
}