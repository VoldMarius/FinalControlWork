package PetAnimal;


import Classes.Pet;
<<<<<<< HEAD

import java.text.ParseException;
import java.time.LocalDate;
=======
import MySQL.PetType;
import com.sun.jdi.ClassType;
import java.text.ParseException;
import java.time.LocalDate;
import java.util.ArrayList;
>>>>>>> origin/main


public class Cat extends Pet {

<<<<<<< HEAD
    public Cat( String name, int mainClass, int Type, LocalDate birthday, String Commands)
            throws ParseException {
        super(name, 2 , 3, birthday,   Commands);
=======
    public Cat(int petId, String name, ClassType mainClass, PetType Type, String birthday, ArrayList Commands)
            throws ParseException {
        super(petId, name, MySQL.ClassType.Домашние,  3, LocalDate.parse(birthday), Commands);
>>>>>>> origin/main
    }


}