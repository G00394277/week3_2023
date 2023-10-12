package ie.atu.week3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService us) {this.userService = us;}

    @GetMapping("newUser/{name}/{email}")
    public String getUser(@PathVariable String name, @PathVariable String email)
    {
        userService.registerUser(name, email);
        return "Please wait";
    }

    @PostMapping("registerUserBody")
    public Map<String, String> registerUserBody(@RequestBody UserDetails userDetails)
    {
        String confirm = (userDetails.getName() + userDetails.getEmail());
        Map<String, String> responseMessage = new HashMap<>();
        responseMessage.put("message",confirm);
        return responseMessage;
    }
}
