package com.ll;

public class Main {
    public static void main(String[] args) {

    }
}

class Calc{

    public static int run(String exp) {

        boolean needToMulti = exp.contains("*");
        boolean needToPlus = !needToMulti;

        if ( needToPlus ) {
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