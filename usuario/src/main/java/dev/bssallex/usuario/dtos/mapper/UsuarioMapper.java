package dev.bssallex.usuario.dtos.mapper;

import dev.bssallex.usuario.dtos.request.UsuarioRequest;
import dev.bssallex.usuario.dtos.response.UsuarioResponse;
import dev.bssallex.usuario.entity.Usuario;
import lombok.experimental.UtilityClass;

@UtilityClass
public class UsuarioMapper {

    public static Usuario toRequest(UsuarioRequest request){
        return Usuario.builder()
                .nome(request.nome())
                .email(request.email())
                .build();
    }

    public static UsuarioResponse toResponse(Usuario usuario){
        return UsuarioResponse.builder()
                .id(usuario.getId())
                .nome(usuario.getNome())
                .email(usuario.getEmail())
                .build();
    }
}
