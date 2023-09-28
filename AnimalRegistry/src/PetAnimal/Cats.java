package PetAnimal;

import Classes.Pack;
import Classes.Pet;

import java.text.ParseException;
import java.time.LocalDate;
import java.util.List;

public class Cats extends Pet {


    public Cats(int petId, String PetType, String name, String command ,  String birthday) throws ParseException {
        super(petId, "Кошка", name, command,birthday);

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
