package uz.pdp.online.lesson_2_2.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor

public class Laptop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String brand;

    private Integer RAM;

    private String CPU;

    private Integer SSD;

    private String videoCard;

    private String hardDisk;

    @ManyToOne
    private Product product;
}
