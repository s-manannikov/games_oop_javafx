package ru.job4j.chess;

import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.black.BishopBlack;
import ru.job4j.chess.firuges.black.PawnBlack;

public class LogicTest {

    @Test
    public void whenOccupied() throws FigureNotFoundException, ImpossibleMoveException {
        try {
            Logic logic1 = new Logic();
            Logic logic2 = new Logic();
            logic1.add(new BishopBlack(Cell.C8));
            logic2.add(new PawnBlack(Cell.D7));
            logic1.move(Cell.C8, Cell.G4);
        } catch (OccupiedCellException oc) {
        }
    }

    @Test
    public void whenImpossibleMove() throws FigureNotFoundException, OccupiedCellException {
        try {
            Logic logic = new Logic();
            BishopBlack bishop = new BishopBlack(Cell.C8);
            logic.add(bishop);
            logic.move(Cell.C8, Cell.C5);
        } catch (ImpossibleMoveException im) {
        }
    }

    @Test
    public void whenFigureNotFound() throws OccupiedCellException, ImpossibleMoveException {
        try {
            Logic logic = new Logic();
            logic.move(Cell.C8, Cell.G4);
        } catch (FigureNotFoundException fn) {
        }
    }
}