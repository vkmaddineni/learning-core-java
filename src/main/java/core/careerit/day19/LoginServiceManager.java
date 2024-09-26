package core.careerit.day19;

public class LoginServiceManager {
    public static void main(String[] args) {
        LoginService loginService = new LoginService();
        User user = loginService.login("admin", "admin");
        System.out.println("User logged in: " + user);

    }
}
