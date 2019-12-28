package fr.hippo.nbastats.domain;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class BinaryStatUnitTest {

    @Test
    public void shouldGetValues() {
        BinaryStat binaryStat = new BinaryStat(2, 12);

        assertThat(binaryStat.getSuccess()).isEqualTo(2);
        assertThat(binaryStat.getTotal()).isEqualTo(12);
        assertThat(binaryStat.getMissed()).isEqualTo(10);
    }

    @Test
    public void shouldToStringWithTwoLowValuesHaveTwoSpaces() {
        assertThat(new BinaryStat(2, 2)).hasToString(" 2/2 ");
    }

    @Test
    public void shouldToStringWithHighTotalHaveOneSpace() {
        assertThat(new BinaryStat(2, 12)).hasToString(" 2/12");
    }

    @Test
    public void shouldToStringWithHighSuccessHaveNoSpace() {
        assertThat(new BinaryStat(11, 12)).hasToString("11/12");
    }
}
