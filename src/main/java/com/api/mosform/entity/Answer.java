package com.api.mosform.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@Entity
@Table(name = "questions")
public class Answer extends Base {

    @ManyToOne
    @JoinColumn(nullable = false)
    private FormResponse response;

    @OneToOne
    @JoinColumn(nullable = false)
    private Question question;

    @Column(nullable = false, length = 4096)
    private String answer;
}
