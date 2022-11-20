package DZ.DZ1_OOP;

public class GetName {
    public static String getName() {
        String[] namesArray = new String[]{"Ivan", "John", "Navi", "LSEP", "Wolf", "Lennon", "Ringo", "Totoro",
                "Schwarzenegger", "Chelentano", "KarateKid", "Stallone", "Thrasher", "Barbarian", "Panteley", "Feofan",
                "Qwert", "Asdfg", "Gladiator", "Chuchelo"};
        return namesArray[(int) Math.floor(Math.random() * namesArray.length)];
    }
}
