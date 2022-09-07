public class Main {
    public static void main(String[] args) {
        Magic magic=new Magic();
        Medic medic=new Medic();
        Warrior warrior=new Warrior();
    HavingSuperAbility[] f={magic,medic,warrior};
    for(int i=0;i<f.length;++i){
        System.out.println(f[i].applySuperAbility("a"));
    }



    }
}