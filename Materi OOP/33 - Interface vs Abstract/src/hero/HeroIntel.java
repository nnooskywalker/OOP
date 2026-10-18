package hero;

public class HeroIntel extends Hero implements IAttackSkill, ISpellSkill{
    public HeroIntel(String name, double health){
        super(name, health);
    }

    public void attack(Hero enemy){
        System.out.println(this.getName() + " attacking " + enemy.getName());
    }

    public void spell(Hero enemy){
        System.out.println(this.getName() + " spelling " + enemy.getName());
    }
}
