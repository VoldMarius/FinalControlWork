import Classes.Pack;
import Classes.Pet;

import java.text.ParseException;
import java.time.LocalDate;
import java.util.ArrayList;

public class Creator {
    String name;
    LocalDate birthday;
    String Commands;

    public Pack newPackCreator (String namE, int packType, LocalDate birthdaY, String CommandS) throws ParseException {

        Pack pack =  new Pack( name,1,packType,birthday,Commands) ;

        pack.setName(namE);
        pack.setPackType(packType);
        pack.setBirthday(birthdaY);
        pack.setSkills(CommandS);



        return pack;
    }
    public Pet newPetCreator (String namE, int petType, LocalDate birthdaY, String CommandS) throws ParseException {

        Pet pet =  new Pet(name,2,petType,birthday,Commands) ;

        pet.setName(namE);
        pet.setPetType(petType);
        pet.setBirthday(birthdaY);
        pet.setSkills(CommandS);

        return pet;
    }
}
