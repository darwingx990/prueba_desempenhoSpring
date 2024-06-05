package com.riwi.pruebaSpringBoot.api.dto.requests;

import com.riwi.pruebaSpringBoot.utils.enums.MultimediaType;
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
public class MultimediaRequest {
    // Implementation of VALIDATIONS
    @NotNull(message = "The field 'Type' is required.")
    private MultimediaType type;
    @NotBlank(message = "Url is required.")
    private String url;
    @NotNull(message = "The field 'Active' is required.")
    private Boolean active;
    @NotNull(message = "LessonId is required.")
    private Long LessonId;
}
