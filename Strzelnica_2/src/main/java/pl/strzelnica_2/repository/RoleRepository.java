package pl.strzelnica_2.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import pl.strzelnica_2.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

    Role findByName(String name);
}