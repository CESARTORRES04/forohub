package med.voll.api.domain.medico;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDateTime;

public interface MedicoRepository extends JpaRepository<Medico,Long> {
    Page<Medico> findByActivoTrue(Pageable paginacion);
    //Primer cambio en intellij
    @Query("""
            SELECT m FROM medicos m
            where m.activo=1 and
             m.especialidad = :especialidad and
             m.id not in(
             select c.medico_id from Consulta c
             c.fecha=:fecha
             )
             order by rand()
             limit 1
            """)
    Medico seleccionarMedicoConEspecialidadEnFecha(Especialidad especialidad, LocalDateTime fecha);
}
