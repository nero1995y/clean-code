package chapter02;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

    }

    //bad code
    public static List<int[]> getThem() {
        List<int[]> list1 = new ArrayList<int[]>();
        for (int[] x : theList)
            if (x[0] == 4)
                list1.add(x);

        return list1;
    }


    public static List<int[]> getFlaggedCells() {
        List<int[]> flaggedCells = new ArrayList<int[]>();
        for (int[] cell : gameBorad)
            if (cell[STATUS_VALUE] == FLAGGED)
                flaggedCells.add(cell);

        return flaggedCells;
    }

    //batter code
    public static List<Cell> getFlaggedCells() {
        List<Cell> flaggedCells = new ArrayList<Cell>();
        for (Cell cell : gameBorad)
            if (cell.isFlagged())
                flaggedCells.add(cell);

        return flaggedCells;
    }

    static class Cell {
        boolean isFlagged;
        public boolean isFlagged() {
            return isFlagged;
        }
    }
}