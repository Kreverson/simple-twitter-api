package artapp.simple_twitter_backend.controller.dto;

public record FeedItemDto(Long tweetId, String content, String username) {
}
