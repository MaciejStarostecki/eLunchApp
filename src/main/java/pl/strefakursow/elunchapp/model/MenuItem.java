package pl.strefakursow.elunchapp.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.Data;
import pl.strefakursow.elunchapp.model.enums.VatTax;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

@Data
@Entity(name = "menuitems")
public class MenuItem {

    @Id
    @GeneratedValue
    private Long id;

    @Column(unique = true)
    @NotNull
    private UUID uuid;

    @NotBlank
    private String name;

    @Column(scale = 2, precision = 12)
    @Digits(integer = 10, fraction = 2)
    @Min(0)
    @NotNull
    private BigDecimal nettoPrice;

    @NotNull
    @Enumerated(EnumType.STRING)
    private VatTax vatTax;

    @Column(scale = 2, precision = 12)
    @Digits(integer = 10, fraction = 2)
    @Min(0)
    @NotNull
    private BigDecimal bruttoPrice;

    @NotNull
    @Size(min = 1)
    @ManyToMany
    private List<Dish> dishes;

    @NotNull
    @ManyToOne
    private Restaurant restaurant;

}
