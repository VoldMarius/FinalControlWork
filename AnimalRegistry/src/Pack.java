import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Pack {

    protected int petId;
    protected String name;
    protected String CommandList;
    protected LocalDate birthday;

    public void setPackId(int petId) {
        this.petId = petId;
    }

    public int getPackId() {
        return petId;
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

    public LocalDate getBirthdayDate(){
        return birthday;
    }

    public String getBirthday() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        return formatter.format(birthday);
    }

    @Override
    public String toString() {
        return String.format("%d. %s: имя: %s, дата рождения: %s ", getPackId(), getClass().getSimpleName(),
                name, getBirthday());
    }
}

