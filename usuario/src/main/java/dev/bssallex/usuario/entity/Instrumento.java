package dev.bssallex.usuario.entity;

import dev.bssallex.usuario.enums.Disponivel;
import dev.bssallex.usuario.enums.TipoInstrumento;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "TB_INSTRUMENTO")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Instrumento {

    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.AUTO)
    private java.util.UUID id;

    private String marca;

    private String modelo;

    @Enumerated(EnumType.STRING)
    private TipoInstrumento tipo;

    @Enumerated(EnumType.STRING)
    private Disponivel disponivel;
}
