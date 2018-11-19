package entity;

public class User {
    private long id;
    private String login;
    private String password;

    public User(long id, String login, String pass){
        super();
        this.id = id;
        this.login=login;
        this.password = pass;
    }


    public void setId(long  id){
        this.id = id;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public long getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }
}
