import java.time.LocalDate;

public abstract class NewPackCreator {

    protected abstract Pack createNewPack(PackType type);

    public Pack createPet(PackType type, String name, String CommandList, LocalDate date) {

        Pack pack = createNewPack(type);
        pack.setName(name);
        pack.setCommandList(CommandList);
        pack.setBirthday(date);
        return pack;
    }
}