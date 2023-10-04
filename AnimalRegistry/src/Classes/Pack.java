package Classes;

<<<<<<< HEAD
=======
import MySQL.ClassType;
import MySQL.PackType;

>>>>>>> origin/main
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;


<<<<<<< HEAD
public class Pack extends BaseAnimal {

    private String name;
    private int mainClass;
    private int type;
    private LocalDate birthday;
    private String Commands  ;
    public Pack(  String name,   int mainClass, int type, LocalDate birthday, String Commands) throws ParseException {
             super(  name,  1, type,  birthday,   Commands);
    }

    public void setPackType(int type) {
        this.type =  type ;
    }

    public int getPackType() {
        return  type;
    }

    public int getClassType() { return 1 ;}


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
            String str = getName()  + " " + getClassType() + " " + getPackType()  + " " +
                 new SimpleDateFormat("yyyy-MM-dd").format(birthday) + " " + String.join(" / ",Commands);
            return str;
        }
    public String getSkills() {
        return this.Commands;
    }

    public void setSkills(String skills) {
        this.Commands = skills;
    }


}

=======
public abstract class Pack extends BaseAnimal {
    int packId;
    String name;
    ClassType mainClass;
    int type;
    LocalDate birthday;
    ArrayList Commands  ;
    public Pack(int packId, String name,   ClassType Type, int type, LocalDate birthday, ArrayList Commands)
            throws ParseException {
        super(packId, name,  Type, type,  birthday,   Commands);
    }

        public void setPackId(int packId) {
            this.packId = packId;
        }

        public int getPackId() {
            return packId;
        }
        public void setPackType(int type) {
            this.type =  type ;
        }
         public int getPackType() {
        return type;
        }

        public ClassType getClassType() {
            return ClassType.Вьючные;
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
            String str = getPackId() + " " + getName()  + " " + getClassType() + " " + getPackType()  + " " +
                 new SimpleDateFormat("yyyy-MM-dd").format(birthday) + " " + String.join(" / ",Commands);
            return str;
        }

    public Pack createNewPack(int packId, String name, ClassType Type, int type, LocalDate birthday, ArrayList Commands) {

        Pack pack = createNewPack( packId,  name,  Type, type, birthday, Commands);
        pack.setPackId(packId);
        pack.setName(name);
        pack.setPackType(type);
        pack.setBirthday(birthday);
        pack.setSkills(Commands);

        return  pack ;

     }
    }

>>>>>>> origin/main
