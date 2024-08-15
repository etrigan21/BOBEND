package site.edee.bob.services.database.userManagement;

import org.springframework.beans.factory.annotation.Autowired;

import site.edee.bob.models.userManagement.Roles;
import site.edee.bob.models.userManagement.UserRoles;
import site.edee.bob.repositories.userManagement.RoleRepository;

public class RoleManagement {
    @Autowired 
    RoleRepository roleRepository;

    public void saveAllRoles(){
        for (Roles values : Roles.values()) {
            UserRoles userRoles = new UserRoles(values.name());
            roleRepository.save(userRoles);
        }
    }
}
