package ATP_Lyocsa.InteliJ.mavenProjectCMD.src.test.zadanie21;

import org.junit.Test;
import ATP_Lyocsa.InteliJ.mavenProjectCMD.src.main.BankovyUcet;

import static org.junit.Assert.assertEquals;

public class UlohaC {

    @Test
    public void testVloz() {
        BankovyUcet ucet = new BankovyUcet();
        ucet.vloz(100);
        assertEquals(100, ucet.getAktualnyZostatok(), 0.01);
    }

    @Test
    public void testVyber() {
        BankovyUcet ucet = new BankovyUcet();
        ucet.vyber(50);
        assertEquals(-50, ucet.getAktualnyZostatok(), 0.01);
    }
}
