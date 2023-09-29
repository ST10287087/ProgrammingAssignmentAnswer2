/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programmingassignmentanswer2;

public class HarbingerBossFight {
    public void start() {
        // Create player character
        Attackker player = new ActivePlayer("Player", 60, 5);

        // Create the boss
        Attackker boss = new Harbinger("Harbinger", 45);

        System.out.println("WELCOME TO THE FATUI HARBINGER BOSS BATTLE");
        System.out.println("IF YOU WANT TO LIVE DEFEAT THE BOSS");

        // Game loop
        while (((CharacterMoves) player).isAlive() && ((CharacterMoves) boss).isAlive()) {
            System.out.println(((CharacterMoves) player).getName() + " - HealthPoints = " + ((CharacterMoves) player).getHealth());
            System.out.println(((CharacterMoves) boss).getName() + " - HealthPoints  =  " + ((CharacterMoves) boss).getHealth());

            // Player's turn
            player.attack((CharacterMoves) boss);

            // Boss's turn
            if (((CharacterMoves) boss).isAlive()) {
                boss.attack((CharacterMoves) player);
            }
        }

        // Determine the winner
        if (((CharacterMoves) player).isAlive()) {
            System.out.println("I was meant for something more than this... the last words of the harbinger before they perished, CONGRATS COMRADE!");
            System.out.println("now you get the chance to win 1 of 5 prizes may the odds be in your favor, goodluck");
            String[] Prizes;
            Prizes = new String[6];
            Prizes[0] = "100000X Gold coins Obtained!";
            Prizes[1] = "YOU GOT NOTHING";
            Prizes[2] = "YOU GOT NOTHING!";
            Prizes[3] = "100000X Gold coins Obtained!";
            Prizes[4] = "YOU GOT NOTHING";
            Prizes[5] = "100000X Gold coins Obtained!";
            
            int num = (int) (Math.random()* 6);
            System.out.println("Congrasts!" + Prizes[num]);

        } else {
            System.out.println("You faced the lighting directly ,hmph commendable. as you hear the last words before you perished.Game over! ");
        }
    }  
}