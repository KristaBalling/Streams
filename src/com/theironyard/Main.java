package com.theironyard;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> someBingoNumbers = Arrays.asList(
                "N40", "N36",
                "B12", "B6",
                "G53", "G49", "G60", "G50", "g64",
                "I26", "I17", "I29",
                "O71");

        someBingoNumbers.forEach(number -> {
            if(number.toUpperCase().startsWith("G")) {
                System.out.println(number);
            }
        });
    }
}
