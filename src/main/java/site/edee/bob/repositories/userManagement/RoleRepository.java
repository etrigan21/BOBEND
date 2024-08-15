package site.edee.bob.repositories.userManagement;
import org.springframework.data.jpa.repository.JpaRepository;

import site.edee.bob.models.userManagement.UserRoles;

public interface RoleRepository extends JpaRepository<UserRoles, Long>{
    UserRoles findRoleByName(String name);
}
