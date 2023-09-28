package PetAnimal;

import Classes.Pack;
import Classes.Pet;

import java.text.ParseException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
public abstract class Dogs  extends Pet {

    public Dogs(String name, String mainClass, String Type, String birthday, ArrayList Commands) throws ParseException {
        super(name, "Домашние животные", "Собаки",birthday, Commands);
    }
}