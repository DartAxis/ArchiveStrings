package utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static utils.ArchiveString.processString;

class ArchiveStringTest {

    @Test
    void archiveStringTest() {
        assertEquals("3a3b",processString("aaabbb"));
        assertEquals("3a3b4c2a",processString("aaabbbccccaa"));
        assertEquals("2a2b6z",processString("aabbzzzzzz"));
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