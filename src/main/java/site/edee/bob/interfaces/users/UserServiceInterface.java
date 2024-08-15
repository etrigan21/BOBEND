package site.edee.bob.interfaces.users;

import site.edee.bob.models.userManagement.User;
import site.edee.bob.models.userManagement.UserDTO;

public interface UserServiceInterface {
    User findUserByUsername(String username);
    User findById(long id);
    void createUser(UserDTO userDTO);
    void deleteUserById(long id);
    User modifyUser(UserDTO userDTO);    
} 
