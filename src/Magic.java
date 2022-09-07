public class Magic extends Hero{
    @Override
    public String applySuperAbility(String superAbility) {
        superAbility="Magic Attack";
        return "Magic apply his super-ability '"+superAbility+"'";
    }
}
