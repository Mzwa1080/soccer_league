
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

    Game currGame = new Game();
    currGame.homeTeam = team1;
    currGame.awayTeam = team2;
    
    Goal goal1 = new Goal();
    goal1.thePlayer = currGame.homeTeam.playerArray[2];
    goal1.theTeam = currGame.homeTeam;
    goal1.theTime = 55;
    
    Goal[] theGoals = {goal1};
    currGame.goals = theGoals;
    System.out.println("Goal scored after " +
    currGame.goals[0].theTime + " mins by " +
    currGame.goals[0].thePlayer.playerName + " of " +
    currGame.goals[0].theTeam.teamName);

    StringBuilder familyNameFirst = new StringBuilder();
    for(Player thePlayer : team2.playerArray){
        if (thePlayer.playerName.matches(".*Dla.*")) {
                System.out.println("Found        : " + thePlayer.playerName);
                System.out.println("Last name is : " + thePlayer.playerName.split(" ")[1]);
                String name[] = thePlayer.playerName.split(" ");
                familyNameFirst.append(name[1]);
                // System.out.println(familyNameFirst.append(name[1]));
                familyNameFirst.append(", ");
                familyNameFirst.append(name[0]);
                System.out.println(familyNameFirst);
            }
        }
    
    }
}
