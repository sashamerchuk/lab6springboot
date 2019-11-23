package ua.lviv.iot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.lviv.iot.model.Doctor;
@Repository
public interface DoctorRepository extends JpaRepository<Doctor,Integer> {
}
