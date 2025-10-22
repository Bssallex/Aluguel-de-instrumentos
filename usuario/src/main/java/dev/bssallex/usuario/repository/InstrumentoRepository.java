package dev.bssallex.usuario.repository;

import dev.bssallex.usuario.entity.Instrumento;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface InstrumentoRepository extends JpaRepository<Instrumento, UUID> {
}
