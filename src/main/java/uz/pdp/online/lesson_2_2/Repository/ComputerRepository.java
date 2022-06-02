package uz.pdp.online.lesson_2_2.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.online.lesson_2_2.Entity.Computer;
import uz.pdp.online.lesson_2_2.Projection.ComputerCustom;

@RepositoryRestResource(path = "computer", excerptProjection = ComputerCustom.class)
public interface ComputerRepository extends JpaRepository<Computer,Integer> {
}
