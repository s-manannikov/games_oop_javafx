package ru.job4j.chess;

import org.junit.Ignore;
import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;
import ru.job4j.chess.firuges.black.BishopBlack;
import ru.job4j.chess.firuges.black.PawnBlack;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class LogicTest {

    @Test
    public void whenMove() throws FigureNotFoundException, OccupiedCellException, ImpossibleMoveException {
        Logic logic1 = new Logic();
        Logic logic2 = new Logic();
        BishopBlack bishop = new BishopBlack(Cell.C8);
        logic1.add(bishop);
        logic2.add(new PawnBlack(Cell.D7));
        logic2.move(Cell.D7, Cell.D6);
        logic1.move(Cell.C8, Cell.G4);
        assertThat(bishop.position(), is(Cell.G4));
    }
}