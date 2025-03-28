package com.TrungTinhBackend.socialmedia_backend.entities;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "friendships")
public class Friendship {
    @Id
    private String id;
    private String senderId;
    private String receiverId;
    private String status; // pending, accepted, rejected
}
