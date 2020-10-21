package ru.job4j.chess.firuges.black;

import ru.job4j.chess.firuges.Cell;
import junit.framework.TestCase;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;


public class BishopBlackTest extends TestCase {

    public void testPosition() {
        BishopBlack bishop = new BishopBlack(Cell.C8);
        assertThat(bishop.position(), is(Cell.C8));
    }

    public void testCopy() {
        BishopBlack bishop = new BishopBlack(Cell.C8);
        assertThat(bishop.copy(Cell.E6).position(), is(Cell.E6));
    }

    public void testWay() {
        BishopBlack bishop = new BishopBlack(Cell.C1);
        assertThat(bishop.way(Cell.G5), is(new Cell[]{Cell.D2, Cell.E3, Cell.F4, Cell.G5}));
    }

    public void testDiagonal() {
        try {
            BishopBlack bishop = new BishopBlack(Cell.C8);
            bishop.way(Cell.C5);
        } catch (IllegalStateException ex) {
            assertThat(ex.getMessage(), is("Could not move by diagonal from C8 to C5"));
        }
    }
}