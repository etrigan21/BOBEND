package site.edee.bob.repositories.userManagement;

import org.springframework.data.jpa.repository.JpaRepository;

import site.edee.bob.models.userManagement.Organizations;

public interface OrganizationRepository extends JpaRepository<Organizations, Long> {
    
}
