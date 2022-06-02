package uz.pdp.online.lesson_2_2.Projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.online.lesson_2_2.Entity.Computer;
import uz.pdp.online.lesson_2_2.Entity.Laptop;
import uz.pdp.online.lesson_2_2.Entity.Product;

@Projection(types = Laptop.class)
public interface LaptopCustom {
    Integer getId();

    String getBrand();

    Integer getRAM();

    String getCPU();

    Integer getSSD();

    String getVideoCard();

    String getHardDisk();

    Product getProduct();
}
