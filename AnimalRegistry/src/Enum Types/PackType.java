package AnimalTypes;

public enum PackType {

    Верблюд,
    Лошадь,
    Осел ;
    public static PackType getType (int typeId){
        switch (typeId){
            case 1:
                return PackType.Верблюд;
            case 2:
                return PackType.Лошадь;
            case 3:
                return PackType.Осел;
            default:
                return null;
        }
    }
}
