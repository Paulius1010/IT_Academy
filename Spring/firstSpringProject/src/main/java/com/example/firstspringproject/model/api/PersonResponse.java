package com.example.firstspringproject.model.api;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PersonResponse {
    @Schema(description = "Person first name", example = "Karolis")
    private String firstName;
    @Schema(description = "Person las name", example = "xxx")
    private String lastName;
    @Schema(description = "Person email", example = "a@g.lt")
    private String email;
    @Schema(description = "Person phone", example = "869785423")
    private String phone;

}
