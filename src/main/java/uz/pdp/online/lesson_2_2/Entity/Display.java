package uz.pdp.online.lesson_2_2.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
public class Display {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String brand;

    private boolean curvedScreen;

    private String screenRefreshRate;

    private Integer diagonalScreen;

    private String videoType;

    private Integer responseTime;

    @ManyToOne
    private Product product;
}
