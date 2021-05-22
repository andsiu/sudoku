import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class appHelper extends JFrame {
    private solver sudokuSolver;
    ArrayList<JTextField> bigList = new ArrayList<>();
    private JButton button1 = new JButton("Solve");
    private solver mainProgram = new solver();
    private sudoku sudokuSubject = new sudoku();


    public void buttonPressed() {
        int temp = 0 ;
        int[][] s = sudokuSubject.customBoard;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                String value = bigList.get(temp).getText();
                System.out.println("the value is " + value);
                if (value.equals("") || Integer.parseInt(bigList.get(temp).getText()) > 9) {
                    s[i][j] = 0;
                } else {
                    s[i][j] = Integer.parseInt(bigList.get(temp).getText());
                    System.out.println("running else!");
                }
                temp++;
            }
        }

        sudokuSubject.solve();

        sudokuSubject.display();

    }

    public void preReq(JFrame frame) {
        for (int i = 0; i <= 80; i++) {
            bigList.add(new JTextField(""));
            frame.getContentPane().add(bigList.get(i));
            bigList.get(i).setPreferredSize(new Dimension( 90, 24 ) );
            System.out.println("finished creating jtextfield " + i);
        }
        button1.setPreferredSize(new Dimension(450, 24));
        frame.getContentPane().add(button1);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buttonPressed();
            }
        });


    }

}
