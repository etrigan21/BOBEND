package site.edee.bob.models.userManagement;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor
@Entity(name = "bob_organizations")
public class Organizations {
    @Id 
    private long id;
    @Column(name = "name")  
    private String name;
    @Column(name="location")
    private String location;
    @ManyToMany(mappedBy = "organizations")
    Set<User> users;
}
