package uz.pdp.online.lesson_2_2.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
public class Computer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String motherboard;

    private Integer RAM;

    private String CPU;

    private Integer SSD;

    private String videoCard;

    private String hardDisk;

    @ManyToOne
    private Product product;
}
