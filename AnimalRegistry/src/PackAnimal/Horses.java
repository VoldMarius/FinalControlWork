package PackAnimal;
import Classes.Pack;
import java.text.ParseException;
import java.util.ArrayList;


public class Horses extends Pack {

    public Horses(String name, String Type, String birthday, ArrayList Commands) throws ParseException {
        super(name, "Вьючные животные", "Лошади", birthday, Commands);
    }
}