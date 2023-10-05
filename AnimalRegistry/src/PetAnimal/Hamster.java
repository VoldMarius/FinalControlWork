package PetAnimal;

import Classes.Pet;

import java.text.ParseException;
import java.time.LocalDate;


public  class Hamster extends Pet {
    private String name;
    private int mainClass;
    private int type;
    private LocalDate birthday;
    private String Commands  ;
    public Hamster( String name, int mainClass, int Type, LocalDate birthday, String Commands) throws ParseException {
        super(  name,   mainClass,   Type, birthday, Commands);
    }

}