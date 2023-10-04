package PackAnimal;
import Classes.Pack;
import MySQL.ClassType;
import MySQL.PackType;

import java.text.ParseException;
import java.time.LocalDate;
import java.util.ArrayList;


public class Horses extends Pack {
<<<<<<< HEAD
    private String name;
    private int mainClass;
    private int type;
    private LocalDate birthday;
    private String Commands  ;
    public Horses( String name, int mainClass, int Type, LocalDate birthday, String Commands) throws ParseException {
        super(name, 1 , 2, birthday,   Commands);
=======

    public Horses(int petId, String name, ClassType mainClass, PackType Type, LocalDate birthday, ArrayList Commands) throws ParseException {
        super(petId,name, ClassType.Вьючные , 1, birthday,   Commands);
>>>>>>> origin/main
    }
}