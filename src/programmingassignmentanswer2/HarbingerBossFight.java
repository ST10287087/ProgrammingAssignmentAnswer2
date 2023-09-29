/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template


 @author ST10287087
 */
package programmingassignmentanswer2;

public class HarbingerBossFight {
    public void start() {
        // Active playerrr
        Attackker player = new ActivePlayer("Player", 60, 5);

        // startind boss
        Attackker boss = new Harbinger("Harbinger", 45);

        System.out.println("WELCOME TO THE FATUI HARBINGER BOSS BATTLE");
        System.out.println("IF YOU WANT TO LIVE DEFEAT THE BOSS");

        // this loops the game to see who will win
        while (((CharacterMoves) player).isAlive() && ((CharacterMoves) boss).isAlive()) {//shows use the current health points
            System.out.println(((CharacterMoves) player).getName() + " - HealthPoints = " + ((CharacterMoves) player).getHealth());
            System.out.println(((CharacterMoves) boss).getName() + " - HealthPoints  =  " + ((CharacterMoves) boss).getHealth());

            // your characters turn
            player.attack((CharacterMoves) boss);

            // HArbingers turn
            if (((CharacterMoves) boss).isAlive()) {
                boss.attack((CharacterMoves) player);
            }
        }

        
        if (((CharacterMoves) player).isAlive()) {//checks if player is alive or not
            System.out.println("I was meant for something more than this... the last words of the harbinger before they perished, CONGRATS COMRADE!");//bosses defeated message
            System.out.println("now you get the chance to win 1 of 5 prizes may the odds be in your favor, goodluck");//informas them of the lucky victory draw
            String[] Prizes;
            Prizes = new String[6]; //if the player wins they have a chnace of getting 1 of 5 rewards!
            Prizes[0] = "100000X Gold coins Obtained!";
            Prizes[1] = "YOU GOT NOTHING";
            Prizes[2] = "YOU GOT NOTHING!";
            Prizes[3] = "100000X Gold coins Obtained!";
            Prizes[4] = "YOU GOT NOTHING";
            Prizes[5] = "100000X Gold coins Obtained!";
            
            int num = (int) (Math.random()* 6);
            System.out.println("Congrasts!" + Prizes[num]);//random number generator to choose a prize

        } else {
            System.out.println("You faced the lighting directly ,hmph commendable. as you hear the last words before you perished.Game over! ");//bosses victory message
        }
    }  
}
