import static org.junit.Assert.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;


public class TrollTest {
    Troll troll = new Troll();
    @Test
    public void FixedTests() {
        assertEquals("Ths wbst s fr lsrs LL!",troll.disemvowel("This website is for losers LOL!"));

        assertEquals("N ffns bt,\nYr wrtng s mng th wrst 'v vr rd", troll.disemvowel(
                "No offense but,\nYour writing is among the worst I've ever read"));

        assertEquals( "Wht r y,  cmmnst?", troll.disemvowel("What are you, a communist?"));
    }
}