public class Warrior extends Hero{
    @Override
    public String applySuperAbility(String superAbility) {
        superAbility="Criticsl Damage";
        return "Warrior apply his super-ability '"+superAbility+"'";
    }
}
