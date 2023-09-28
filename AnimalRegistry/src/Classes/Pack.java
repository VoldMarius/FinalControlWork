package Classes;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

public abstract class Pack implements All_Registry<Pack> {

    protected int packId;
    protected String PackType;

    protected String name;
    protected String CommandList;
    protected LocalDate birthday;

    public Pack(int packId, String PackType, String name, String command, String birthday) {
    }

    public void setPackId(int petId) {
        this.packId = petId;
    }

    public int getPackId() {
        return packId;
    }

    public void setPackType(String PackType) {
        this.PackType = PackType;
    }

    public String getPackType() {
        return PackType;
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

            return String.format("%d. %s: имя: %s, дата рождения: %s ", getPackId(), getPackType(), getName(),
                    getCommandList(), getBirthday());
        }


    }

