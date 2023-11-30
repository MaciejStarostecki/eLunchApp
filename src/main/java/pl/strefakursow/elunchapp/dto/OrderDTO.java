package pl.strefakursow.elunchapp.dto;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import pl.strefakursow.elunchapp.model.User;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

@Data
@Builder
@NoArgsConstructor @AllArgsConstructor
public class OrderDTO {

    @NotNull
    private UUID uuid;

    @Digits(integer = 10, fraction = 2)
    @Min(0)
    @NotNull
    private BigDecimal bruttoPrice;

    @Digits(integer = 10, fraction = 2)
    @Min(0)
    @NotNull
    private BigDecimal nettoPrice;

    @Nullable
    private PromoCodeDTO promoCodeDTO;

    @Digits(integer = 10, fraction = 2)
    @Min(0)
    @NotNull
    private BigDecimal amountToPayBrutto;

    @Nullable
    private String note;

    @NotNull
    @Embedded
    private OrderStatusDTO orderStatusDTO;

    @NotNull
    @Size(min = 1)
    private List<OrderItemDTO> orderItemDTOS;

    @NotNull
    private User user;

    @NotNull
    private DelivererDTO delivererDTO;

    @NotNull
    private RestaurantDTO restaurantDTO;

}
