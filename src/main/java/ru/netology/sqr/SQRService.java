package ru.netology.sqr;

public class SQRService {
    public long square(int borderLower, int borderUpper) {
        int squareRoot = 0;
        int counter = 0;

        for (int i = 10; i <= 99; i++) {
            squareRoot = i * i;
            if (squareRoot >= borderLower && squareRoot <= borderUpper) {
                counter++;

            }
        }
        return counter;

    }

}
