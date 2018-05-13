package lv.va.sludinajumuportals.resource;

import lv.va.sludinajumuportals.dao.UserRepository;
import lv.va.sludinajumuportals.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    UserRepository userRepository;

    @GetMapping("/users")
    public String getUsers(Map<String, Object> model) {
        model.put("userList", userService.getUserList());
        return "usersui";
    }

}
