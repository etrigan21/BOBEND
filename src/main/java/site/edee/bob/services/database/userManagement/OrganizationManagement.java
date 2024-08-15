package site.edee.bob.services.database.userManagement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import site.edee.bob.interfaces.users.OrganizationServiceInterface;
import site.edee.bob.models.userManagement.Organizations;
import site.edee.bob.repositories.userManagement.OrganizationRepository;

public class OrganizationManagement implements OrganizationServiceInterface{

    @Autowired
    OrganizationRepository organizationRepository;

    @Override
    public List<Organizations> findAllById(List<Long> ids) {
        List<Organizations> organizations =  organizationRepository.findAllById(ids);
        return organizations;
    }
    
}
