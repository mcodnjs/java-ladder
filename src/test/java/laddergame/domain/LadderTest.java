package laddergame.domain;

import laddergame.util.RandomBooleanGenerator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LadderTest {

    @Test
    @DisplayName("Ladder가 사람 수와 높이에 따라 정상적으로 생성된다.")
    void ladderCreateTest() {
        int playerCount = 4;
        int height = 5;
        Ladder ladder = new Ladder(playerCount, height, new RandomBooleanGenerator());
        assertThat(ladder.getLadder()).hasSize(height);
    }
}
