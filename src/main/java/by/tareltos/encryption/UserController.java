package by.tareltos.encryption;


import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@RestController
@RequestMapping("/users")

public class UserController {

    public List<User> getUsers() {
        return IntStream.range(1, 10)
                .mapToObj((i) -> new User(i, i + "_string", "UserName_" + i))
                .collect(Collectors.toList());
    }
}
