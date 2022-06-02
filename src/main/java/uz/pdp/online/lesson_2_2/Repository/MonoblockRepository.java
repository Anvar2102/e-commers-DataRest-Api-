package uz.pdp.online.lesson_2_2.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.online.lesson_2_2.Entity.Monoblock;
import uz.pdp.online.lesson_2_2.Projection.MonoblockCustom;

@RepositoryRestResource(path = "monoblock", excerptProjection = MonoblockCustom.class)
public interface MonoblockRepository extends JpaRepository<Monoblock,Integer> {
}
