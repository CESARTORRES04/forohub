package med.voll.api.domain.topico;

import jakarta.validation.constraints.*;

public record DatosRegistroTopico(
        @NotNull Long idUsuario,
        @NotBlank
        String mensaje,
        @NotBlank
        String nombreCurso,
        @NotBlank
        String titulo
) {
}
