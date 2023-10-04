package PetAnimal;

import Classes.Pet;
import MySQL.PetType;
import com.sun.jdi.ClassType;

import java.text.ParseException;
import java.time.LocalDate;
import java.util.ArrayList;


public  class Hamster extends Pet {
<<<<<<< HEAD
    private String name;
    private int mainClass;
    private int type;
    private LocalDate birthday;
    private String Commands  ;
    public Hamster( String name, int mainClass, int Type, LocalDate birthday, String Commands) throws ParseException {
        super(  name,   mainClass,   Type, birthday, Commands);
    }

=======

    public Hamster(int petId, String name, ClassType mainClass, PetType Type, String birthday, ArrayList Commands)
            throws ParseException {
        super(petId, name, MySQL.ClassType.Домашние,  1, LocalDate.parse(birthday), Commands);
    }
>>>>>>> origin/main
}