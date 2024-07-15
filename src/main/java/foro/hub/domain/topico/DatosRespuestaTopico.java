package foro.hub.domain.topico;

import java.time.LocalDateTime;

public record DatosRespuestaTopico(
        Long id,
        String mensaje,
        String topico,
        LocalDateTime fechaCreacion
){
    public DatosRespuestaTopico(Topico topico) {
        this(topico.getId(), topico.getMensaje(), topico.getTitulo(), topico.getFechaCreacion());
    }
}
