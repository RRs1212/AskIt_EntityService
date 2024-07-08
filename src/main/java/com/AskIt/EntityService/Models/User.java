package com.AskIt.EntityService.Models;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User extends BaseModel{

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String password;

    private String bio;


    @OneToMany(mappedBy = "user")
    private List<Question> question;


    @OneToMany(mappedBy = "user")
    private List<Question> answer;

    @ManyToMany
    @JoinTable(
            name = "user_topics",
            joinColumns = @JoinColumn(name = "user"),
            inverseJoinColumns = @JoinColumn(name = "topic"))
    private List<Topic> topics;

    private Boolean notifyStatus;

    @OneToMany(mappedBy = "user")
    private List<Comment> comments;

    @OneToMany(mappedBy = "follower",cascade = CascadeType.ALL)
    private List<Follow> followers;

    @OneToMany(mappedBy = "followed",cascade = CascadeType.ALL)
    private List<Follow> following;





}
