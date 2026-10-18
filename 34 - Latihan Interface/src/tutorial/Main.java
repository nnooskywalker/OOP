package tutorial;

import hero.HeroAgility;
import hero.AttackMelee;
import hero.AttackRange;


public class Main{
    public static void main(String[] args) {
        HeroAgility hero1 = new HeroAgility("Ucup", 100);
        HeroAgility hero2 = new HeroAgility("Otong", 20);
        hero1.setAttackSkill(new AttackMelee(100));
        hero2.setAttackSkill(new AttackRange(200, 10));

        hero1.display();
        hero2.display();

        hero1.attack(hero2);
        hero2.attack(hero1);
    }


}