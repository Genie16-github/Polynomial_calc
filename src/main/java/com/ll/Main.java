package com.ll;

public class Main {
    public static void main(String[] args) {

    }
}

class Calc{

    public static int run(String exp) {

        exp = exp.replaceAll("- ", "+ -");

        String[] bits = exp.split(" \\+ ");

        int sum = 0;
        for (String bit : bits) {
            sum += Integer.parseInt(bit);
        }

        return sum;
    }
}