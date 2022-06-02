package uz.pdp.online.lesson_2_2.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
public class Monoblock {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String brand;

    private Integer RAM;

    private String CPU;

    private String screenSize;

    private Integer SSD;

    private String hardDisk;

    @ManyToOne
    private Product product;
}
