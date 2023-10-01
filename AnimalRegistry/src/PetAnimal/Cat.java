package PetAnimal;


import Classes.Pet;
import MySQL.PetType;
import com.sun.jdi.ClassType;
import java.text.ParseException;
import java.time.LocalDate;
import java.util.ArrayList;


public class Cat extends Pet {

    public Cat(int petId, String name, ClassType mainClass, PetType Type, String birthday, ArrayList Commands)
            throws ParseException {
        super(petId, name, MySQL.ClassType.Домашние,  3, LocalDate.parse(birthday), Commands);
    }


}