package pl.strzelnica_2.mapper;

import org.mapstruct.Mapper;
import pl.strzelnica_2.dto.UserDto;
import pl.strzelnica_2.entity.User;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {

    User mapToEntity(UserDto userDto);
    UserDto mapToDto (User user);
    List<UserDto> mapToDto(List<User> users);

}
