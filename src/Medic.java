public class Medic extends Hero{
    @Override
    public String applySuperAbility(String superAbility) {
        superAbility="Treatment";
        return "Medic apply his super-ability '"+superAbility+"'";
    }


}
