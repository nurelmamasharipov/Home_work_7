public class Medic extends Hero {
    int healPoints;

    public void increaseExperience(){
        healPoints += healPoints * 0.1;
    }
    @Override
    public void applySuperAbility() {
        System.out.println("Medic применил супер способность HELP TEAMMATES");
    }

    @Override
    public String ability(String ability) {
        return "";
    }
}
