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
}