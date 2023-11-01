package racingcar;

import camp.nextstep.edu.missionutils.test.NsTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static camp.nextstep.edu.missionutils.test.Assertions.assertRandomNumberInRangeTest;
import static camp.nextstep.edu.missionutils.test.Assertions.assertSimpleTest;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class UserInputTest extends  NsTest{

    @Test
    @DisplayName("testing_input_for_round")
    void roundInput() {
        assertSimpleTest(() ->
            assertThatThrownBy(() -> runException("ej,david,paul", "st"))
                .isInstanceOf(IllegalArgumentException.class)
                );
    }

    @Override
    protected void runMain() {
        Application.main(new String[]{});
    }
}