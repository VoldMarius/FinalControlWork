package Classes;
import MySQL.ClassType;
import MySQL.PackType;
import MySQL.PetType;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;


public abstract class Pet extends BaseAnimal {
    int petId;
    private String name;
    private ClassType mainClass;
    private int type;
    private LocalDate birthday;
    private ArrayList Commands  ;


    public Pet(int petId,String name, ClassType mainClass,int type,LocalDate birthday, ArrayList Commands) throws ParseException {
        super(petId, name, mainClass,type, birthday, Commands);
    }

        public void setPetId(int petId) {
            this.petId = petId;
        }

        public int getPetId() {
            return petId;
        }
        public void setPetType(int type) {
            this.type =  type ;
        }

        public int getPetType() {
            return  type;
        }


        public ClassType getClassType() {
            return ClassType.Домашние;
        }
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
            String str = getPetId() + " " + getName()  + " " + getClassType() + " " + getPetType()  + " " +
               new SimpleDateFormat("yyyy-MM-dd").format(birthday) + " " + String.join(" / ",Commands);
            return str;
        }

        public ArrayList getSkills() {
            return this.Commands;
        }

        public void setSkills(ArrayList skills) {
            this.Commands = skills;
        }



        public Pet createNewPet(int petId,String name, ClassType Type, int type, LocalDate birthday, ArrayList Commands) {

            Pet pet = createNewPet( petId, name,  Type, type,  birthday, Commands);
            pet.setPetId(petId);
            pet.setName(name);

            pet.setPetType(type);
            pet.setBirthday(birthday);
            pet.setSkills(Commands);


            return pet;
        }
    }

