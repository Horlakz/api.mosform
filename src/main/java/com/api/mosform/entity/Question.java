package com.api.mosform.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@Entity
@Table(name = "questions")
public class Question extends Base {

    @Column(nullable = false, length = 256)
    private String name;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Form form;
}
