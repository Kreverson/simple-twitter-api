package artapp.simple_twitter_backend.repository;
import artapp.simple_twitter_backend.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
