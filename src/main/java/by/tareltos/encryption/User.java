package by.tareltos.encryption;

public class User {

    private Integer userId;
    private String stringUserId;
    private String userName;

    public User(Integer userId, String stringUserId, String userName) {
        this.userId = userId;
        this.stringUserId = stringUserId;
        this.userName = userName;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getStringUserId() {
        return stringUserId;
    }

    public void setStringUserId(String stringUserId) {
        this.stringUserId = stringUserId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
