package PetAnimal;

import Classes.Pet;
import MySQL.PetType;
import com.sun.jdi.ClassType;
import java.text.ParseException;
import java.time.LocalDate;
import java.util.ArrayList;

public class Dog  extends Pet {

    public Dog(int petId, String name, ClassType mainClass, PetType Type, String birthday, ArrayList Commands)
            throws ParseException {
        super(petId, name, MySQL.ClassType.Домашние,  2, LocalDate.parse(birthday), Commands);
    }
}