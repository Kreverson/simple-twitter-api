package artapp.simple_twitter_backend.repository;

import artapp.simple_twitter_backend.entities.Tweet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TweetRepository extends JpaRepository<Tweet, Long> {
}
