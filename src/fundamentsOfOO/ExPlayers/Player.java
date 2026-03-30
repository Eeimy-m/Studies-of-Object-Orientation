package fundamentsOfOO.ExPlayers;

public class Player {
    private final String name;
    private final String position;
    private final int number;
    private boolean isFielded;

    public Player(String name, String position, int number, boolean isFielded) {
        this.name = name;
        this.position = position;
        this.number = number;
        this.isFielded = isFielded;
    }

    String getStateAsString() {
        return String.format("%s %d %s %s", name, number, position, isFielded ? "Fielded" : "Not fielded");
    }

    public String getName() {
        return name;
    }

    public String position() {
        return position;
    }

    public int getNumber() {
        return number;
    }

    public boolean isFielded() {
        return isFielded;
    }

    public void bringOn() {
        isFielded = true;
    }

    public void bringOff() {
        isFielded = false;
    }
}
