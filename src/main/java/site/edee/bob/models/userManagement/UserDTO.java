package site.edee.bob.models.userManagement;

import java.util.Set;

import jakarta.annotation.Nonnull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import java.util.List;
@Getter @Setter @AllArgsConstructor @NoArgsConstructor @RequiredArgsConstructor
public class UserDTO {
    @Nonnull
    private String email;
    @Nonnull
    private String password;
    @Nonnull
    private String firstName;
    @Nonnull
    private String lastName;
    private Set<Long> organizationIds;
    private List<Organizations> organizations;
}
