import com.example.Cat;
import com.example.Feline;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {
    private List<String> expectedFood;
    //Мок объекта Feline
    @Mock
    Feline feline;
    Cat cat;

    @Before
    public void setCat() {
        // Создание экземпляра кошки с мок объектом Feline
        cat = new Cat(feline);
        expectedFood = List.of("Животные", "Птицы", "Рыба");
    }

    // Тест на звук, который издает кошка
    @Test
    public void soundCatTest() {
        assertEquals("Мяу", cat.getSound());
    }

    // Тест на получение еды кошкой
    @Test
    public void foodCatTest() throws Exception {
        // Задание поведения мок объекта Feline
        Mockito.when(feline.eatMeat()).thenReturn(expectedFood);
        assertEquals(expectedFood, cat.getFood());
    }
}