package PackAnimal;
import Classes.Pack;

import java.text.ParseException;
import java.time.LocalDate;


public class Camels extends Pack {
    private String name;
    private int mainClass;
    private int type;
    private LocalDate birthday;
    private String Commands  ;

    public Camels(String name, int mainClass, int Type, LocalDate birthday, String Commands)
            throws ParseException {
        super(name, 1 , 1, birthday,   Commands);
    }

}
