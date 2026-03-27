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
        this.followers = new UserAccount[100];
        this.timeline = new Post[10];
        this.myPosts = new Post[100];
    }

    public void publish(String quote) {
        final Post post = new Post(this, quote);

        myPosts[numOfMyPosts++] = post;

        for (int i = 0; i < numOfFollowers; i++) {
            UserAccount follower = followers[i];
            follower.updateTimeline(post);
        }
    }

    public void updateTimeline(Post post) {
        timeline[numOfTimelinePosts % 10] = post;
        numOfTimelinePosts++;
    }

    public boolean delete(int postIndex) {
        if(postIndex < 0 || postIndex >= numOfMyPosts) return false;

        myPosts[postIndex] = myPosts[numOfMyPosts-1];
        myPosts[numOfMyPosts-1] = null;
        numOfMyPosts--;
        return true;
    }

    public void clapPost(int postIndex) {
        if(postIndex < 0 || postIndex >= Math.min(numOfTimelinePosts, 10)) return;
        timeline[postIndex].clap();
    }

    public void booPost(int postIndex) {
        if(postIndex < 0 || postIndex >= Math.min(numOfTimelinePosts, 10)) return;
        timeline[postIndex].boo();
    }

    private boolean isValidTimelineIndex(int postIndex) {
        return postIndex < 0 || postIndex >= Math.min(numOfTimelinePosts, 10);
    }

    public void blockFollower(UserAccount follower) {
        if(follower == null) return;

        for (int i = 0; i < numOfFollowers; i++) {
            UserAccount userAccount = followers[i];
            if(follower.getUserName().equals(follower.getUserName())) {

            }
        }
    }

    public String timelineAsString() {
        final StringBuilder builder = new StringBuilder()
    }

    public String myPostsAsString() {
        final StringBuilder builder = new StringBuilder("Timeline: ");

        for (int i = 0; i < numOfTimelinePosts; i++) {
            Post posts = myPosts[i];
            builder.append(posts.getAsString()).append("\n");

        }
    }

    public void acceptFollower(UserAccount newFollower) {
        followers[numOfFollowers++] = newFollower;
    }

    public String getUserName() {
        return userName;
    }

    public String getEmail() {
        return email;
    }
}
