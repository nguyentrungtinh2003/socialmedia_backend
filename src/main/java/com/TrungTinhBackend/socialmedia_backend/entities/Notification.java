package com.TrungTinhBackend.socialmedia_backend.entities;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@Document(collection = "notifications")
public class Notification {
    @Id
    private String id;
    private String userId;
    private String type;
    private String message;
    private String img;
    private LocalDateTime createdAt;
}
