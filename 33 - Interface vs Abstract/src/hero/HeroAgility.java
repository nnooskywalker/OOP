package hero;
// kalau pakai ABSAttackSkill tidak bisa multiple inheritance
public class HeroAgility extends Hero implements IAttackSkill{
    public HeroAgility(String name, double health){
        super(name, health);
    }

    public void attack(Hero enemy){
        System.out.println(this.getName() + " attacking " + enemy.getName());
    
    }

    
}
