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
public class Harbinger extends CharacterMoves implements Attackker {//this class is a child class which determine the deatils of the boss (Harbinger)
   public  Harbinger (String name, int health) {
        super(name, health, 5); // The boss has 5 damage
    }

    @Override
    public void attack(CharacterMoves target) {
        int damageDealt = new Random().nextInt(getDamage()) + 2;
        System.out.println(getName() + " attacks " + target.getName() + " for " + damageDealt + " damage.");
        target.takeDamage(damageDealt);
    }
}
