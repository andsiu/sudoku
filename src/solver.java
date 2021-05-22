public class solver {

    public void runSolve (String[] args, sudoku s) {
        s.display();
        if (s.solve()) {
            s.display();
        } else {
            System.out.println("solve failed. need to fix your input");
        }
    }




}
