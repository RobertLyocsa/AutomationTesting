package ATP_Lyocsa.InteliJ.mavenProjectCMD.src.test.zadanie22;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.*;
import ATP_Lyocsa.InteliJ.mavenProjectCMD.src.main.BankovyUcet;
import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.DisplayName.Random.class) // tu som sa naucil ze sa to da pisat aj ako indicative* inym sposobom
@DisplayNameGeneration(DisplayNameGenerator.Simple.class)
public class AB {

    private BankovyUcet account;
    @BeforeEach
    void setUp() {
        account = new BankovyUcet(1000);
    }

    @BeforeAll
    static void setUpAll() {
        System.out.println("Hello World! I am learning via Metis");
    }
    @Test
    @Disabled
    @EnabledOnOs(OS.MAC)
    @EnabledOnJre (JRE.JAVA_18)
    @DisplayName("1 - Test display vyber")
    void testVyber() {
        account.vyber(500);
        assertEquals(500, account.getAktualnyZostatok());
    }
    @Test
    @EnabledOnOs(OS.WINDOWS)
    @EnabledForJreRange (min = JRE.JAVA_8, max = JRE.JAVA_18, disabledReason = "Testing Java version")
    @DisplayName("2 - Test display vloz")
    void testVloz() {
        account.vloz(44);
        assertEquals(1044, account.getAktualnyZostatok());
    }
   // @Test
   // @DisplayName("3 - Test vyber throws exception when insufficient funds")
   // void testVyberThrowsException() {
   //     assertThrows(IllegalArgumentException.class, () -> account.vyber(1500));
   // }
    @AfterEach
    void successfulTestMessage(){
        System.out.println("Test prebehol uspesne!");
    }
    @AfterAll
    static void cleanUp() {
    }
}
