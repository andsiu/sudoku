public class solver {

    public void runSolve (sudoku s) {
        s.display();
        if (s.solve()) {
            s.display();
        } else {
            System.out.println("solve failed. need to fix your input");
        }
    }




}
