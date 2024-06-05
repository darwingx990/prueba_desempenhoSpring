package com.riwi.pruebaSpringBoot.domain.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Lesson {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String tittle;
    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    @Column(nullable = false)
    private LocalDateTime createdAt;
    @Column(nullable = false)
    private Boolean active;

    @ManyToOne
    @JoinColumn(name = "class_id", referencedColumnName = "id", nullable = false)
    private Class classId;

    @OneToMany(mappedBy = "lessonId", cascade = CascadeType.ALL, orphanRemoval = false)
    @Builder.Default
    private List<Multimedia> multimedia = new ArrayList<>();


}

