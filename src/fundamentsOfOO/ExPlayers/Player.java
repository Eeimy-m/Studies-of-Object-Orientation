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

    //TODO adicionar métodos getters para todas as variáveis privadas. (ok)
    // TODO adicionar setters para as variáveis que fizer sentido mudar. Faz sentido poder alterar a posição? E o número?

   // TODO, descrever todo o estado do objeto como uma string, não precis parâmetro. Por exemplo: "João da Silva, 10, Defensor, em campo". "Chico Picadinho, Atacante, 23, no banco."
    String getStateAsString(boolean isFielded) {
        if(isFielded)
            return  "Fielded";
        else
            return  "Not Fielded";
    }

    public String getName() {
        return name;
    }

    public String position() {
        return position;
    }

    public int number() {
        return number;
    }

    public boolean isFielded() {
        return isFielded;
    }
}
