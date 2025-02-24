package org.example.rpg1_0;

public class Player extends Entity {
    public Player() {
        this.hp = 100;
        this.mp = 50;
        this.id = 0;
        this.maxHp = 100;
        this.maxMp = 50;
        this.name = "Player";
        this.display = new displayValue(this.maxHp, this.hp);
    }
}
