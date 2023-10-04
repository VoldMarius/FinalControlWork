package PetAnimal;

import Classes.Pet;

import java.text.ParseException;
import java.time.LocalDate;


public class Dog  extends Pet {

    public Dog( String name, int mainClass, int Type, LocalDate birthday, String Commands)
            throws ParseException {
        super(name, 2 , 2, birthday,   Commands);
    }
}