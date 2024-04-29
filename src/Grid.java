
import java.awt.*;
import java.util.jar.JarEntry;
import javax.swing.*;
public class Grid extends JFrame{
    Grid(){
        JFrame fr=new JFrame("My Window");
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setSize(1000,500);
        fr.setLocationRelativeTo(null);
        fr.setVisible(true);
        fr.setResizable(false);

        JLabel img=new JLabel();
        img.setIcon(new ImageIcon("swrd.jpg"));
        fr.add(img);

    }
}
