import javax.swing.*;
import java.awt.*;

public class SnakeGame extends JFrame {
    JFrame frame;
    SnakeGame(){
        frame = new JFrame("Snake Game");
        frame.setBounds(10,10,905,700);
        Gamepanel panel = new Gamepanel();
        panel.setBounds(10,10,905,700);
        panel.setBackground(Color.gray);
        frame.add(panel);
      //  frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    public static void main(String arg[]){
        SnakeGame snake = new SnakeGame();
    }
}
