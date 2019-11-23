package ua.lviv.iot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.lviv.iot.model.Patient;
@Repository
public interface PatientRepository extends JpaRepository<Patient, Integer> {
}
