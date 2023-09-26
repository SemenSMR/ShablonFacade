package org.example;

public class BinOps {
    public String sum(String a, String b) {
        int number = Integer.parseInt(a, 2);
        int number1 = Integer.parseInt(b, 2);
        int sum = (number1 + number);
        String result = Integer.toBinaryString(sum);
        return result;
    }

    public String mult(String a, String b) {
        int number = Integer.parseInt(a, 2);
        int number1 = Integer.parseInt(b, 2);
        int sum = (number1 * number);
        String result = Integer.toBinaryString(sum);
        return result;
    }
}
