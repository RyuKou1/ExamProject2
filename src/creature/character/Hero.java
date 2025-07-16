package creature.character;

import creature.Creature;

public class Hero extends Character{
    public Hero(String name,int hp,String weapon) {
    }
    public void attack(Creature target) {
        System.out.println(getName() + "は" + getWeapon() + "で攻撃！" + target.getName() + "10のダメージを与えた！");
        target.setHp(target.getHp()-10);
    }
}
