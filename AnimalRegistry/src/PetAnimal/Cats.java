package PetAnimal;

import Classes.BaseAnimal;
import Classes.Pack;
import Classes.Pet;

import java.text.ParseException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public abstract class Cats  extends Pet {

    public Cats(String name, String mainClass, String Type, String birthday, ArrayList Commands) throws ParseException {
        super(name, "Домашние животные", "Кошки",birthday, Commands);
    }
}