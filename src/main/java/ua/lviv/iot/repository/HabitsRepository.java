package ua.lviv.iot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.lviv.iot.model.Habits;
@Repository
public interface HabitsRepository extends JpaRepository<Habits,Integer> {
}
