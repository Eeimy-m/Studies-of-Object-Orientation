package fundamentsOfOO;

import java.util.ArrayList;

public class Team {
    private String name, baseLocation, coachName;
    private ArrayList<Player> players = new ArrayList<>();

    public Team() {}

    public Team(String name, String baseLocation, String coachName) {
        this.name = name;
        this.baseLocation = baseLocation;
        this.coachName = coachName;
        this.players = new ArrayList<>();
    }

    public void addPlayer(Player player) {
        if(players.size() < 18)
            players.add(player);
        else
            System.out.println("The team is already full.");
    }

    public void removePlayer(Player player) {
        if(players.size() > 0)
            players.remove(player);
        else
            System.out.println("The team is empty.");
    }

    public void substitute(Player substitute, Player starter) {
        if(players.contains(substitute) && players.contains(starter)) {

        }
    }

    public void setCapitain(Player captain) {

    }

    public ArrayList<Player> getFieldedPlayes() {

    }

    public ArrayList<Player> getOutfieldedPlayers() {

    }

}
