package PackAnimal;
import Classes.Pack;
import MySQL.ClassType;
import MySQL.PackType;

import java.text.ParseException;
import java.time.LocalDate;
import java.util.ArrayList;


public class Camels extends Pack {


    public Camels( int petId,String name,  ClassType mainClass, PackType Type,LocalDate birthday, ArrayList Commands)
            throws ParseException {
        super(petId,name, ClassType.Вьючные , 1, birthday,   Commands);
    }

}
