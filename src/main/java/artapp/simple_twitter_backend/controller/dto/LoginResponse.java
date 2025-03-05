package artapp.simple_twitter_backend.controller.dto;

public record LoginResponse(String accessToken, Long expiresIn) {
}
