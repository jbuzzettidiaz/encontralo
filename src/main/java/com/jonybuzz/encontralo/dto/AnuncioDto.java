package com.jonybuzz.encontralo.dto;

import com.jonybuzz.encontralo.model.Color;
import com.jonybuzz.encontralo.model.Especie;
import com.jonybuzz.encontralo.model.FranjaEtaria;
import com.jonybuzz.encontralo.model.Pelaje;
import com.jonybuzz.encontralo.model.Raza;
import com.jonybuzz.encontralo.model.Tamanio;
import com.jonybuzz.encontralo.model.TipoAnuncio;
import com.jonybuzz.encontralo.model.Ubicacion;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.Set;

@Data
@Builder
public class AnuncioDto {

    private Long id;

    private TipoAnuncio tipo;

    private String nombreMascota;

    private Especie especie;

    private Raza raza;

    private Tamanio tamanio;

    private FranjaEtaria franjaEtaria;

    private Set<Color> colores;

    private Boolean tieneCollar;

    private Pelaje pelaje;

    private Set<ImagenDownloadDto> fotos;

    private Ubicacion ubicacion;

    private String comentario;

    private String telefonoContacto;

    private LocalDateTime fechaCreacion;

}
