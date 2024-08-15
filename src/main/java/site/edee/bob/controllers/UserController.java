package site.edee.bob.controllers;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import site.edee.bob.interfaces.users.UserControllerInterface;
import site.edee.bob.models.general.GeneralResponse;
import site.edee.bob.models.general.GeneralResponseStatus;
import site.edee.bob.models.userManagement.UserDTO;

@RestController
@RequestMapping("/api/users")
public class UserController implements UserControllerInterface{
    @GetMapping("/health-check")
    public @ResponseBody ResponseEntity<GeneralResponse> healthCheck(){
        GeneralResponse response = new GeneralResponse(GeneralResponseStatus.SUCCESS,(Object) "Alive");
        return new ResponseEntity<GeneralResponse>(response, HttpStatus.OK);
    }

    @PostMapping("/register")
    public @ResponseBody ResponseEntity<GeneralResponse> register(@RequestBody UserDTO userDTO){
        GeneralResponse response =  new GeneralResponse(GeneralResponseStatus.SUCCESS, userDTO);
        return new ResponseEntity<GeneralResponse>(response, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<GeneralResponse> login(UserDTO userDTO) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'login'");
    }

    @Override
    public ResponseEntity<GeneralResponse> delete(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

    @Override
    public ResponseEntity<GeneralResponse> modify(int id, UserDTO userDTO) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'modify'");
    }

    @Override
    public ResponseEntity<GeneralResponse> invite(UserDTO userDTO) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'invite'");
    }


}
