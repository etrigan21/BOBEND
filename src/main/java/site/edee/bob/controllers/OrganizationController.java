package site.edee.bob.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import site.edee.bob.interfaces.users.OrganizationControllerInterface;
import site.edee.bob.models.general.GeneralResponse;
import site.edee.bob.models.userManagement.OrganizationDTO;

@RestController
@RequestMapping("/super/organizations")
public class OrganizationController implements OrganizationControllerInterface{

    @Override
    public ResponseEntity<GeneralResponse> create(OrganizationDTO userDTO) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'create'");
    }

    @Override
    public ResponseEntity<GeneralResponse> delete(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

    @Override
    public ResponseEntity<GeneralResponse> modify(int id, OrganizationDTO userDTO) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'modify'");
    }
    
}
