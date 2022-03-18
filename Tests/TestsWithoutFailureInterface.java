import Exceptions.CannotCrackException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @project: Password cracker.
 * @author: mcr99 on 18/03/2022.
 */
public interface TestsWithoutFailureInterface {
    @BeforeEach
    void setup();

    @Test
    void crackerTest() throws CannotCrackException;
}
