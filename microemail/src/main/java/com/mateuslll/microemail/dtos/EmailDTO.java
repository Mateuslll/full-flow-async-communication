package com.mateuslll.microemail.dtos;

import java.util.UUID;

public record EmailDTO(UUID userId, String emailTo, String subject, String text) {
}
