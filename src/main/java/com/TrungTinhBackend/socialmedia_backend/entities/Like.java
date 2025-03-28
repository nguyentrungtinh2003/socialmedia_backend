package com.TrungTinhBackend.socialmedia_backend.entities;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "likes")
public class Like {
    @Id
    private String id;
    private String postId;
    private String userId;
}
