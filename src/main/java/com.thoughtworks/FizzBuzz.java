package com.thoughtworks;

public class FizzBuzz {
    public String calculate(int number) {
        String Fizz = "Fizz";
        String Buzz = "Buzz";
        String Whizz = "Whizz";

        String numberStr = String.valueOf(number);
        String result = "";

        if (number % 3 == 0) {
            result += Fizz;
        }
        if (number % 5 == 0) {
            result += Buzz;
        }
        if (number % 7 == 0) {
            result += Whizz;
        }
        if (numberStr.contains("7")) {
            return result.isEmpty() ? numberStr : result.replace(Buzz, "");
        }
        if (numberStr.contains("5")) {
            return result.isEmpty() ? numberStr : result.replace("Fizz", "");
        }

        if (numberStr.contains("3")) {
            return Fizz;
        }
        return result.isEmpty() ? numberStr : result;
    }
}
