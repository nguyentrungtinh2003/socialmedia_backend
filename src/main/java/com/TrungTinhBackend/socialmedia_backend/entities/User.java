package com.TrungTinhBackend.socialmedia_backend.entities;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document(collation = "users")
public class User {
    @Id
    private String id;
    private String username;
    private String email;
    private String password;
    private String img;
    private List<String> friends;
    private List<String> followers;
    private List<String> following;
}
