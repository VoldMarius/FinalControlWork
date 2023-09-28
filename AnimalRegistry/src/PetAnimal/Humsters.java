package PetAnimal;

import Classes.Pet;
import java.text.ParseException;
import java.util.ArrayList;


public abstract class Humsters extends Pet {

    public Humsters(String name, String mainClass, String Type, String birthday, ArrayList Commands) throws ParseException {
        super(name, "Домашние животные", "Хомяки",birthday, Commands);
    }
}