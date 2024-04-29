import javax.swing.*;
import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    public static void main(String[] args){
        JFrame fr=new JFrame("My Window is thois");
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setSize(500,500);
        fr.setLocationRelativeTo(null);
        fr.setVisible(true);
        fr.setResizable(false);

        JLabel img=new JLabel();
        img.setIcon(new ImageIcon("C:\\Users\\Arian\\Desktop\\Crwon-Combat\\back.jpg"));
        fr.add(img);


    }

//        while (true){
//            sampleTimer();
//            timer.start();
//            if(second%2==0){
//                System.out.println("Now time is Even");
//            }
//            else {
//                System.out.println("Now is odd");
//            }
//        }


//    public void sampleTimer(){
//        timer = new Timer(1000 , new ActionListener(){
//            @Override
//            public void actionPerformed(ActionEvent e){
//                second++;
//            }
//        })
//    ;};
}
