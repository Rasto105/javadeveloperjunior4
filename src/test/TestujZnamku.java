package test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ulohy.PriradenieZnamky;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestujZnamku {
    @BeforeEachvoid
    void setUp() {

    }
    @Test
    @DisplayName("Testy na zmanku")
    public void testznamky() {
        assertEquals("B", PriradenieZnamky.slovnaZnamka(90));
        assertEquals("C", PriradenieZnamky.slovnaZnamka(70));
    }

}
