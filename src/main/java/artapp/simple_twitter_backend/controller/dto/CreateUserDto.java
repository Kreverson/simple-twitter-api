package artapp.simple_twitter_backend.controller.dto;

import artapp.simple_twitter_backend.entities.User;

public record CreateUserDto(String username, String password) {
}
