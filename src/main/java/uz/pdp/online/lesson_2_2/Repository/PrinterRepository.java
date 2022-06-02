package uz.pdp.online.lesson_2_2.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.online.lesson_2_2.Entity.Laptop;
import uz.pdp.online.lesson_2_2.Entity.Printer;
import uz.pdp.online.lesson_2_2.Projection.LaptopCustom;
import uz.pdp.online.lesson_2_2.Projection.PrinterCustom;

@RepositoryRestResource(path = "printer", excerptProjection = PrinterCustom.class)
public interface PrinterRepository extends JpaRepository<Printer,Integer> {
}
