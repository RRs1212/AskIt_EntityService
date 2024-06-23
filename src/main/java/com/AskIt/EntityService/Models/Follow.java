package com.AskIt.EntityService.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.*;

@Entity
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Follow extends BaseModel{

    @ManyToOne
    private User follower;

    @ManyToOne
    private User followed;



}
