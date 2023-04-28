package pl.strzelnica_2.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import pl.strzelnica_2.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);

}