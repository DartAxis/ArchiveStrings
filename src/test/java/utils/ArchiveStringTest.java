package utils;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static utils.ArchiveString.*;

class ArchiveStringTest {

    @ParameterizedTest
    @ValueSource(strings = {"aaabbb"})
    void archiveStringTest(String line) {
        assertEquals("3a3b",processString(line));
    }

    @Test
    void archiveStringTest2(){
        assertEquals("Неверно переданная строка",processString(null));
    }

    @Test
    void archiveStringTest3(){
        assertEquals("Неверно переданная строка",processString(""));
    }
}