public enum PetType {

        Hamster,
        Dog,
        Cat;
        public static PetType getType (int typeId){
            switch (typeId){
                case 1:
                    return PetType.Hamster;
                case 2:
                    return PetType.Dog;
                case 3:
                    return PetType.Cat;
                default:
                    return null;
            }
        }
    }
