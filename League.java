
public class League {
    public static void main(String args[]){
        Player player1 =  new Player();
        player1.playerName = "Robert Service";

        Player player2 = new Player();
        player2.playerName = "Mzwa Louw";

        Player player3 = new Player();
        player3.playerName = "Geoffrey Chaucer";


        Player player4 = new Player();
        player4.playerName = "Shawn Louw";

        Player player5 = new Player();
        player5.playerName = "Geoffrey Chaucer";


        Player[] thePlayers = {player1, player2, player3, player4, player5};

    Team team1 = new Team();
    team1.teamName = "The Greens";
    team1.playerArray = thePlayers;
//     ---------------------------- TEAM 2 ----------------------------------
    Team team2 = new Team();
    team2.teamName = "The Reds";
    team2.playerArray = new Player[5];
    team2.playerArray[0] = new Player();
    team2.playerArray[0].playerName = "Robert Service";

    team2.playerArray[1] = new Player();
    team2.playerArray[1].playerName = "Shawn Louw";

    team2.playerArray[2] = new Player();
    team2.playerArray[2].playerName = "Steven George";

    team2.playerArray[3] = new Player();
    team2.playerArray[3].playerName = "Geoffrey Chaucer";

    team2.playerArray[4] = new Player();
    team2.playerArray[4].playerName = "Joster Dladla";

    System.out.println("---------------------------- TEAM 1 ----------------------------------");

    for (Player thePLayer : team1.playerArray){
         System.out.println(thePLayer.playerName);
        }

    System.out.println();
    System.out.println("---------------------------- TEAM 2 ----------------------------------");

    for (Player thePlayerName : team2.playerArray){
            System.out.println(thePlayerName.playerName);
        }

    }
}
