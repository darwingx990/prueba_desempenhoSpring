package com.riwi.pruebaSpringBoot.domain.entities;

import com.riwi.pruebaSpringBoot.utils.enums.MultimediaType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Multimedia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private MultimediaType type;
    @Column(nullable = false, columnDefinition = "TEXT")
    private String url;
    @Column(nullable = false)
    private LocalDateTime createdAt;
    @Column(nullable = false)
    private Boolean active;

    @ManyToOne
    @JoinColumn(name = "lesson_id", referencedColumnName = "id", nullable = false)
    private Lesson lessonId;
}
