import com.example.Animal;
import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    Feline feline;

    @Test
    public void getKittensTest() throws Exception {

        Lion lion = new Lion("Самец", feline);
        Mockito.when(feline.getKittens()).thenReturn(1);
        int expected = 1;
        assertEquals(expected,lion.getKittens());

    }

    @Test
    public void doesHaveMane() throws Exception {

        Lion lion = new Lion("Самец", feline);
        assertTrue(lion.doesHaveMane());
    }

//    @Spy
//    Animal animal;

    @Test
    public void getFoodTest() throws Exception {
        Lion lion = new Lion("Самец", feline);
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        assertEquals(expected, lion.getFood());

    }

    @Test
    public void lionTestConstructor() throws Exception {
        Lion lion = new Lion("Самец", feline);
    }

}
