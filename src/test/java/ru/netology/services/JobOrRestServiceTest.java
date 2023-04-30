package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class JobOrRestServiceTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/java/ru/netology/services/resources.csv")

    public void test(int expected, int income, int expenses, int threshold) {
        JobOrRestService service = new JobOrRestService();
        int actual = service.calculate(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);
    }
}
