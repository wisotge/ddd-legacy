package calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;

class SplitStingConvertorTest {

    private SplitStingConvertor splitStingConvertor;

    @BeforeEach
    void setUp() {
        splitStingConvertor = new SplitStingConvertor();
    }

    @DisplayName("문자열내에 ',' ':' 구분자를 지원해야한다.")
    @Test
    void 지원정책확인() {
        assertThat(splitStingConvertor.isSupport("1,2")).isTrue();
        assertThat(splitStingConvertor.isSupport("1:2")).isTrue();
        assertThat(splitStingConvertor.isSupport("1:2,3")).isTrue();
    }

    @DisplayName("양수가 아닐경우 에러를 리턴한다.")
    @ParameterizedTest
    @ValueSource(strings = {"1,-2", "1,2:-3", "가,나"})
    void 양수가아닌값에러(final String input) {
        assertThatThrownBy(() -> splitStingConvertor.calculate(input))
                .isInstanceOf(RuntimeException.class);
    }

    @DisplayName("'1,2'을 변환한 경우 1,2를 리턴해야한다.")
    @Test
    void 결과확인() {
        assertThat(splitStingConvertor.calculate("1,2").unmodifiableNumbers())
                .hasSize(2)
                .extracting(number -> number.value())
                .containsExactly(1,2);
    }

}