package uz.pdp.online.lesson_2_2.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.online.lesson_2_2.Entity.Display;
import uz.pdp.online.lesson_2_2.Projection.DisplayCustom;

@RepositoryRestResource(path = "display", excerptProjection = DisplayCustom.class)
public interface DisplayRepository extends JpaRepository<Display,Integer> {
}
