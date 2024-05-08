import com.example.AlexLion;
import com.example.Feline;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class AlexLionTest {

    private AlexLion alexLion;
    private List<String> expectedFriends;
    private String placeOfLiving;

    @Before
    public void setupFeline() throws Exception {
        Feline feline = new Feline();
        alexLion = new AlexLion(feline);
        placeOfLiving = "Нью-Йоркский зоопарк";
        expectedFriends = List.of("Марти", "Глория", "Мелман");
    }

    @Test
    public void eatMeatFelineTest() throws Exception {
        assertEquals(expectedFriends, alexLion.getFriends());
    }

    @Test
    public void kittensAlexLionTest() {
        assertEquals(0, alexLion.getKittens());
    }

    @Test
    public void placeOfLivingAlexLionTest() {
        assertEquals(placeOfLiving, alexLion.getPlaceOfLiving());
    }
}