/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programmingassignmentanswer2;

import java.util.Random;

/**
 *
 * @author ST10287087
 */
public class ActivePlayer extends CharacterMoves implements Attackker {
  
    public ActivePlayer(String name, int health, int damage) {
        super(name, health, damage);//players details
    }

    @Override//determines the players power
     public void attack(CharacterMoves target) {
        int damageDealt = new Random().nextInt(getDamage()) + 1;
        System.out.println(getName() + " attacks " + target.getName() + " for " + damageDealt + " damage.");
        target.takeDamage(damageDealt);
    }
}

