package dev.bssallex.usuario.dtos.response;

import lombok.Builder;

import java.util.UUID;

@Builder
public record UsuarioResponse(UUID id, String nome, String email) {
}
