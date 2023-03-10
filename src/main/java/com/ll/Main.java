package com.ll;

public class Main {
    public static void main(String[] args) {

    }
}

class Calc{

    public static int run(String exp) {

        boolean plus = exp.contains("+");
        boolean minus = exp.contains("-");

        String[] bits = null;

        if (plus){
            bits = exp.replace(" ", "").split("\\+");
        }
        else if(minus){
            bits = exp.replace(" ", "").split("\\-");
        }

        int a = Integer.parseInt(bits[0]);
        int b = Integer.parseInt(bits[1]);

        if (plus) return a + b;
        else if (minus) return a - b;

        throw new RuntimeException("해석X");
    }
}