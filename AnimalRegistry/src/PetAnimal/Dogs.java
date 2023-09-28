package PetAnimal;

import Classes.Pack;
import Classes.Pet;

import java.text.ParseException;
import java.time.LocalDate;
import java.util.List;

public class Dogs extends Pet {


    public Dogs(int petId, String PetType, String name, String command ,  String birthday) throws ParseException {
        super(petId, "Собака", name, command,birthday);

    }

    @Override
    public String toString() {
        return String.format("%d. %s: имя: %s, порода: %s, дата рождения: %s, навыки: %s",
                getPetId(), getClass().getSimpleName(), getName(), getBirthday(),getCommandList());
    }

    @Override
    public List<Pet> getAll() {
        return null;
    }

    @Override
    public Pet getById(int id) {
        return null;
    }

    @Override
    public int create(int type, String name, LocalDate date) {
        return 0;
    }

    @Override
    public int update(Pet item) {
        return 0;
    }

    @Override
    public void delete(int item) {

    }
}