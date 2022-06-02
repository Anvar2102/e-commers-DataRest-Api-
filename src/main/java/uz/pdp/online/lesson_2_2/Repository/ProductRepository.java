package uz.pdp.online.lesson_2_2.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.online.lesson_2_2.Entity.Printer;
import uz.pdp.online.lesson_2_2.Entity.Product;
import uz.pdp.online.lesson_2_2.Projection.PrinterCustom;
import uz.pdp.online.lesson_2_2.Projection.ProductCustom;

@RepositoryRestResource(path = "product", excerptProjection = ProductCustom.class)
public interface ProductRepository extends JpaRepository<Product,Integer> {
}
