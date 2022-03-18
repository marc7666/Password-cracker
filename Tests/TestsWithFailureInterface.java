/**
 * @project: Password cracker.
 * @author: mcr99 on 18/03/2022.
 */

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public interface TestsWithFailureInterface {
    @BeforeEach
    void setup();

    @Test
    void crackerBFailure();
}
