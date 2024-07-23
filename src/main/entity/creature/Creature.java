package main.entity.creature;

import main.entity.Entity;

public abstract class Creature extends Entity {
    int hp;
    int speed;

    public abstract void makeMove();
}
