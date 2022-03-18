import Cracker.CrackerImpl;
import Exceptions.CannotCrackException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * @project: Password cracker.
 * @author: mcr99 on 18/03/2022.
 */
public class PasswordWithFailureTest implements TestsWithFailureInterface {
    CrackerImpl crack;
    CrackerImpl crack2;

    @Override
    @BeforeEach
    public void setup() {
        crack = new CrackerImpl("123aA#·");
        crack2 = new CrackerImpl("");
    }

    @Override
    @Test
    public void crackerBFailure() {
        assertThrows(CannotCrackException.class,
                () -> crack.crackerB());
        assertThrows(CannotCrackException.class,
                () -> crack2.crackerB());
    }
}
