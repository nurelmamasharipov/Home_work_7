public class Warrior extends Hero{
    @Override
    public void applySuperAbility() {
        System.out.println("Warrior применил супер способность CRITICAL DAMAGE");
    }

    @Override
    public String ability(String ability) {
        return "";
    }
}
