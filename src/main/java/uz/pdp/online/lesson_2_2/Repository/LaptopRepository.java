package uz.pdp.online.lesson_2_2.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.online.lesson_2_2.Entity.Display;
import uz.pdp.online.lesson_2_2.Entity.Laptop;
import uz.pdp.online.lesson_2_2.Projection.DisplayCustom;
import uz.pdp.online.lesson_2_2.Projection.LaptopCustom;

@RepositoryRestResource(path = "laptop", excerptProjection = LaptopCustom.class)
public interface LaptopRepository extends JpaRepository<Laptop,Integer> {
}
