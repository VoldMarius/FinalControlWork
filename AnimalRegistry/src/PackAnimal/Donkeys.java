package PackAnimal;

import Classes.Pack;
import java.text.ParseException;
import java.util.ArrayList;



    public class Donkeys extends Pack {

        public Donkeys(String name, String Type, String birthday, ArrayList Commands) throws ParseException {
            super(name, "Вьючные животные", "Ослы", birthday, Commands);
        }
    }