package com.ll;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Calc {
    public static int run(String exp) {
        // 단일항이 입력되면 바로 리턴
        if ( !exp.contains(" ") ) return Integer.parseInt(exp);

        boolean needToMulti = exp.contains("*");
        boolean needToPlus = exp.contains("+") || exp.contains("-");

        boolean needToCompound = needToMulti && needToPlus;

        if ( needToCompound ) {
            String[] bits = exp.split(" \\+ ");

            String newExp = Arrays.stream(bits)
                    .mapToInt(Calc::run)
                    .mapToObj(e -> e + "")
                    .collect(Collectors.joining(" + "));

            return run(newExp);
        }
        else if ( needToPlus ) {
            exp = exp.replaceAll("- ", "+ -");

            String[] bits = exp.split(" \\+ ");

            int sum = 0;

            for (String bit : bits) {
                sum += Integer.parseInt(bit);
            }

            return sum;
        }
        else if ( needToMulti ) {
            String[] bits = exp.split(" \\* ");

            int sum = 1;

            for (String bit : bits) {
                sum *= Integer.parseInt(bit);
            }

            return sum;
        }

        throw new RuntimeException("올바른 계산식이 아닙니다.");
    }
}
