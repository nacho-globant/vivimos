package vivimos.janssen.com.mvp.model;


public class LoginModel {


    public boolean isValidUser(String user, String password) {
        return ("people@gmail.com".equalsIgnoreCase(user) && "1234".equalsIgnoreCase(password));
    }
}
