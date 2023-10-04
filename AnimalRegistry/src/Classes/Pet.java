package Classes;
import MySQL.ClassType;
import MySQL.PackType;
import MySQL.PetType;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;


public class Pet extends BaseAnimal {

    private String name;
    private int mainClass;
    private int type;
    private LocalDate birthday;
    private String Commands  ;


    public Pet( String name, int mainClass,int type,LocalDate birthday, String Commands) throws ParseException {
        super( name, 2,type, birthday, Commands);
    }



        public void setPetType(int type) {
            this.type =  type ;
        }

        public int getPetType() {
            return  type;
        }

        public int getClassType() { return 2 ;}


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
            String str =   getName()  + " " + getClassType() + " " + getPetType()  + " " +
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

