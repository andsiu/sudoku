import javax.swing.*;
import java.awt.event.ActionEvent;

public class app extends JFrame {
    private JPanel sudokuSolver;
    JTextField[] bigList = new JTextField[81];
    private JTextField a0Text;
    private JTextField a1Text;
    private JTextField a2Text;
    private JTextField a3Text;
    private JTextField a4Text;
    private JTextField a5Text;
    private JTextField a6Text;
    private JTextField a7Text;
    private JTextField a8Text;
    private JTextField b0Text;
    private JTextField b1Text;
    private JTextField c0Text;
    private JTextField d0Text;
    private JTextField e0Text;
    private JTextField f0Text;
    private JTextField g0Text;
    private JTextField h0Text;
    private JTextField i0Text;
    private JTextField c1Text;
    private JTextField d1Text;
    private JTextField e1Text;
    private JTextField f1Text;
    private JTextField g1Text;
    private JTextField h1Text;
    private JTextField i1Text;
    private JTextField b2Text;
    private JTextField b3Text;
    private JTextField c2Text;
    private JTextField c3Text;
    private JTextField d2Text;
    private JTextField d3Text;
    private JTextField e2Text;
    private JTextField e3Text;
    private JTextField f2Text;
    private JTextField f3Text;
    private JTextField g2Text;
    private JTextField g3Text;
    private JTextField h2Text;
    private JTextField i2Text;
    private JTextField h3Text;
    private JTextField i3Text;
    private JTextField b4Text;
    private JTextField c4Text;
    private JTextField d4Text;
    private JTextField e4Text;
    private JTextField f4Text;
    private JTextField g4Text;
    private JTextField h4Text;
    private JTextField i4Text;
    private JTextField b5Text;
    private JTextField c5Text;
    private JTextField d5Text;
    private JTextField e5Text;
    private JTextField f5Text;
    private JTextField g5Text;
    private JTextField h5Text;
    private JTextField i5Text;
    private JTextField b8Text;
    private JTextField c8Text;
    private JTextField d8Text;
    private JTextField e8Text;
    private JTextField f8Text;
    private JTextField g8Text;
    private JTextField h8Text;
    private JTextField i8Text;
    private JTextField i6Text;
    private JTextField i7Text;
    private JTextField h7Text;
    private JTextField g7Text;
    private JTextField f7Text;
    private JTextField e7Text;
    private JTextField d7Text;
    private JTextField c7Text;
    private JTextField b7Text;
    private JTextField b6Text;
    private JTextField c6Text;
    private JTextField d6Text;
    private JTextField e6Text;
    private JTextField f6Text;
    private JTextField g6Text;
    private JTextField h6Text;
    private JButton button1;
    private solver mainProgram = new solver();
    private sudoku sudokuSubject = new sudoku();

    public app(String title) {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(sudokuSolver);
        this.pack();
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("button1")) {
            int[][] s = sudokuSubject.board;
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {

                }
            }

        }
    }

    public static void main(String[] args) {
        JFrame frame = new app("Sudoku Solver");
        frame.setVisible(true);
    }

}
