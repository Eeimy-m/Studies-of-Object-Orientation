package sc3050742_P1;
import java.time.LocalDateTime;

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
