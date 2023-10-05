import Classes.Pack;
import Classes.Pet;
import java.text.ParseException;
import java.time.LocalDate;

public class Creator {
    String name;
    LocalDate birthday;
    String Commands;

    public Creator() {
    }

    public Pack newPackCreator(String namE, int packType, LocalDate birthdaY, String CommandS) throws ParseException {
        Pack pack = new Pack(this.name, 1, packType, this.birthday, this.Commands);
        pack.setName(namE);
        pack.setPackType(packType);
        pack.setBirthday(birthdaY);
        pack.setSkills(CommandS);
        return pack;
    }

    public Pet newPetCreator(String namE, int petType, LocalDate birthdaY, String CommandS) throws ParseException {
        Pet pet = new Pet(this.name, 2, petType, this.birthday, this.Commands);
        pet.setName(namE);
        pet.setPetType(petType);
        pet.setBirthday(birthdaY);
        pet.setSkills(CommandS);
        return pet;
    }
}
