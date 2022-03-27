package com.example.firstspringproject.model.api;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.lang.NonNull;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
public class CreatePersonRequest {


        @Schema(description = "Person first name", example = "Karolis")
        @NonNull
        @Size(min = 3, max = 20)
        private String firstName;
        @Schema(description = "Person las name", example = "Julius")
        private String middleName;
        @Schema(description = "Person middle name", example = "xxx")
        @NonNull
        @Pattern(regexp = "^[a-zA-Z]+$")
        private String lastName;
        @Schema(description = "Person email", example = "a@g.lt")
        private String email;
        @Schema(description = "Person phone", example = "869785423")
        private String phone;

}
