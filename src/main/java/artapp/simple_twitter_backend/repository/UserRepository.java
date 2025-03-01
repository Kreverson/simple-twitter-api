package artapp.simple_twitter_backend.repository;

import artapp.simple_twitter_backend.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserRepository extends JpaRepository <User, UUID> {
}
