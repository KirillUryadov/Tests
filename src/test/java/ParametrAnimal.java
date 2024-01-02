import com.example.Animal;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class ParametrAnimal {
    private String animal ;
    private List<String> eats;

    public ParametrAnimal(String animal, List<String> eats){

        this.animal = animal;
        this.eats = eats;

    }

    @Parameterized.Parameters
    public static Object[][] getSumData(){
       return new Object[][]{
               {"Травоядное", List.of("Трава", "Различные растения") },
               {"Хищник", List.of("Животные", "Птицы", "Рыба")},

       };
    }

    @Test
    public void getFoodTest() throws Exception {
        Animal an = new Animal();
        List<String> list = an.getFood(animal);
        assertEquals(eats, list);

    }


}
