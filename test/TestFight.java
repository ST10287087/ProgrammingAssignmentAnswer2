/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

import programmingassignmentanswer2.ActivePlayer;
import programmingassignmentanswer2.CharacterMoves;
import programmingassignmentanswer2.Harbinger;
/*
@author ST10287087
*/
 
public class TestFight {
    
    @Test
    public void testCharacterMovesInitialization() { //testes the characters attacks and moves
        CharacterMoves character = new CharacterMoves("Character", 100, 10);
        assertEquals("Character", character.getName());
        assertEquals(100, character.getHealth());
        assertEquals(10, character.getDamage());
        assertTrue(character.isAlive());
    }
    
    @Test
    public void testActivePlayerAttack() {
        CharacterMoves player = new ActivePlayer("Player", 100, 10);
        CharacterMoves harbinger = new Harbinger("Harbinger", 50);
        
        player.attack(harbinger);
        assertTrue(harbinger.getHealth() < 50); // checks if harbinger has taken damage
    }
    
    @Test
    public void testHarbingerAttack() { //checks if harbinger atacks the player
        CharacterMoves player = new ActivePlayer("Player", 100, 10);
        CharacterMoves harbinger = new Harbinger("Harbinger", 50);
        
        harbinger.attack(player);
        assertTrue(player.getHealth() < 100); // Player should have taken damage
    }
}
