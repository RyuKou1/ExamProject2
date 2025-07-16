package creature;

import weapon.Weapon;

public abstract class Character implements Creature {
    private String name;
    private int hp;
    private Weapon weapon;

    public Character(String name, int hp) {
        if(hp < 0){
            throw new IllegalArgumentException("初期設定に誤りがあるため、キャラクターを作成できませんでした");
        } else {
            setName(name);
            setHp(hp);
        }
    }
    final public boolean isAlive(){
        return this.hp > 0;
    }
    public void showStatus(){
        System.out.println(this.name + " : HP " + this.hp);
    }
    public void setHp(int hp){
        if(hp < 0){
            this.hp = 0;
        } else {
            this.hp = hp;
        }
    }
    public int getHp(){
        return this.hp;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    void die(){
        System.out.println(getName() + "は死んでしまった！");
    }
}
