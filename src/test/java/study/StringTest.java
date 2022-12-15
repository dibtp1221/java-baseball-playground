package study;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class StringTest {
    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }
    @Test
    void split() {
        String[] actual =  "1,2".split(",");
        assertThat(actual).containsExactly("1", "2");

        actual = "1".split(",");
        assertThat(actual).containsExactly("1");
    }

    @Test
    void substring() {
        String actual = "(1,2)".substring(1, 4);
        assertThat(actual).isEqualTo("1,2");
    }

    @Test
    @DisplayName("charAt 결과 정상 동작 및 위치 범위 초과시 예외 발생 확인")
    void charAt() {
        char actual = "abc".charAt(1);
        assertThat(actual).isEqualTo('b');

        Assertions.assertThrows(IndexOutOfBoundsException.class, () -> "abc".charAt("abc".length()));
        assertThatThrownBy(() -> "abc".charAt("abc".length())).isInstanceOf(IndexOutOfBoundsException.class);
    }
}
