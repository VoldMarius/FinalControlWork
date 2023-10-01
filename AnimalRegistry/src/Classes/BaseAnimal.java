package Classes;

import MySQL.ClassType;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public abstract class BaseAnimal<T,C> {
    private  int petId;                // Id животного
    protected String name;             // Имя животного
    protected C Ctype;                 // Класс животного
    protected int Type;                  // Тип животного
    protected LocalDate birthday;      // Дата рождения

    protected ArrayList Commands  ;    // Команды для дрессировки

    private SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

    public BaseAnimal ( int petId , String name, C Ctype , int Type,LocalDate birthday, ArrayList Commands) throws ParseException {
        this.petId = petId;
        this.name = name;
        this.Ctype = Ctype;
        this.Type = Type;
        this.birthday =  birthday;
        this.Commands = Commands;
    }

    public String getInfo() {
        String str = petId+ " " + name + " " + Ctype + " " + Type  + " " + new SimpleDateFormat("yyyy-MM-dd").format(birthday) +
                " " + String.join(" / ",Commands);
        return str;
    }

    public ArrayList getSkills() {
        return this.Commands;
    }

    public void setSkills(ArrayList skills) {
        this.Commands = skills;
    }

}