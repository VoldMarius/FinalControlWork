package Classes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;


public abstract class BaseAnimal< C> {

    protected String name;             // Имя животного
    protected int Ctype;                 // Класс животного
    protected int type;                  // Тип животного
    protected LocalDate birthday;      // Дата рождения

    protected String Commands;    // Команды для дрессировки



    public BaseAnimal(  String name, int Ctype, int type, LocalDate birthday, String Commands) throws ParseException {

        this.name = name;
        this.Ctype = Ctype;
        this.type = type;
        this.birthday = birthday;
        this.Commands = Commands;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getType() {
        return type;
    }

    public void setClassType(int type) {
        this.Ctype = Ctype;
    }

    public int getClassType() {
        return Ctype;
    }

    public void setName(String name) { this.name = name; }

    public String getName() {
        return name;
    }

    public void setBirthday(LocalDate date) {
        this.birthday = date;
    }


    public String getBirthday() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        return formatter.format(birthday);
    }

    public String getInfo() {
        String str =  name + " " + Ctype + " " + type + " " + new SimpleDateFormat("yyyy-MM-dd").format(birthday) +
                " " + String.join(" / ", Commands);
        return str;
    }

    public String getSkills() {
        return this.Commands;
    }

    public void setSkills(String skills) {
        this.Commands = skills;
    }





}