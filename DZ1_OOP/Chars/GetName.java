package DZ.DZ1_OOP.Chars;

public class GetName {
    public static String getName() {
        String[] namesArray = new String[]{"Ivan", "John", "Navi", "LowSocioeconomicPeasant", "Wolf", "Lennon", "Ringo", "Totoro",
                "Schwarzenegger", "Chelentano", "KarateKid", "Stallone", "Thrasher", "Barbarian", "Panteley", "Feofan",
                "Qwert", "Asdfg", "Gladiator", "Chuchelo", "Mr Black", "Heisenberg", "Pinkman", "Saul", "Goodman", "Silent Bob", "Jay"};
        return namesArray[(int) Math.floor(Math.random() * namesArray.length)];
    }
}
