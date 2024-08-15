package site.edee.bob.interfaces.users;
import java.util.List;
import site.edee.bob.models.userManagement.Organizations;
public interface OrganizationServiceInterface {
    List<Organizations> findAllById(List<Long> ids);
} 
