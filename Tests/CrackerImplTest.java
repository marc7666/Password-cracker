import Cracker.CrackerImpl;
import Exceptions.CannotCrackException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @project: Password cracker.
 * @author: mcr99 on 18/03/2022.
 */
public class CrackerImplTest implements TestsWithoutFailureInterface {
    CrackerImpl crack;
    CrackerImpl crack2;

    @Override
    @BeforeEach
    public void setup() {
        crack = new CrackerImpl("12aA");
        crack2 = new CrackerImpl("23Marc");
    }

    @Override
    @Test
    public void crackerTest() throws CannotCrackException {
        String crackedS = crack.cracker();
        assertEquals(crack.password, crackedS);
        String crackedS2 = crack2.cracker();
        assertEquals(crack2.password, crackedS2);
    }
}
