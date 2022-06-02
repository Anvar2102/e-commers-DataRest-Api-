package uz.pdp.online.lesson_2_2.Projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.online.lesson_2_2.Entity.Category;

@Projection(types = Category.class)
public interface CategoryCustom {
    Integer getId();

    String getName();

    Category getCategory();
}
