package PetAnimal;


import Classes.Pet;

import java.text.ParseException;
import java.time.LocalDate;


public class Cat extends Pet {

    public Cat( String name, int mainClass, int Type, LocalDate birthday, String Commands)
            throws ParseException {
        super(name, 2 , 3, birthday,   Commands);
    }


}