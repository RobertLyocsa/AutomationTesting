package ATP_Lyocsa.InteliJ.mavenProjectCMD.src.test.zadanie21;

import ATP_Lyocsa.InteliJ.mavenProjectCMD.src.test.zadanie20.TestMethods;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ATP_Lyocsa.InteliJ.mavenProjectCMD.src.main.MethodsForTest;

import static org.junit.jupiter.api.Assertions.*;
class AppTest
{
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    @Test
    void testReturnMessage(){

        TestMethods TestMethods = new TestMethods();
        String expectedMessage = "Hello World";

        String actualMessage = TestMethods.returnMessage();

        Assertions.assertEquals(expectedMessage, "Hello World");
    }
    @Test
    void testMultiply(){
        MethodsForTest methodsForTest = new MethodsForTest();

        int expectedvalue = 50;
        int actualvalue = methodsForTest.multiply(10, 5);


    }
}