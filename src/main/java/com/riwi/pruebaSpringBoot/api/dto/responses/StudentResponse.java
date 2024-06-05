package com.riwi.pruebaSpringBoot.api.dto.responses;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class StudentResponse {
    private Long id;
    private String name;
    private String email;
    private LocalDateTime createdAt;
    private Boolean active;
    private Long classId;
}
