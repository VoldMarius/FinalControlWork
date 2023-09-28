package Classes;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

public abstract class Pet {

    protected int petId;
    protected String PetType ;
    protected String name;
    protected String CommandList;
    protected LocalDate birthday;

    public Pet(int petId,String PetType ,  String name, String command ,  String birthday) {
     }

     public void setPetId(int petId) {
        this.petId = petId;
    }

    public int getPetId() {
        return petId;
    }
    public void setPetType(String PetType) {
        this.PetType = PetType;
    }

    public String getPetType() {
        return PetType;
    }

    public void setCommandList(String Command) {
        this.CommandList = Command;
    }

    public String getCommandList() {
        return CommandList;
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
        return String.format("%d. %s: имя: %s, дата рождения: %s ", getPetId(),getPetType() ,getName(),
                getCommandList(), getBirthday());
    }

    public abstract List<Pet> getAll();

    public abstract Pet getById(int id);

    public abstract int create(int type, String name, LocalDate date);

    public abstract int update(Pet item);

    public abstract void delete(int item);
}

