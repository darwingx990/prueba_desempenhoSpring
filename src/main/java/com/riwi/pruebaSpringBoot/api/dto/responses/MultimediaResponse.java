package com.riwi.pruebaSpringBoot.api.dto.responses;

import com.riwi.pruebaSpringBoot.utils.enums.MultimediaType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MultimediaResponse {
    private Long id;
    private MultimediaType type;
    private String url;
    private LocalDateTime createdAt;
    private Boolean active;
    private Long LessonId;
}
