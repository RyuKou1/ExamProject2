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

}
