package ru.netology.sqr;

import org.junit.jupiter.params.ParameterizedTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.provider.CsvSource;

class SQRServiceTest {
    @ParameterizedTest
    @CsvSource(
            value = {
                    "200, 300, 3",
                    "1, 100, 1",
                    "1, 9801, 90",
                    "0, 99, 0",
                    "9802, 10000, 0"
            },
            delimiter = ','
    )
    void shouldCalculateSquare(int borderLower, int borderUpper, int counterFin) {
        SQRService service = new SQRService();

        // вызываем целевой метод:
        long counter = service.square(borderLower, borderUpper);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(counter, counterFin);
    }

}