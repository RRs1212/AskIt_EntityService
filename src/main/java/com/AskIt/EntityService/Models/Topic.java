package com.AskIt.EntityService.Models;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.*;

import java.util.List;

@Entity
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Topic extends BaseModel {

    @Column(nullable = false)
    private String name;

    @ManyToMany(mappedBy = "topics")
    private List<User> user;

    @ManyToMany(mappedBy = "topics",cascade = CascadeType.PERSIST)
    private List<Question> question;

}
