package uz.pdp.online.lesson_2_2.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class GamingChairrr {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String brand;

    private String color;

    private Integer weightLimit;

    private boolean headrest;

    @ManyToOne
    private Product product;
}
