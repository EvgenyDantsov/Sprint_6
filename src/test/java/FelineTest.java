import com.example.Feline;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class FelineTest {
    private List<String> expectedFood;
    private Feline feline;

    @Before
    public void setupFeline() {
        feline = new Feline();
        expectedFood = List.of("Животные", "Птицы", "Рыба");
    }

    // Тест на получение списка еды для хищных кошачьих
    @Test
    public void eatMeatFelineTest() throws Exception {
        assertEquals(expectedFood, feline.eatMeat());
    }

    // Тест на получение семейства хищных кошачьих
    @Test
    public void familyFelineTest() {
        assertEquals("Кошачьи", feline.getFamily());
    }

    // Тест на получение количества котят у хищных кошачьих
    @Test
    public void kittensFelineTest() {
        assertEquals(1, feline.getKittens());
    }
}