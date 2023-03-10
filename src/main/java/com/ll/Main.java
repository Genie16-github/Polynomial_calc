package com.ll;

public class Main {
    public static void main(String[] args) {

    }
}

class Calc{

    public static int run(String exp) {

        String[] bits = exp.replace(" ", "").split("\\+");

        int a = Integer.parseInt(bits[0]);
        int b = Integer.parseInt(bits[1]);

        return a + b;
    }
}