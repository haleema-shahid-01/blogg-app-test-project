package com.example.blogapp.DTOs;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

@RequiredArgsConstructor
@Getter
@Setter
public class CommentDTO {
    int id;
    String comment;
    List<String> attachments;
    UserDTO commenter;
    Timestamp creationDate;
    int likes;
    int replies;
}
