package MySQL;

public enum ClassType {

    Вьючные,
    Домашние;
    public static ClassType getType (int classId){
        switch (classId){
            case 1:
                return ClassType.Вьючные;
            case 2:
                return ClassType.Домашние;
            default:
                return null;
        }
    }
}
