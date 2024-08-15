package site.edee.bob.services.database.userManagement;

import site.edee.bob.interfaces.users.UserServiceInterface;
import site.edee.bob.models.userManagement.User;
import site.edee.bob.models.userManagement.UserDTO;

public class UserDataManagement implements UserServiceInterface{

    @Override
    public User findUserByUsername(String username) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findUserByUsername'");
    }

    @Override
    public User findById(long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findById'");
    }

    @Override
    public void createUser(UserDTO userDTO) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createUser'");
    }

    @Override
    public void deleteUserById(long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteUserById'");
    }

    @Override
    public User modifyUser(UserDTO userDTO) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'modifyUser'");
    }
    
}
