import java.time.LocalDate;

public abstract class NewPetCreator {

    protected abstract Pet createNewPet(PetType type);

    public Pet createPet(PetType type, String name,String CommandList, LocalDate date) {

        Pet pet = createNewPet(type);
        pet.setName(name);
        pet.setCommandList(CommandList);
        pet.setBirthday(date);
        return pet;
    }
}