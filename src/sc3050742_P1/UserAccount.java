package sc3050742_P1;

public class UserAccount {
    private String email;
    private String userName;

    //Relacionamentos
    private UserAccount[] followers;
    private Post[] myPosts;
    private Post[] timeline;

    //Contadores de controle dos relacionamentos
    private int numOfFollowers;
    private int numOfMyPosts;
    private int numOfTimelinePosts;

    public UserAccount(String email, String userName) {
        this.email = email;
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public String getEmail() {
        return email;
    }
}
