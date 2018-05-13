package lv.va.sludinajumuportals.service;

import lv.va.sludinajumuportals.domain.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    int userCount = 20;
    public List<User> hardcodedUserList;

    public UserService() {
        hardcodedUserList = hardcodedUserInititialization();
    }

    public ArrayList<User> getUserList(){
        ArrayList<User> users = new ArrayList<>();
        User user = new User(1L , "Kristaps", "Naglis", "admin");

        users.add(user);
        return users;
    }

    public List<User> getUserListByName(String user) {
        List<User> filteredByName = new ArrayList<>();
        for (User user1 : hardcodedUserList) {
            if (user1.getName().matches(user)) {
                filteredByName.add(user1);
            }
        }
        return filteredByName;
    }

    private List<User> hardcodedUserInititialization() {
        List<User> users = new ArrayList<>();
        for (int i = 1; i < userCount; i++) {
            User user = new User((long) i, "Kristaps", "Naglis", "admin");
            users.add(user);
        }
        return users;

    }

}
