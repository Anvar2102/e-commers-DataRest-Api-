package uz.pdp.online.lesson_2_2.Projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.online.lesson_2_2.Entity.Laptop;
import uz.pdp.online.lesson_2_2.Entity.Monoblock;
import uz.pdp.online.lesson_2_2.Entity.Product;

@Projection(types = Monoblock.class)
public interface MonoblockCustom {
    Integer getId();

    String getBrand();

    Integer getRAM();

    String getCPU();

    Integer getSSD();

    String getScreenSize();

    String getHardDisk();

    Product getProduct();
}
