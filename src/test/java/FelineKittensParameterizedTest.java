import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class FelineKittensParameterizedTest {
    private final int inputKittensCount;
    private final int expectedKittensCount;
    private final Feline feline;

    public FelineKittensParameterizedTest(int inputKittensCount, int expectedKittensCount) {
        this.inputKittensCount = inputKittensCount;
        this.expectedKittensCount = expectedKittensCount;
        this.feline = new Feline();
    }

    @Parameterized.Parameters(name = "Test {index}: kittens count: {0}")
    public static Object[][] getAccordionHeader() {
        return new Object[][]{
                {1, 1},
                {3, 3},
                {0, 0}
        };
    }

    // Тест на получение количества котят с учетом входного значения
    @Test
    public void getKittensFelineTest() {
        // Проверяем, что метод getKittens(int) возвращает ожидаемое количество котят
        assertEquals(expectedKittensCount, feline.getKittens(inputKittensCount));
    }
}