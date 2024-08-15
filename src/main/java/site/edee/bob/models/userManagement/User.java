package site.edee.bob.models.userManagement;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.Set;
@Getter @Setter @NoArgsConstructor @AllArgsConstructor // <--- THIS is it
@Entity(name = "bob_users")
public class User {
    @Id
    private long id;
    @Column(name="email")
    private String email;
    @Column(name="password")
    private String password;
    @Column(name="firstName")
    private String firstName;
    @Column(name = "lastName")
    private String lastName;
    @ManyToMany
    @Column(name = "organizations")
    @JoinTable(name = "bob_UserOrganization", joinColumns = @JoinColumn(name="user_id"), inverseJoinColumns = @JoinColumn(name="org_id"))
    private Set<Organizations> organizations;
    @OneToOne(fetch = FetchType.EAGER)
    @JoinTable(name = "bob_user_roles", joinColumns = @JoinColumn(name="user_id"), inverseJoinColumns = @JoinColumn(name="role_id"))
    private UserRoles role;
}
