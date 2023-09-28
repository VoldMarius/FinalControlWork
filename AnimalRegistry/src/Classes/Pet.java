package Classes;
import java.text.ParseException;
import java.util.ArrayList;


public abstract class Pet extends BaseAnimal {

    public Pet(String name, String mainClass, String Type, String birthday, ArrayList Commands) throws ParseException {
        super(name, "Домашние животные", Type,birthday, Commands);
    }
}