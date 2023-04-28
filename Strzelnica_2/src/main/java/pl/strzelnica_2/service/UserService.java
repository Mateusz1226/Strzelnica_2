package pl.strzelnica_2.service;


import pl.strzelnica_2.dto.UserDto;
import pl.strzelnica_2.entity.User;

import java.util.List;

public interface UserService {
    void saveUser(UserDto userDto);

    User findUserByEmail(String email);

    List<UserDto> findAllUsers();
}
