package ma.fsm.jpaap.repositories;

import ma.fsm.jpaap.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Long> {
}


