package com.AskIt.EntityService.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.util.List;

@Entity
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Answer extends BaseModel{

    @Column(nullable = false)
    private String answer;

    @ManyToOne
    private User user;

    @ManyToOne
    private Question question;

    @OneToMany(mappedBy = "answer")
    private List<Comment> comments;

    @OneToMany(mappedBy = "answer")
    private List<UpVote> upVote;

    @OneToMany(mappedBy = "answer")
    private List<DownVote> downVote;



}
