package core.careerit.day19;

import java.util.List;

public class LoginService {
    private List<User> userList;
    private java.util.Map<String, User> map;
    public LoginService() {
        //userList = JsonUtil.loadUserData();
        //map = userList.stream().collect(Collectors.toMap(User::getUsername, Function.identity()));
    }

    public User login(String username, String password) {
        User user = map.get(username);
        if(user !=null &&  user.getPassword().equals(password)){
            return user;
        }
        return null;
    }
}
