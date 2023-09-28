package Classes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public abstract class BaseAnimal {
    protected String name;        // Имя животного
    protected String mainClass;   // Класс животного
    protected String Type;        // Тип животного
    protected Date birthday;      // Дата рождения

    protected ArrayList Commands; // Команды для дрессировки

    private SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

    public BaseAnimal (String name, String mainClass, String Type, String birthday, ArrayList Commands) throws ParseException {
        this.name = name;
        this.mainClass = mainClass;
        this.Type = Type;
        this.birthday = format.parse(birthday);
        this.Commands = Commands;
    }

    public String getInfo() {
        String str = mainClass + " " + Type + " " + name + " " + new SimpleDateFormat("yyyy-MM-dd").format(birthday) +
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