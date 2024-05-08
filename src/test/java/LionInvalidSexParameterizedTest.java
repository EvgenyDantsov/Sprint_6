import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class LionInvalidSexParameterizedTest {
    private final String sex;
    private final Feline feline;

    // Конструктор класса, принимающий параметр пола животного
    public LionInvalidSexParameterizedTest(String sex) {
        this.sex = sex;
        this.feline = new Feline();
    }

    @Parameterized.Parameters(name = "Test {index}: sex: {0}")
    public static Object[][] getSexData() {
        return new Object[][]{
                {"Альфа-самец"},
                {"Альфа-самка"},
                {"Unknown"}
        };
    }

    // Тестовый метод, ожидающий выброс исключения
    @Test(expected = Exception.class)
    public void exceptionMessageErrorTest() throws Exception {
        //В этом месте ожидаем, что будет выброшено исключение при создании объекта Lion
        new Lion(sex, feline);
    }
}