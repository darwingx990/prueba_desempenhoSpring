package com.riwi.pruebaSpringBoot.api.dto.responses;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class LessonResponse {
    private Long id;
    private String tittle;
    private String content;
    private LocalDateTime createdAt;
    private Boolean active;
    private Long classId;
}
