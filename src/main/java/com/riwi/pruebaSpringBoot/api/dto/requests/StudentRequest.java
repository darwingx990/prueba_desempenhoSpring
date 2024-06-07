package com.riwi.pruebaSpringBoot.api.dto.requests;

import com.riwi.pruebaSpringBoot.domain.entities.ClassEntity;
import jakarta.validation.constraints.Email;
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
public class StudentRequest {
    // Implementation of VALIDATIONS
    @NotBlank(message = "Name is required")
    private String name;
    @NotBlank(message = "Email is required")
    @Email
    private String email;
    @NotNull(message = "The field 'Active' is required")
    private Boolean active;
    @NotNull(message = "Class must not be null.")
    private Long classId;
}
