package creature.character;

public class Hero extends Character{
    public Hero(String name,int hp,String weapon) {
        super(name,hp);
        setWeapon(weapon);
    }
    public void attack(Creature target) {
        System.out.println(getName() + "は" + getWeapon() + "で攻撃！" + target.getName() + "10のダメージを与えた！");
        target.setHp(target.getHp()-10);
    }
    public void setWeapon(String weapon){
        this.weapon = weapon;
    }
    public String getWeapon(){
        return this.weapon;
    }
}
