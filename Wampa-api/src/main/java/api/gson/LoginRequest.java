package api.gson;

public class LoginRequest implements SerializableRequest{
    private String login;
    private String password;
    private String token;

    public boolean validate() {

        return notNullAndNotEmpty(login, password) || notNullAndNotEmpty(token);

    }
}
