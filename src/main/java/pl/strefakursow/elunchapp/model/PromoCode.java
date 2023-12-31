package pl.strefakursow.elunchapp.model;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import pl.strefakursow.elunchapp.model.enums.DiscountUnit;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

@Data
@Builder
@NoArgsConstructor @AllArgsConstructor
@Entity
public class PromoCode {

    @Id
    @GeneratedValue
    private Long id;

    @Column(unique = true)
    @NotNull
    private UUID uuid;

    @NotBlank
    private String code;

    @Column(scale = 2, precision = 12)
    @Digits(integer = 10, fraction = 2)
    @Min(0)
    @NotNull
    private BigDecimal discount;

    @NotNull
    @Enumerated(EnumType.STRING)
    private DiscountUnit discountUnit;

    @Nullable
    @ManyToMany
    private List<User> users;

    @Nullable
    @ManyToMany
    private List<Restaurant> restaurants;

}
