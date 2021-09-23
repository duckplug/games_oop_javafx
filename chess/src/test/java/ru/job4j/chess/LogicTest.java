package ru.job4j.chess;

import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.black.BishopBlack;
import static org.junit.Assert.*;
import static org.hamcrest.Matchers.is;

public class LogicTest {

    @Test
    public void move()
            throws FigureNotFoundException, OccupiedCellException, ImpossibleMoveException {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.A1));
        logic.move(Cell.A1, Cell.C3);
    }

//    public void moveWayBishopBlack()
//            throws FigureNotFoundException, OccupiedCellException, ImpossibleMoveException {
//        Logic logic = new Logic();
//        logic.add(new BishopBlack(Cell.C1));
//        logic.move(Cell.C1, Cell.H6);
//    }
}