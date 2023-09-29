/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programmingassignmentanswer2;

import java.util.Random;

/**
 *
 * @author User
 */
public class CharacterMoves {
    private String name;
    private int health;
    private int damage;

    public CharacterMoves(String name, int health, int damage) {
        this.name = name;
        this.health = health;
        this.damage = damage;
    }

    public void attack(CharacterMoves target) {
        int damageDealt = new Random().nextInt(damage) + 1;
        System.out.println(name + " Attacks " + target.getName() + " for " + damageDealt + " damage.");
        target.takeDamage(damageDealt);
    }

    public void takeDamage(int damage) {
        health -= damage;
    }

   public boolean isAlive() {
        return health > 0;
    }

   public String getName() {
        return name;
    }
    public int getDamage() {
        return damage;
    }

   public  int getHealth() {
        return health;
    }
}
