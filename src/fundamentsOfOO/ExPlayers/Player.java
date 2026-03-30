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

    //TODO getNumber
    public int number() {
        return number;
    }

    public boolean isFielded() {
        return isFielded;
    }

    //Achei que não faz sentido fazer setters para name, position e number. Está correto?
    //TODO bringOn() - colocar em campo
    public void Fielded() {
        isFielded = true;
    }

    //TODO bringOff() - tirar de campo
    public void notFielded() {
        isFielded = false;
    }
}
