import javax.swing.*;
import java.awt.*;
import javax.swing.ImageIcon;
public class MyFrame extends JFrame{
    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setTitle("DEMO");
        //this.setLayout(new FlowLayout());
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        ImageIcon first=new ImageIcon("iron throne.png");
    }
}
