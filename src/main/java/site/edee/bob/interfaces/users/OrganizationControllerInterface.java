package site.edee.bob.interfaces.users;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import site.edee.bob.models.general.GeneralResponse;
import site.edee.bob.models.userManagement.OrganizationDTO;

public interface OrganizationControllerInterface {
    @ResponseBody ResponseEntity<GeneralResponse> create(OrganizationDTO userDTO);
    @ResponseBody ResponseEntity<GeneralResponse> delete(@PathVariable int id);
    @ResponseBody ResponseEntity<GeneralResponse> modify(@PathVariable int id ,OrganizationDTO userDTO);
}
