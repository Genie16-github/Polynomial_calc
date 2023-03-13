package com.ll;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CalcTests {
    @Test
    @DisplayName("1 + 1 == 2")
    void t1() {
        assertThat(Calc.run("1 + 1")).isEqualTo(2);
    }

    @Test
    @DisplayName("2 + 1 == 3")
    void t2() {
        assertThat(Calc.run("2 + 1")).isEqualTo(3);
    }

    @Test
    @DisplayName("2 + 2 == 4")
    void t3() {
        assertThat(Calc.run("2 + 2")).isEqualTo(4);
    }

    @Test
    @DisplayName("1000 + 280 == 1280")
    void t4() {
        assertThat(Calc.run("1000 + 280")).isEqualTo(1280);
    }

    @Test
    @DisplayName("50 - 30 == 20")
    void t5() {
        assertThat(Calc.run("50 - 30")).isEqualTo(20); // 구현
    }

    @Test
    @DisplayName("10 - 3 == 7")
    void t6() {
        assertThat(Calc.run("10 - 3")).isEqualTo(7); // 구현
    }

    @Test
    @DisplayName("10 - 3 + 20 == 27")
    void t7() {
        assertThat(Calc.run("10 - 3 + 20")).isEqualTo(27); // 구현
    }

    @Test
    @DisplayName("10 - 3 + 20 - 10 + 10 + 20 == 47")
    void t8() {
        assertThat(Calc.run("10 - 3 + 20 - 10 + 10 + 20")).isEqualTo(47); // 구현
    }

    @Test
    @DisplayName("10 * 10 * 10 == 1000")
    void t9() {
        assertThat(Calc.run("10 * 10 * 10")).isEqualTo(1000);
    }

    @Test
    @DisplayName("20 + 10 + 5 * 2 == 40")
    void t10() {
        assertThat(Calc.run("20 + 10 + 5 * 2")).isEqualTo(40);
    }

    @Test
    @DisplayName("10 * 20 + 10 + 5 * 2 == 220")
    void t11() {
        assertThat(Calc.run("10 * 20 + 10 + 5 * 2")).isEqualTo(220);
    }
}
