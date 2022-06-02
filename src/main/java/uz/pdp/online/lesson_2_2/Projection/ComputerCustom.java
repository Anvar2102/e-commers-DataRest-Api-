package uz.pdp.online.lesson_2_2.Projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.online.lesson_2_2.Entity.Computer;
import uz.pdp.online.lesson_2_2.Entity.Product;

@Projection(types = Computer.class)
public interface ComputerCustom {
    Integer getId();

    String getMotherboard();

    Integer getRAM();

    String getCPU();

    Integer getSSD();

    String getVideoCard();

    String getHardDisk();

    Product getProduct();
}
