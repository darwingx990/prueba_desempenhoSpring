package com.riwi.pruebaSpringBoot.api.dto.requests;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class LessonRequest {
    // Implementation of VALIDATIONS
    @NotBlank(message = "Tittle is required")
    private String tittle;
    @NotBlank(message = "Content is required")
    private String content;
    @NotNull(message = "The field 'Active' is required")
    private Boolean active;
    @NotNull(message = "ClassId is required")
    private Long classId;
}
