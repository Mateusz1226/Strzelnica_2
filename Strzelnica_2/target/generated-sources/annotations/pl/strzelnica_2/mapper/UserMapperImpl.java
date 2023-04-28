package pl.strzelnica_2.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import pl.strzelnica_2.dto.UserDto;
import pl.strzelnica_2.entity.User;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-04-28T19:28:47+0200",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 18.0.2.1 (Oracle Corporation)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public User mapToEntity(UserDto userDto) {
        if ( userDto == null ) {
            return null;
        }

        User user = new User();

        user.setId( userDto.getId() );
        user.setPhoneNumber( userDto.getPhoneNumber() );
        user.setEmail( userDto.getEmail() );
        user.setPassword( userDto.getPassword() );
        user.setActive( userDto.getActive() );

        return user;
    }

    @Override
    public UserDto mapToDto(User user) {
        if ( user == null ) {
            return null;
        }

        UserDto userDto = new UserDto();

        userDto.setId( user.getId() );
        userDto.setEmail( user.getEmail() );
        userDto.setPassword( user.getPassword() );
        userDto.setPhoneNumber( user.getPhoneNumber() );
        userDto.setActive( user.getActive() );

        return userDto;
    }

    @Override
    public List<UserDto> mapToDto(List<User> users) {
        if ( users == null ) {
            return null;
        }

        List<UserDto> list = new ArrayList<UserDto>( users.size() );
        for ( User user : users ) {
            list.add( mapToDto( user ) );
        }

        return list;
    }
}
