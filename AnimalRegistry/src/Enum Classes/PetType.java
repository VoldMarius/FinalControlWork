package MySQL;

public enum PetType {

        Хомяк,
        Собака,
        Кошка;
        public static PetType getType (int typeId){
            switch (typeId){
                case 1:
                    return PetType.Хомяк;
                case 2:
                    return PetType.Собака;
                case 3:
                    return PetType.Кошка;
                default:
                    return null;
            }
        }
    }
