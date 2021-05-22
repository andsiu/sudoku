import javax.swing.*;
import java.awt.*;

public class app extends JFrame {
    static appHelper appHelp = new appHelper();

    public static void main(String[] args) {

        JFrame frame = new JFrame("Sudoku Solver");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600,400);
        frame.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
        //frame.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
        frame.setResizable(false);
        appHelp.preReq(frame);
        frame.setVisible(true);


    }

}
