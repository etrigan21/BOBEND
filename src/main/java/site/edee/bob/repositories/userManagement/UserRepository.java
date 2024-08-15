package site.edee.bob.repositories.userManagement;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import site.edee.bob.models.userManagement.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

}
