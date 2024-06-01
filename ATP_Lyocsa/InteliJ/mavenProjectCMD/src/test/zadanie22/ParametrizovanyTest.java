package ATP_Lyocsa.InteliJ.mavenProjectCMD.src.test.zadanie22;

import org.junit.jupiter.api.Test;
import ATP_Lyocsa.InteliJ.mavenProjectCMD.src.main.TDDApproche;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParametrizovanyTest {
    //divisionRefactor a Multiply

    @Test // toto nie je spravny sposob ako to napisat, ten je nizsie
    void testMultiply() {
        assertEquals(15, TDDApproche.multiply(3, 5));
        assertEquals(25, TDDApproche.multiply(5, 5));
        assertEquals(35, TDDApproche.multiply(7, 5));
        assertEquals(0, TDDApproche.multiply(0, 5));
        assertEquals(5, TDDApproche.multiply(1, 5));
        assertEquals(100, TDDApproche.multiply(20, 5));
        assertEquals(-100, TDDApproche.multiply(-20, 5));
    }

    @ParameterizedTest
    @CsvSource({ // tu som to pochopil ako taky Array list
            "15,3,5",
            "25,5,5",
            "35,7,5",
            "0,0,5",
            "5,1,5",
            "100,20,5",
            "-100,-20,5"
    })
    void testMultiply2(int expectedResult, int x, int y) {
        assertEquals(expectedResult, TDDApproche.multiply(x, y));
    }
// tu som sa naucil ze som to nemal v pom.xml ako dependency
    @ParameterizedTest
    @CsvSource({
            "3",
            "7",
            "12",
            "23",
            "31"
    }) // Tu som sa naucil ze musim vymenovat pismena slovne
    void testRefactor(int number) {
        if (number % 3 == 0) {
            assertEquals("The number is divisible by three", TDDApproche.divisionRefactor(number));
        } else if (number % 7 == 0) {
            assertEquals("The number is divisible by seven", TDDApproche.divisionRefactor(number));
        } else
            assertEquals(Integer.toString(number), TDDApproche.divisionRefactor(number));
    }
}
