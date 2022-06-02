package uz.pdp.online.lesson_2_2.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.online.lesson_2_2.Entity.Display;
import uz.pdp.online.lesson_2_2.Entity.GamingChairrr;
import uz.pdp.online.lesson_2_2.Projection.DisplayCustom;
import uz.pdp.online.lesson_2_2.Projection.GamingChairCustom;

@RepositoryRestResource(path = "gaming_chair", excerptProjection = GamingChairCustom.class)
public interface GamingChairRepository extends JpaRepository<GamingChairrr,Integer> {
}
