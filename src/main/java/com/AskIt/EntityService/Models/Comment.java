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
public class Comment extends BaseModel{

    @Column(nullable = false)
    private String commentBody;

    @ManyToOne
    private User user;

    @ManyToOne
    private Question question;

    @ManyToOne
    private Answer answer;

    @ManyToOne
    @JoinColumn(name="parent_comment_id")
    private Comment parentComment;

    @OneToMany
    private List<Comment> repliesComment;

    @OneToMany(mappedBy = "comment")
    private List<UpVote> upVote;

    @OneToMany(mappedBy = "comment")
    private List<DownVote> downVote;


}
