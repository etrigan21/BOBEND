package site.edee.bob.services.general;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import site.edee.bob.services.database.userManagement.RoleManagement;

public class ServiceSetup implements ApplicationListener<ContextRefreshedEvent>{
    @Autowired
    RoleManagement roleManagement;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        roleManagement.saveAllRoles();
    }
   
}
