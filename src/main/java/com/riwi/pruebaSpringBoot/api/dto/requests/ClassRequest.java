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
public class ClassRequest {
    // Implementation of VALIDATIONS
    @NotBlank(message = "Name is required")
    private String name;
    @NotBlank(message = "Description is required")
    private String description;
    @NotNull(message = "The field 'Active' is required")
    private Boolean active;

//    private List<Student> studentList;

}
