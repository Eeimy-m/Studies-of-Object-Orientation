package fundamentsOfOO.ExPlayers;

public class Player {
    private String name, position;
    private int number;
    private boolean isFielded;

    public Player(String name, String position, int number, boolean isFielded) {
        this.name = name;
        this.position = position;
        this.number = number;
        this.isFielded = isFielded;
    }

    String getStateAsString(boolean isFielded) {
        if(isFielded)
            return  "Fielded";
        else
            return  "Not Fielded";
    }
}
