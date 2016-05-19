package sample;

/**
 * Created by Sulton on 5/16/2016.
 */
public class User {

    public String userName;
    public String userFullName;
    public int id;

    public User(int id, String userFullName, String userName) {
        this.id = id;
        this.userFullName = userFullName;
        this.userName = userName;
    }


    public User() {
    }

}
