package sc3050742_P1;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Post {
    private String quote;
    private LocalDateTime timesTamp;
    private int clap;
    private int boo;
    private UserAccount userAccount;

    public Post(UserAccount user, String quote) {
        this.userAccount = user;
        this.quote = quote;
        this.timesTamp = LocalDateTime.now();
    }

    public String getAsString() {
        var formatter = DateTimeFormatter.ofPattern("dd/MM/yy - hh:mm");
        return String.format(" [%s] %s" + "says \"%s\" | Claps: %d | Boos: %d",
                timesTamp, userAccount.getUserName(), quote, clap, boo);
    }

    public void clap() {
        clap++;
    }

    public void boo() {
        boo++;
    }

    public String getQuote() {
        return quote;
    }

    public LocalDateTime getTimesTamp() {
        return timesTamp;
    }

    public int getClap() {
        return clap;
    }

    public int getBoo() {
        return boo;
    }

    public String getUserName() {
        return userAccount.getUserName();
    }
}
