package uz.pdp.online.lesson_2_2.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
public class Printer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String brand;

    private boolean isColorfull;

    private String twoSidedPrinting;

    private String deviceFunction;

    private String maxFormat;

    private String nonColorPrintingSpeed;

    private String colorPrintingSpeed;

    private String printingTechnology;

    private String connectivity;

    @ManyToOne
    private Product product;
}
