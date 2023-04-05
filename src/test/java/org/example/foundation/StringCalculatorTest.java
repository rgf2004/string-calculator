/*
 * Copyright (c) 2023 Payoneer Germany GmbH. All rights reserved.
 */

package org.example.foundation;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringCalculatorTest {

    private static final StringCalculator TARGET = new StringCalculator();

    @Test
    void emptyString() {
        final int actual = TARGET.add("");
        assertThat(actual).isZero();
    }

    @Test
    void oneNumberString() {
        final int actual = TARGET.add("1");
        assertThat(actual).isEqualTo(1);
    }

    @Test
    void twoNumbersString() {
        final int actual = TARGET.add("1,2");
        assertThat(actual).isEqualTo(3);
    }

    @Test
    void multipleNumbersString() {
        final int actual = TARGET.add("1,2,1,1,1,1");
        assertThat(actual).isEqualTo(7);
    }

    @Test
    void multipleNumbersWithNewLineCharacterString() {
        final int actual = TARGET.add("1\n2,3");
        assertThat(actual).isEqualTo(6);
    }

    @Test
    void firstLineWithDelimiterString() {
        final int actual = TARGET.add("//;\n1;2");
        assertThat(actual).isEqualTo(3);
    }
}