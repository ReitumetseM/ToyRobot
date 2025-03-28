import org.junit.jupiter.api.Test;
import za.co.wethinkcode.examples.toyrobot.Position;

import static org.junit.Assert.assertEquals;

public class PositionTest{
    @Test
    public void shouldKnowXandY() {
        Position p = new Position(10, 20);
        assertEquals(10, p.getX());
        assertEquals(20, p.getY());
    }
}