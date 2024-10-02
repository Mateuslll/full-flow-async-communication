package com.mateuslll.microuser.dto;

import jakarta.validation.constraints.NotBlank;

import java.util.UUID;

public record UserDTO(@NotBlank String name,
                      @NotBlank String email) {
}
