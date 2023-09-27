public enum PackType {

    Camel,
    Horse,
    Donkey ;
    public static PackType getType (int typeId){
        switch (typeId){
            case 1:
                return PackType.Camel;
            case 2:
                return PackType.Horse;
            case 3:
                return PackType.Donkey;
            default:
                return null;
        }
    }
}
