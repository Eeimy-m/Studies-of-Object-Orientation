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
    }

    public void addPlayer(Player player) {

    }

    public void removePlayer(Player player) {

    }

    public void substitute(Player substitute, Player starter) {

    }

    public void setCapitain(Player captain) {

    }

    public ArrayList<Player> getFieldedPlayes() {

    }

    public ArrayList<Player> getOutfieldedPlayers() {

    }

}
