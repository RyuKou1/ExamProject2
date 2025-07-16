import creature.character.Hero;

import java.util.ArrayList;

public class GameMaster {
    public static void main(String[] args) {
        ArrayList<Character> party = new ArrayList<>();
        ArrayList<Monster> monsters = new ArrayList<>();

        Hero h = new Hero("勇者",100,"剣");
        party.add(h);
        Wizard w = new Wizard("魔法使い",60,20);
        party.add(w);
        Thief t = new Thief("盗賊",70);
        party.add(t);
        Matango m = new Matango('A',45);
        monsters.add(m);
        Goblin g = new Goblin('A',50);
        monsters.add(g);
        Slime s = new Slime('A',40);
        monsters.add(s);

        System.out.println("---味方パーティ---");
        h.showStatus();
        w.showStatus();
        t.showStatus();
        System.out.println("---敵グループ---");
        m.showStatus();
        g.showStatus();
        s.showStatus();

        System.out.println("\n味方の総攻撃！");
        for(Character i : party){
            for(Monster j : monsters){
                i.attack(j);
            }
        }

        System.out.println("\n敵の総攻撃！");
        for(Monster j : monsters){
            for(Character i : party){
                j.attack(i);
            }
        }

        System.out.println("\nダメージを受けた勇者が突然光りだした！");
        System.out.println("勇者はスーパーヒーローに進化した！");
        SuperHero superHero = new SuperHero(h);
        party.set(0,superHero);
        for(Monster j : monsters){
            superHero.attack(j);
        }

        System.out.println("\n---味方パーティー最終ステータス---");
        for(Character i : party){
            i.showStatus();
            if(i.isAlive()){
                System.out.println("生存状況 : 生存");
            } else {
                System.out.println("生存状況 : 戦闘不能");
            }
        }

        System.out.println("\n---敵グループ最終ステータス---");
        for(Monster j : monsters){
            j.showStatus();
            if(j.isAlive()){
                System.out.println("生存状況 : 生存");
            } else {
                System.out.println("生存状況 : 討伐済み");
            }
        }
    }
}
