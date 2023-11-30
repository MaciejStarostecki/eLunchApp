package pl.strefakursow.elunchapp.dto;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import pl.strefakursow.elunchapp.model.enums.VatTax;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

@Data
@Builder
@NoArgsConstructor @AllArgsConstructor
public class MenuItemDTO {

    @NotNull
    private UUID uuid;

    @NotBlank
    private String name;

    @Digits(integer = 10, fraction = 2)
    @Min(0)
    @NotNull
    private BigDecimal nettoPrice;

    @NotNull
    @Enumerated(EnumType.STRING)
    private VatTax vatTax;

    @Digits(integer = 10, fraction = 2)
    @Min(0)
    @NotNull
    private BigDecimal bruttoPrice;

    @NotNull
    @Size(min = 1)
    private List<DishDTO> dishDTOS;

    @NotNull
    private RestaurantDTO restaurantDTO;

}
