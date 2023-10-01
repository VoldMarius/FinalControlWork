package PetAnimal;

import Classes.Pet;
import MySQL.PetType;
import com.sun.jdi.ClassType;

import java.text.ParseException;
import java.time.LocalDate;
import java.util.ArrayList;


public abstract class Hamster extends Pet {

    public Hamster(int petId, String name, ClassType mainClass, PetType Type, String birthday, ArrayList Commands)
            throws ParseException {
        super(petId, name, MySQL.ClassType.Домашние,  1, LocalDate.parse(birthday), Commands);
    }
}