package PackAnimal;
import Classes.Pack;
import java.text.ParseException;
import java.util.ArrayList;


public class Camels extends Pack {


    public Camels(String name,   String Type, String birthday, ArrayList Commands) throws ParseException {
        super(name, "Вьючные животные", "Верблюды", birthday,   Commands);
    }

}
