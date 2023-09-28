package Classes;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;

public abstract class Pack extends BaseAnimal {


    public Pack(String name, String mainClass, String Type, String birthday, ArrayList Commands) throws ParseException {
        super( name,    "Вьючные животные",Type,  birthday,   Commands);
    }
}