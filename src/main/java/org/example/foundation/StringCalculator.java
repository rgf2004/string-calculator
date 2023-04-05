/*
 * Copyright (c) 2023 Payoneer Germany GmbH. All rights reserved.
 */
package org.example.foundation;

import java.util.Arrays;

/**
 * String Calculator
 *
 * @author Ramy Mohamed
 */
public class StringCalculator {

    public int add(String numbers) {
        if (numbers.isEmpty()) {
            return 0;
        }
        final String[] numbersArray = numbers.split(",");
        return Arrays.stream(numbersArray).map(Integer::parseInt).reduce(0, Integer::sum);
    }
}
