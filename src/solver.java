public class solver {

    public sudoku toSolve = new sudoku();

    public void main (String[] args) {
        toSolve.display();
        if (toSolve.solve()) {
            toSolve.display();
        } else {
            System.out.println("solve failed. need to fix your input");
        }
    }




}
