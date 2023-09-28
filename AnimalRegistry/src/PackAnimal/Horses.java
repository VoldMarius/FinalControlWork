package PackAnimal;
import Classes.Pack;
import java.text.ParseException;
import java.time.LocalDate;
import java.util.List;

public class Horses extends Pack {

    enum PackType {}  ;
    public Horses(int packId, String PackType, String name, String command ,  String birthday) throws ParseException {
        super(packId, "Лошадь", name, command,birthday);

    }

    @Override
    public List<Pack> getAll() {
        return null;
    }

    @Override
    public Pack getById(int id) {
        return null;
    }

    @Override
    public int create(int type, String name, LocalDate date) {
        return 0;
    }

    @Override
    public int update(Pack item) {
        return 0;
    }

    @Override
    public void delete(int item) {

    }

    @Override
    public String toString() {
        return String.format("%d. %s: имя: %s, порода: %s, дата рождения: %s, навыки: %s",
                getPackId(), getClass().getSimpleName(), getName(), getBirthday(),getCommandList());
    }
}
