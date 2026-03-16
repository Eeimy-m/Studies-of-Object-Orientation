package fundamentsOfOO;

public class Player {
    private String name, position;
    private int number;
    private boolean isFielded;

    public Player() {

    }

    String getStateAsString(boolean isFielded) {
        if(isFielded)
            return  "Fielded";
        else
            return  "Not Fielded";
    }
}
