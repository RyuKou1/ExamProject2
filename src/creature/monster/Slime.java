package creature.monster;

final public class Slime extends Monster{
    public Slime(char suffix , int hp){
        super("スライム",suffix, hp);
    }
    @Override
    public void attack(Creature target){
        System.out.println("スライム"+getName()+"は体当たり攻撃！"+ target.getName()+"に5のダメージを与えた！");
        target.setHp(target.getHp()-5);
    }
}
