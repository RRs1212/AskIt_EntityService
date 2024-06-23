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
public class Question extends BaseModel{

    @Column(nullable = false)
    private String body;

    @ManyToOne
    private User user;


    @ManyToMany
    @JoinTable(
            name = "question_topics",
            joinColumns = @JoinColumn(name = "question"),
            inverseJoinColumns = @JoinColumn(name = "topic"))
    private List<Topic> topics;


    @OneToMany(mappedBy = "question")
    private List<Answer> answer;

    @OneToMany(mappedBy = "question")
    private List<Comment> comments;

    @OneToMany(mappedBy = "question")
    private List<UpVote> upVote;

    @OneToMany(mappedBy = "question")
    private List<DownVote> downVote;





}
