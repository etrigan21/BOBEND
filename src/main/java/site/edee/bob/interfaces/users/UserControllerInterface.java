package site.edee.bob.interfaces.users;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import site.edee.bob.models.general.GeneralResponse;
import site.edee.bob.models.userManagement.UserDTO;

public interface UserControllerInterface {
    @ResponseBody ResponseEntity<GeneralResponse> register(UserDTO userDTO);
    @ResponseBody ResponseEntity<GeneralResponse> login(UserDTO userDTO);
    @ResponseBody ResponseEntity<GeneralResponse> delete(@PathVariable int id);
    @ResponseBody ResponseEntity<GeneralResponse> modify(@PathVariable int id ,UserDTO userDTO);
    @ResponseBody ResponseEntity<GeneralResponse> invite(UserDTO userDTO);
}
