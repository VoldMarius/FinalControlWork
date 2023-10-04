package Classes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;


public class Pack extends BaseAnimal {

    private String name;
    private int mainClass;
    private int type;
    private LocalDate birthday;
    private String Commands  ;
    public Pack(  String name,   int mainClass, int type, LocalDate birthday, String Commands) throws ParseException {
             super(  name,  1, type,  birthday,   Commands);
    }

    public void setPackType(int type) {
        this.type =  type ;
    }

    public int getPackType() {
        return  type;
    }

    public int getClassType() { return 1 ;}


    public void setName(String name) {
        this.name = name;
    }

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
        @Override
        public String toString() {
            String str = getName()  + " " + getClassType() + " " + getPackType()  + " " +
                 new SimpleDateFormat("yyyy-MM-dd").format(birthday) + " " + String.join(" / ",Commands);
            return str;
        }
    public String getSkills() {
        return this.Commands;
    }

    public void setSkills(String skills) {
        this.Commands = skills;
    }


}

