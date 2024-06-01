package ATP_Lyocsa.InteliJ.mavenProjectCMD.src.test.zadanie21;

import ATP_Lyocsa.InteliJ.mavenProjectCMD.src.main.MethodsForTest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

class UlohaAB {

    @Test
    void returnMessageTest() {
        MethodsForTest myClass = new MethodsForTest();
        String expectedMessage = "Hello, JUnit!";
        String actualMessage = myClass.returnMessage(expectedMessage);
        assertEquals(expectedMessage, actualMessage);
    }

    @Test
    void getWordsFromListTest() {
        MethodsForTest myClass = new MethodsForTest();
        List<String> expectedWords = List.of("Testing", "by", "JUnit5", "is", "awesome", "heck yeah");
        List<String> actualWords = myClass.getWordsFromList();
        assertEquals(expectedWords, actualWords);
    }

    @Test
    void getCarsTest() {
        MethodsForTest myClass = new MethodsForTest();
        String[] expectedCars = {"Bugati", "Mazde", "Subaru", "Jaguar"};
        String[] actualCars = myClass.getCars();
        assertArrayEquals(expectedCars, actualCars);
    }

    @Test
    void reverseBooleanTest() {
        MethodsForTest myClass = new MethodsForTest();
        assertTrue(myClass.reverseBoolean(false));
        assertFalse(myClass.reverseBoolean(true));
    }

    @Test
    void isFirstNumberMoreTest() {
        MethodsForTest myClass = new MethodsForTest();
        assertTrue(myClass.isFirstNumberMore(5.0, 2.0, 3.0));
        assertFalse(myClass.isFirstNumberMore(5.0, 5.0, 5.0));
    }

    @Test
    void divisionTest() {
        MethodsForTest myClass = new MethodsForTest();
        assertEquals(2.0, myClass.division(4.0, 2.0), 0.0001);
        assertEquals(0.5, myClass.division(1.0, 2.0), 0.0001);
    }

    @Test
    void getTestingWithCorrectNameTest() {
        MethodsForTest myClass = new MethodsForTest();
        String expected = "Testing in JUnit is awesome";
        String actual = myClass.getTestingWithCorrectName("JUnit");
        assertEquals(expected, actual);
    }

    @Test
    void throwExceptionTest() {
        MethodsForTest myClass = new MethodsForTest();
        assertThrows(Exception.class, () -> myClass.throwException(5));
        assertDoesNotThrow(() -> myClass.throwException(10));
    }

    @Test
    void sumTest() {
        MethodsForTest myClass = new MethodsForTest();
        assertEquals(10, myClass.sum(5, 5));
        assertEquals(-5, myClass.sum(-10, 5));
    }

    @Test
    void isEvenNumberTest() {
        MethodsForTest myClass = new MethodsForTest();
        assertTrue(myClass.isEvenNumber(22));
        assertTrue(myClass.isEvenNumber(14));
        assertTrue(myClass.isEvenNumber(8));
        assertTrue(myClass.isEvenNumber(32));
        assertTrue(myClass.isEvenNumber(44));
        assertFalse(myClass.isEvenNumber(3));
    }

    @Test
    void findIndexOfStringTest() {
        MethodsForTest myClass = new MethodsForTest();
        String[] array = {"Bugati", "Mazde", "Subaru", "Jaguar"};
        assertEquals(2, myClass.findIndexOfString(array, "Subaru"));
        assertEquals(-1, myClass.findIndexOfString(array, "Ferrari"));
    }

    @Test
    void getMaxFromArrayTest() {
        MethodsForTest myClass = new MethodsForTest();
        int[] numbers = {22, 14, 8, 32, 44};
        assertEquals(44, myClass.getMaxFromArray(numbers));
    }
}
